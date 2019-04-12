/**
 * Author: lin
 * Date: 2019/4/12 9:44
 */
package org.container.xml.mapper;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 *<p></p>
 *
 */
public class Bean {

    @Attribute
    private String id;

    @Attribute
    private String className;

    @ElementList(required = false,inline = true)
    private List<Property> propertyList;

    @ElementList(required = false,inline = true)
    private List<Dependency> dependencyList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public List<Dependency> getDependencyList() {
        return dependencyList;
    }

    public void setDependencyList(List<Dependency> dependencyList) {
        this.dependencyList = dependencyList;
    }
}
