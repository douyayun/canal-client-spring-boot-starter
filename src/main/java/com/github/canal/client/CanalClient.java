package com.github.canal.client;

public interface CanalClient {

    /**
     * open the canal client
     * to get the config and connect to the canal server (1 : 1 or 1 : n)
     * and then  transfer the event to the special listener
     * */
    void start();

    /**
     * stop the client
     */
    void stop();

    /**
     * is running
     * @return yes or no
     */
    boolean isRunning();
}
