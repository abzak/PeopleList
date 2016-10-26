/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author zakariae.chentouf
 */
public class PropertiesReader {

    public static String readPropertie(String key, String filepath) {
        String propLoaded = null;
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream(filepath);
             prop.load(input);
             propLoaded = prop.getProperty(key);  
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return propLoaded;
    }
}
