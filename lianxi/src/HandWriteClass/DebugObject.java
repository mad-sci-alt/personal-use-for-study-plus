package HandWriteClass;

class PersonBuild{
    private String name;

    public PersonBuild(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class DebugObject {
    public static void main(String[] args) {
        PersonBuild p1 = new PersonBuild("张三", 20);
        p1.setAge(21);
        System.out.println(p1.getName()+"的年龄为"+p1.getAge());


    }
}
