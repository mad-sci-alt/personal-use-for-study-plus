package Map_;

import java.util.Properties;

/**
 * @author 张 书航
 */
public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.put("zsh", null);
        } catch (Exception e) {
           e.getMessage();
        }
        ///Properties类继承Hashtable
        properties.put("zsh", "张书航");
        properties.put("zsh", "张书航");
        System.out.println( properties);
    }
}
