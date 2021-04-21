package com.educacionit.spring.beginning.class01.container;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkManager implements InitializingBean {

    private HttpURLConnection connection;
    private String urlStr;

    private static final Logger logger = Logger.getLogger(NetworkManager.class);

    public NetworkManager() {
        super();
    }

    public void setUrlStr(String urlStr) {
        this.urlStr = urlStr;
    }

    public void afterPropertiesSet() {
        if (this.urlStr == null) {
            throw new BeanCreationException("URL no set...");
        }
        URL obj;
        try {
            obj = new URL(this.urlStr);
            this.connection = (HttpURLConnection) obj.openConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        try {
            int responseCode = this.connection.getResponseCode();
            logger.info("Response code: " + responseCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}