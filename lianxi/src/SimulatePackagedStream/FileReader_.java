package SimulatePackagedStream;

/**
 * @author 张 书航
 * 构造用来读取文件的节点流
 */
public class FileReader_ extends Reader_ {
    private int times;

    public FileReader_(int times) {
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public void readFile() {
        for (int i = 0; i < this.times; i++) {
            System.out.println("喵喵~" + (i + 1));
        }
        System.out.println("使用FileReader_类读取了文件," +
                "一共读取了" + this.times + '次');
    }
}
