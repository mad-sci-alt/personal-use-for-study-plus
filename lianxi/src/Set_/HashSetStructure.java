package Set_;

/**
 * @author 张 书航
 */
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashMap底层（也即是HashSet的底层）
        Node[] table = new Node[16];
        Node jack = new Node("jack", null);
        table[2] = jack;
        Node rose = new Node("rose", null);
        jack.next = rose;
        Node tom = new Node("tom", null);
        Node mary = new Node("mary", null);
        rose.next = mary;
        table[3] = tom;
        System.out.println(table[2].hashCode()+"    "+table[3].hashCode());
        for (Object o : table) {
            System.out.println(o);
        }
    }
}

class Node {
    Object data;
    Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
