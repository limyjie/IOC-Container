/**
 * Author: lin
 * Date: 2019/4/10 23:58
 */
package org.container.util;

import org.container.xml.mapper.Beans;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;

/**
 *<p>read data form global-config.xml to GlobalConfig.class</p>
 *
 */
public class XMLReader {


    private void test() throws  Exception{
        Serializer serializer = new Persister();
        File file = new File(this.getClass().getClassLoader().getResource("beans.xml").toURI());
        Beans beans = serializer.read(Beans.class,file);
        System.out.println(beans.getBeanList().get(1).getId());
        System.out.println(beans.getBeanList().get(1).getClassName());
    }

    public static void main(String[] args) throws Exception {
        new XMLReader().test();
    }



}
