package com.company.certification.blankFactor.util.properties;

import com.company.certification.blankFactor.exceptions.BlankFactorException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BlankFactorProperties {

    private static Properties prop = null;

    private BlankFactorProperties() {
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
                prop.load(new FileReader(strFilePath + "/blankfactor.properties"));
            } catch (IOException e) {
                throw new BlankFactorException(e);
            }
        }
    }



}
