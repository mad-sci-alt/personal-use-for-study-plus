package generic;

import java.util.*;

/**
 * @author 张 书航
 */
public class Homework01 {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();
//        userDAO.getMap() = new HashMap();
        userDAO.save("一号", new User(1, "张三", 20));
        userDAO.save("二号", new User(2, "张三", 20));
        userDAO.get("1");
        userDAO.update("二号", new User(2, "李四", 22));
        System.out.println(userDAO.list());
//        userDAO.delete("1");
        System.out.println(userDAO.list());
        System.out.println(userDAO);
    }
}

class DAO<T> {
    Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<String> set = map.keySet();
        for (String key : set) {
            list.add(get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        Iterator<String> iterator = getMap().keySet().iterator();
        return "<" + iterator.next().getClass().getSimpleName() + ","
                + getMap().values().iterator().next().getClass().getSimpleName()
                + ">{" +
                "map=" + map +
                '}';
    }
}

class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}