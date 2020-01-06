package com.github.canal.event;

import com.alibaba.otter.canal.protocol.CanalEntry;

public interface CanalEventListener {

    /**
     * run when event was fired
     *
     * @param eventType eventType
     * @param rowData rowData
     */
    void onEvent(CanalEntry.EventType eventType, CanalEntry.RowData rowData);

}
