package com.github.canal.client.interfaces;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * canal 的事件接口层（表数据改变）
 */
@FunctionalInterface
public interface CanalEventListener {


    /**
     * 处理事件
     *
     * @param destination 指令
     * @param schemaName  库实例
     * @param tableName   表名
     * @param rowChange   详细参数
     * @return
     */
    void onEvent(String destination, String schemaName, String tableName, CanalEntry.RowChange rowChange);

}
