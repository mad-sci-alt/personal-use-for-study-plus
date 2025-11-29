package class_and_object;

class Path{
    public boolean isGet(int[][] map,int i,int j){
        if(map[6][5] == 2)return true;
        else {
            if (map[i][j] == 0){
                map[i][j] = 2;
                if (isGet(map,i+1,j))return true;///自我递归调用朝下走
                else if (isGet(map,i,j+1))return true;///朝右走
                else if(isGet(map,i-1,j))return true;///朝上走
                else if(isGet(map,i,j-1))return true;///朝左走
                else {
                    map[i][j] = 3;
                    return false;
                }
            }
            else {
                return false;
            }
        }

    }
    public void printMap(int[][] map){
        for (int i = 0;i < map.length;++i){
            for (int j = 0;j < map[i].length;++j){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

}
public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];//创建二维数组表示一个八行七列的矩形路线网络
        for (int i = 0;i < 8;++i){/// 设置迷宫左右的边界/墙壁
            map[i][0] = 1;
            map[i][6] = 1;
        }
        for (int j = 0;j < 7;++j){/// 设置迷宫上下边界/墙壁
            map[0][j] = 1;
            map[7][j] = 1;
        }
        map[3][1] = 1;map[3][2] = 1;///沿途障碍物
        System.out.println("输出当前的地图");
        Path start = new Path();
        start.printMap(map);
        System.out.println("老鼠开始找路！");

        boolean flag = start.isGet(map,1,1);
        start.printMap(map);
        if(flag) System.out.println("做的很棒！老鼠找到路啦！");

    }
}

//class Path {
//    // 使用递归回溯算法寻找路径
//    public boolean isGet(int[][] map, int i, int j) {
//        // 如果到达目标位置(1,1)
//        if (i == 1 && j == 1) {
//            map[i][j] = 2; // 标记路径
//            return true;
//        }
//
//        // 检查当前位置是否可以走（0表示可走，1表示墙，2表示已走过的路径）
//        if (map[i][j] == 0) {
//            // 标记当前位置为已走
//            map[i][j] = 2;
//
//            // 探索四个方向：右、下、左、上（可以根据需要调整顺序）
//            if (isGet(map, i, j+1) ||  // 向右
//                    isGet(map, i+1, j) ||  // 向下
//                    isGet(map, i, j-1) ||  // 向左
//                    isGet(map, i-1, j)) {  // 向上
//                return true;
//            }
//
//            // 如果四个方向都走不通，则回溯（标记为3表示此路不通）
//            map[i][j] = 3;
//            return false;
//        }
//
//        return false;
//    }
//}
//
//public class MiGong {
//    public static void main(String[] args) {
//        int[][] map = new int[8][7]; // 创建二维数组表示一个八行七列的矩形路线网络
//
//        // 设置迷宫左右边界/墙壁
//        for (int i = 0; i < 8; ++i) {
//            map[i][0] = 1;
//            map[i][6] = 1;
//        }
//
//        // 设置迷宫上下边界/墙壁
//        for (int j = 0; j < 7; ++j) {
//            map[0][j] = 1;
//            map[7][j] = 1;
//        }
//
//        // 沿途障碍物
//        map[3][1] = 1;
//        map[3][2] = 1;
//
//        System.out.println("输出当前的地图");
//        printMap(map);
//
//        System.out.println("老鼠开始找路！");
//        Path start = new Path();
//
//        // 从右下角(7,5)开始寻找路径到左上角(1,1)
//        boolean flag = start.isGet(map, 7, 5);
//
//        if (flag) {
//            System.out.println("做的很棒！老鼠找到路啦！");
//        } else {
//            System.out.println("很遗憾，老鼠没有找到出路！");
//        }
//
//        System.out.println("寻路后的地图：");
//        printMap(map);
//    }
//
//    // 添加打印地图的方法，方便查看路径
//    public static void printMap(int[][] map) {
//        for (int i = 0; i < map.length; ++i) {
//            for (int j = 0; j < map[i].length; ++j) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}

