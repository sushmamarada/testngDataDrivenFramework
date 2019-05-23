package org.automation.testingworld.utility;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {

    @Test
    public static String fetchPropertyValue(String key, String fileName) throws IOException {
        InputStream input= Utility.class.getClassLoader().getResourceAsStream(fileName);
        //System.out.println(input);
        Properties prop=new Properties();
        if (input == null)
        {
            System.out.println("Sorry, unable to find config.properties");
            return null;
        }

        //load a properties file from class path, inside static method
        prop.load(input);

        //get the property value and print it out       
        return prop.getProperty(key);

    }

}
