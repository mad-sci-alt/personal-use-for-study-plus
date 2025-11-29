package CollectionHomework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 张 书航
 */
public class Homework06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        PersonL p1 = new PersonL("AA");
        PersonL p2 = new PersonL("BB");
        set.add(p1);
        set.add(p2);
        p1.setName("CC");
        set.remove(p1);
        System.out.println(set);
        set.add(new PersonL("CC"));
        System.out.println(set);
        set.add(new PersonL("AA"));
        System.out.println(set);
    }
}

class PersonL {
    private String name;

    public PersonL(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nPersonL{" +
                name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonL personL = (PersonL) o;
        return Objects.equals(getName(), personL.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}