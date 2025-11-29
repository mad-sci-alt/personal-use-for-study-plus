package HandWriteClass;

import java.util.Arrays;
import java.util.Scanner;

class Person{
    private String name;
    private int age;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean equals(Person obj){
        if (this == obj){//两个地址指向同一个对象，内容一定一样，返回真
            return true;
        }
        if (obj instanceof Person){
            return this.name == obj.name && this.age == obj.age && this.gender == obj.gender;
        }
        return false;
    }

    private char gender;

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;

    }
}

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("张书航", 20, '男');
        int arr[] = new int [5];
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = myScanner.nextInt();
        }
        Arrays.sort(arr);
    }
}
