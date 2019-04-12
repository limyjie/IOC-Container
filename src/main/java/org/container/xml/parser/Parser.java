/**
 * Author: lin
 * Date: 2019/4/12 10:30
 */
package org.container.xml.parser;

import org.container.xml.mapper.Beans;
import org.container.xml.mapper.GlobalConfig;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.net.URI;
import java.net.URL;

/**
 * <p></p>
 */
public class Parser {

    private static Serializer serializer;

    private Parser() {

    }

    public static <T> T xml2Object(String fileName, Class<T> type) {

        if (serializer == null) {
            synchronized (Parser.class) {
                if (serializer == null) {
                    serializer = new Persister();
                }
            }
        }
        fileName = Parser.class.getClassLoader().getResource(fileName).getFile();


        File file = new File(fileName);

        if(!file.exists()){
            System.out.println("系统找不到指定的文件");
        }

        try {
            return serializer.read(type, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }


}
