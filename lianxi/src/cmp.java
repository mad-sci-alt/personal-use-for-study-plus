public class cmp {
    public static void main(String[] args) {
        double a = 8.1/3;
        double b = 2.7;
        if( a == b){
            System.out.println("两数相等");
        }
        System.out.println("a = " + a);
        if( a - b <0.00000001){
            System.out.println("两数可近似相等");
        }
    }
}
