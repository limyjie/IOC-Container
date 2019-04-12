/**
 * Author: lin
 * Date: 2019/4/11 0:28
 */
package org.test;

import org.container.core.ClassPathXMLContainer;
import org.container.core.Container;
import org.container.entity.Cat;
import org.container.entity.Person;

/**
 *<p></p>
 *
 */
public class ContainerTest {



    public static void main(String[] args)throws Exception {

        Container container = new ClassPathXMLContainer("global-config.xml");

        Cat cat = (Cat)container.getBean("cat");
        Person person = (Person)container.getBean("person");

        System.out.println(cat.toString());
        System.out.println(person.toString());

    }
}
