package SimulatePackagedStream;

/**
 * @author 张 书航
 */
public class Test {
    public static void main(String[] args) {
        BufferedReader_ fileReader = new BufferedReader_(new FileReader_(5));
        fileReader.readFile();
        BufferedReader_ stringReader = new BufferedReader_(new StringReader_(10));
        stringReader.readString();
    }
}
