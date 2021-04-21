package com.educacionit.spring.beginning.class01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import org.apache.log4j.Logger;

@Service("inventoryServiceBean")
public class InventoryServiceImpl implements IInventoryService {

    private ICrud dao = null;

    private static final Logger logger = Logger.getLogger(InventoryServiceImpl.class);

    public InventoryServiceImpl() {
        super();
    }


    @Autowired
    @Qualifier("inventoryDaoBean")
    public void setInventoryDao(ICrud dao) {
        this.dao = dao;
    }


    /* (non-Javadoc)
     * @see com.educacionit.spring.beginning.class01.service.IInventoryService#add (java.lang.String)
     */
    @Override
    public void add(String item) {
        logger.info("Adding ".concat(item));
        this.dao.add(item);
    }
}