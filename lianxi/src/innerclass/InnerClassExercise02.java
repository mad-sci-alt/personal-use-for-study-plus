package innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone.getCellphone();
    }

}

interface Bell {
    void ring();
}

class Cellphone {
    private static Cellphone cellphone;

    private Cellphone() {
    }

    public static void getCellphone() {
        if (cellphone == null) {
            cellphone = new Cellphone();
        }

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("下面方法所属的运行类为 " + getClass());
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("下面方法所属运行类为 " + getClass());
                System.out.println("小伙伴上课了");
            }
        });

    }

    public void alarmClock(Bell bell) {
        bell.ring();
    }

}