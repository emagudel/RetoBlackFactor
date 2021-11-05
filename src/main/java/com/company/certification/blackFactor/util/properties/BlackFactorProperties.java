package com.company.certification.blackFactor.util.properties;

import com.company.certification.blackFactor.exceptions.BlackFactorException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BlackFactorProperties {

    private static Properties prop = null;

    private BlackFactorProperties() {
        throw new IllegalStateException();

    }

    public static String getUrlFront() {
        loadProperties();
        return prop.getProperty("UrlFront");

    }

    public static void loadProperties() {
        if (prop == null) {
            prop = new Properties();
            File objclasspathRoot = new File(System.getProperty("user.dir"));
            String strFilePath = objclasspathRoot.getAbsolutePath();

            try {
                prop.load(new FileReader(strFilePath + "/blackfactor.properties"));
            } catch (IOException e) {
                throw new BlackFactorException(e);
            }
        }
    }



}
