package class_and_object;

class Path0{
    // 简化后的版本：从(1,1)到(6,5)寻找路径
    public boolean isGet(int[][] map, int i, int j) {
        // 边界检查
        if (i < 0 || i >= map.length || j < 0 || j >= map[0].length) {
            return false;
        }
        
        // 如果到达目标位置(6,5)
        if (i == 6 && j == 5) {
            map[i][j] = 2; // 标记路径
            return true;
        }

        // 检查当前位置是否可以走（0表示可走，1表示墙，2表示已走过的路径）
        if (map[i][j] == 0) {
            // 标记当前位置为已走
            map[i][j] = 2;

            // 探索四个方向：下、右、上、左
            if (isGet(map, i+1, j) ||  // 向下
                isGet(map, i, j+1) ||  // 向右
                isGet(map, i-1, j) ||  // 向上
                isGet(map, i, j-1)) {  // 向左
                return true;
            }

            // 如果四个方向都走不通，则回溯（标记为3表示此路不通）
            map[i][j] = 3;
            return false;
        }

        return false;
    }
    
    public void printMap(int[][] map){
        for (int i = 0; i < map.length; ++i){
            for (int j = 0; j < map[i].length; ++j){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MiGong02 {
    public static void main(String[] args) {
        int[][] map = new int[8][7]; // 创建二维数组表示一个八行七列的矩形路线网络
        
        // 设置迷宫左右的边界/墙壁
        for (int i = 0; i < 8; ++i) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        // 设置迷宫上下边界/墙壁
        for (int j = 0; j < 7; ++j) {
            map[0][j] = 1;
            map[7][j] = 1;
        }

        // 沿途障碍物
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("输出当前的地图");
        Path0 start = new Path0();
        start.printMap(map);
        System.out.println("老鼠开始找路！");

        // 从(1,1)出发寻找路径到(6,5)
        boolean flag = start.isGet(map, 1, 1);
        start.printMap(map);
        
        if(flag) 
            System.out.println("做的很棒！老鼠找到路啦！");
        else
            System.out.println("很遗憾，老鼠没有找到出路！");
    }
}
