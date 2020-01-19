package com.github.canal.client.core;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.github.canal.client.abstracts.option.AbstractDBOption;
import com.github.canal.client.interfaces.CanalEventListener;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 处理 Canal 监听器
 */
@SuppressWarnings("all")
public class DealCanalEventListener implements CanalEventListener {
	
	/**
	 * 头结点
	 */
	private AbstractDBOption header;

	public DealCanalEventListener(AbstractDBOption... dbOptions) {
		AbstractDBOption tmp = null;
		for (AbstractDBOption dbOption : dbOptions) {
			if (tmp != null) {
				tmp.setNext(dbOption);
			} else {
				this.header = dbOption;
			}
			tmp = dbOption;
		}
		
	}
	
	public DealCanalEventListener(List<AbstractDBOption> dbOptions) {
		if (CollectionUtils.isEmpty(dbOptions)) {
			return;
		}
		AbstractDBOption tmp = null;
		for (AbstractDBOption dbOption : dbOptions) {
			if (tmp != null) {
				tmp.setNext(dbOption);
			} else {
				this.header = dbOption;
			}
			tmp = dbOption;
		}
	}
	
	/**
	 * 处理数据库的操作
	 *
	 * @param destination
	 * @param schemaName
	 * @param tableName
	 * @param rowChange
	 * @return
	 */
	@Override
	public void onEvent(String destination, String schemaName, String tableName, CanalEntry.RowChange rowChange) {
		this.header.doChain(destination, schemaName, tableName, rowChange);
	}
	
	
}
