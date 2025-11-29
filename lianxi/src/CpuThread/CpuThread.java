package CpuThread;

/**
 * @author 张 书航
 */
public class CpuThread {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前运行环境下计算机Cpu核心数
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums);
    }
}
