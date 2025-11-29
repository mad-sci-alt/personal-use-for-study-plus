package Enum;

/**
 * @author 张 书航
 */

enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY
            ("星期三"),THURSDAY("星期四"),FRIDAY
            ("星期五"),SATURDAY("星期六"),SUNDAY
            ("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class ClassExercise {
    public static void main(String[] args) {
        System.out.println("===所有星期信息如下===");
        for (Week week : Week.values()) {
            System.out.println(week);
        }
    }
}
