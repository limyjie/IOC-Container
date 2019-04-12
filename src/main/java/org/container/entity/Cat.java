/**
 * Author: lin
 * Date: 2019/4/10 23:55
 */
package org.container.entity;

/**
 *<p></p>
 *
 */
public class Cat {
    private String name;
    private String category;

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
