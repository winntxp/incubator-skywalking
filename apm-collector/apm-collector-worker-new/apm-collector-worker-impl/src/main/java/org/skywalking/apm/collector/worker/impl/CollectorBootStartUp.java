package org.skywalking.apm.collector.worker.impl;

import org.skywalking.apm.collector.core.config.ConfigException;
import org.skywalking.apm.collector.core.framework.CollectorStarter;
import org.skywalking.apm.collector.core.framework.DefineException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pengys5
 */
public class CollectorBootStartUp {

    private static final Logger logger = LoggerFactory.getLogger(CollectorBootStartUp.class);

    public static void main(String[] args) throws ConfigException, DefineException {
        logger.info("collector starting...");
        CollectorStarter starter = new CollectorStarter();
        starter.start();
    }
}
