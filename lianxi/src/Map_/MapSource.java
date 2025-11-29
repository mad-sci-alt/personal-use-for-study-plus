package Map_;

import java.util.Map;

/**
 * @author 张 书航
 */
public class MapSource {
    public static void main(String[] args) {
        Map.Entry entry = new Map.Entry() {
            @Override
            public Object getKey() {
                return null;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object setValue(Object value) {
                return null;
            }
        };
        entry.getKey();

    }
}
