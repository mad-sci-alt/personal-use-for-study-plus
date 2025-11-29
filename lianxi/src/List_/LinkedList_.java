package List_;

/**
 * @author 张 书航
 */

class Node {
    public Object data;
    public Node next;
    public Node last;

    public Node(Object data) {
        this.data = data;
    }
}

public class LinkedList_ {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mike = new Node("mike");
        Node first = jack;
        Node last = mike;

        jack.next = tom;
        tom.last = jack;
        mike.last = tom;
        tom.next = mike;
        Node zsh = new Node("张书航");
        while (true) {
            if (first == null) break;
            if (first == tom) {
//                first.next.last=zsh;//3
//                zsh.next = first.next;//4
//                zsh.last = first;//2
//                first.next = zsh;//1
                Node temp = first.next;
                first.next = zsh;
                zsh.last = first;
                zsh.next = temp;
                temp.last = zsh;
            }
            System.out.println(first.data);
            first = first.next;
        }
        System.out.println(first);//遍历后first指针指向空
    }

}
