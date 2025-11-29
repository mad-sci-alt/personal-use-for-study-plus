package annotation;

/**
 * @author 张 书航
 */
@SuppressWarnings("unused")
interface Display {
    void show();
}
@SuppressWarnings("all")
enum Color implements Display {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int blueValue, greenValue, redValue;

    Color(int blueValue, int greenValue, int redValue) {
        this.blueValue = blueValue;
        this.greenValue = greenValue;
        this.redValue = redValue;
    }

    @Override
    public void show() {
        System.out.println(this.name() + "的三原色值为" + blueValue + ","
                + greenValue + "," + redValue);
    }
}
@SuppressWarnings("all")
/// 两种写法任君选择
///public class Homework08 {
///    public static void main(String[] args) {
///        Color[] name = Color.values();
///        for (Color color : name){
///            color.show();
///        }
///    }
///}
public class Homework08 {
    public static void main(String[] args) {
        Color[] name = Color.values();
        for (Color color : name) {
            String type = color.name();
            switch (type) {
                case "BLACK":
                    color.show();
                    break;
                case "RED":
                    color.show();
                    break;
                case "YELLOW":
                    color.show();
                    break;
                case "BLUE":
                    color.show();
                    break;
                case "GREEN":
                    color.show();
                    break;
                default:
                    System.out.println("当前色谱中没有此颜色");
            }
        }
    }
}