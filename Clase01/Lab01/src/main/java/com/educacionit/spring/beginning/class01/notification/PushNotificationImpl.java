package com.educacionit.spring.beginning.class01.notification;

import org.apache.log4j.Logger;

public class PushNotificationImpl implements INotification {

    private static final Logger logger = Logger.getLogger(PushNotificationImpl.class);

    public PushNotificationImpl() {
        super();
    }


    /* (non-Javadoc)
     * @see com.educacionit.spring.beginning.class01.notification.INotification#send (java.lang.String)
     */
    @Override
    public void send(String m) {
        logger.info("Sending notification by push method to ".concat(m));
    }
}