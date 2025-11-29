package SimulatePackagedStream;

/**
 * @author 张 书航
 * 构造用来读取String类型的节点流
 */
public class StringReader_ extends Reader_ {
    private int times;

    public StringReader_(int times) {
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public void readString() {
        for (int i = 0; i < this.times; i++) {
            System.out.println("汪汪！" + (i + 1));
        }
        System.out.println("使用StringReader_读取了文件,一共读取了"
                + times + '次');
    }
}
