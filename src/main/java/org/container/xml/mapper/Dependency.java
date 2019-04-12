/**
 * Author: lin
 * Date: 2019/4/12 9:51
 */
package org.container.xml.mapper;

import org.simpleframework.xml.Attribute;

/**
 *<p></p>
 *
 */
public class Dependency {

    @Attribute
    private String name;

    @Attribute
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
