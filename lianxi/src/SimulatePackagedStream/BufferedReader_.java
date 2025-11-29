package SimulatePackagedStream;

/**
 * @author 张 书航
 * 处理流（包装流）的工作模式，即是装饰器模式，将多个节点流进行包装，
 */
public class BufferedReader_ extends Reader_ {
    private Reader_ reader;

    public BufferedReader_(Reader_ reader) {
        this.reader = reader;
    }

    @Override
    public void readFile() {
        reader.readFile();
    }

    @Override
    public void readString() {
        reader.readString();
    }
}
