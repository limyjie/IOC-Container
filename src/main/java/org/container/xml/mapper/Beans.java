/**
 * Author: lin
 * Date: 2019/4/12 9:44
 */
package org.container.xml.mapper;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 *<p></p>
 *
 */

@Root
public class Beans {

    @ElementList(inline = true)
    private List<Bean> list;



    public List<Bean> getBeanList() {
        return list;
    }

    public void setBeanList(List<Bean> list) {
        this.list = list;
    }
}
