/**
 * Author: lin
 * Date: 2019/4/12 11:27
 */
package org.container.core;


import org.container.util.Logger;
import org.container.xml.mapper.*;
import org.container.xml.parser.Parser;


import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 */
public class ClassPathXMLContainer implements Container {

    private Map<String, Object> beanMap = null;
    private GlobalConfig globalConfig;

    public ClassPathXMLContainer(String globalConfigFile) throws Exception {

        this.globalConfig = Parser.xml2Object(globalConfigFile, GlobalConfig.class);

        Beans beans = Parser.xml2Object(globalConfig.getBeansFile().getFile(), Beans.class);
        beanMap = new HashMap<String, Object>();
        for (Bean bean : beans.getBeanList()) {

            Class clazz = Class.forName(bean.getClassName());
            Object object = clazz.newInstance();

            for (Property property : bean.getPropertyList()) {
                String methodName = "set" + property.getName().substring(0, 1).toUpperCase() + property.getName().substring(1);

                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(object, property.getValue());

            }
            if (bean.getDependencyList() != null) {
                for (Dependency dependency : bean.getDependencyList()) {

                    Object object1 = beanMap.get(dependency.getId());
                    String methodName = "set" + dependency.getName().substring(0, 1).toUpperCase() + dependency.getName().substring(1);
                    System.out.println(methodName);
                    Method method = clazz.getMethod(methodName, object1.getClass());
                    method.invoke(object,object1);
                }
            }

            beanMap.put(bean.getId(), object);
        }

    }

    public Object getBean(String beanID) {
        return beanMap.get(beanID);
    }
}
