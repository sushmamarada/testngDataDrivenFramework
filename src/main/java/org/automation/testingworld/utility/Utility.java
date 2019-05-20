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
        Properties prop=new Properties();
        if (input == null)
        {
            System.out.println("Sorry, unable to find config.properties");
            return null;
        }

        //load a properties file from class path, inside static method
        prop.load(input);

        //get the property value and print it out

        //System.out.println(prop.getProperty(key));        

        return prop.getProperty(key);

       /* FileInputStream file=new FileInputStream("./Config/config.properties");
        Properties property=new Properties();
        property.load(file);
        return property.get(key).toString();*/
    }
   /* public static String fetchLocatorValue(String key)throws IOException{

        FileInputStream file=new FileInputStream("./Config/Elements.properties");
        Properties property=new Properties();
        property.load(file);
        return property.get(key).toString();
    }*/
}
