package com.educacionit.spring.beginning.class01.service;

import org.springframework.stereotype.Component;

import org.apache.log4j.Logger;

@Component("inventoryDaoBean")
public class InventoryDaoImpl implements ICrud {

    private static final Logger logger = Logger.getLogger(AppNotificationXML.class);

    public InventoryDaoImpl() {
        super();
    }


    /* (non-Javadoc)
     * @see com.educacionit.spring.beginning.class01.service.ICrud#add (java.lang.String)
     */
    @Override
    public void add(String item) {
        logger.info(item.concat(" Added"));
    }
}