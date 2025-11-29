package List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张 书航
 */
@SuppressWarnings({"all"})
public class ArrayListSource_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        new Books();
    }
}

class Paper {
    int hard;
    int vary;

    Paper() {
        System.out.println("Paper的无参构造被调用");
    }

    public Paper(int hard, int vary) {
        this.hard = hard;
        this.vary = vary;
    }
}

class Books extends Paper {
    Books() {
        this(10);
    }

    Books(int hard) {
        this(hard, 0);
    }

    Books(int hard, int var) {

    }
}