package my.eden.helloworld;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by eden90267 on 2016/5/31.
 */
public class HelloWorld {

    static Log logger = LogFactory.getLog(HelloWorld.class);

    public static void main(String[] args) {
        logger.info("Hello World");
    }

}
