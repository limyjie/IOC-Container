/**
 * Author: lin
 * Date: 2019/4/12 14:26
 */
package org.container.util;

import java.util.logging.Level;

/**
 *<p></p>
 *
 */
public class Logger {

    public static void log(String msg){

        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(methodName);
        logger.log(Level.INFO,"Method: "+methodName+" Msg: "+msg);
    }

}
