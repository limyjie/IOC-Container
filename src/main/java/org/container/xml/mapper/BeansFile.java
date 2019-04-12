/**
 * Author: lin
 * Date: 2019/4/12 10:27
 */
package org.container.xml.mapper;

import org.simpleframework.xml.Attribute;

/**
 *<p></p>
 *
 */
public class BeansFile {

    @Attribute
    private String file;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
