/**
 * Author: lin
 * Date: 2019/4/10 23:57
 */
package org.container.entity;

/**
 *<p></p>
 *
 */
public class Person {
    private String name;
    private Cat cat;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
