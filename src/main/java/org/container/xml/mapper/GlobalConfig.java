/**
 * Author: lin
 * Date: 2019/4/12 10:20
 */
package org.container.xml.mapper;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *<p></p>
 *
 */

@Root
public class GlobalConfig {

    @Element(name = "beans-file")
    private BeansFile beansFile;

    public BeansFile getBeansFile() {
        return beansFile;
    }

    public void setBeansFile(BeansFile beansFile) {
        this.beansFile = beansFile;
    }
}
