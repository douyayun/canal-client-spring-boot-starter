package com.github.canal.client.transfer;

import com.alibaba.otter.canal.client.CanalConnector;
import com.github.canal.client.ListenerPoint;
import com.github.canal.config.CanalConfig;
import com.github.canal.event.CanalEventListener;

import java.util.List;
import java.util.Map;

public interface TransponderFactory {

    /**
     * @param connector connector
     * @param config config
     * @param listeners listeners
     * @param annoListeners annoListeners
     * @return MessageTransponder
     */
    MessageTransponder newTransponder(CanalConnector connector, Map.Entry<String, CanalConfig.Instance> config, List<CanalEventListener> listeners,
                                      List<ListenerPoint> annoListeners);
}
