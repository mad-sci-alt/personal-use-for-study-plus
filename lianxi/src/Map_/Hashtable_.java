package Map_;

import java.util.Hashtable;

/**
 * @author 张 书航
 */
public class Hashtable_ {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        try {
            hashtable.put("01", "zsh");
            hashtable.put(null, "张书航");
            ///Hashtable的键值对都不能为null
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
