/**
 * Author: lin
 * Date: 2019/4/12 9:50
 */
package org.container.xml.mapper;

import org.simpleframework.xml.Attribute;

/**
 *<p></p>
 *
 */
public class Property {
    @Attribute
    private String name;

    @Attribute
    private String value;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
