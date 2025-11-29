package HouseRentDesign;

import java.util.Scanner;

public class HouseService {
    Scanner myScanner = new Scanner(System.in);
    // 简化存储结构，只存储House对象
    private final House[] houses = new House[100];
    private int count = 0; // 记录当前房屋数量

    public void control(int choice){
        switch(choice) {
            case 1:
                addHouse();
                break;
            case 2:
                searchHouse();
                break;
            case 3:
                delHouse();
                break;
            case 4:
                updateHouse();
                break;
            case 5:
                showAllHouses();
                break;
        }
    }

    private void addHouse() {
        System.out.println("请按顺序输入待添加新房源的各项信息:编号 房主 电话 地址 月租 状态（已出租/未出租）");
        int id = myScanner.nextInt();
        String owner = myScanner.next();
        String tel = myScanner.next();
        String address = myScanner.next();
        double rent = myScanner.nextDouble();
        String state = myScanner.next();

        House house = new House(id, owner, tel, address, rent, state);
        houses[count] = house;
        count++;
        System.out.println("添加成功！");
    }

    private void searchHouse() {
        System.out.println("请输入要查找房屋的id");
        int idSearch = myScanner.nextInt();
        House house = findHouseById(idSearch);
        if (house != null) {
            System.out.println(house.toString());
        } else {
            System.out.println("未找到该房源！");
        }
    }

    private void delHouse() {
        System.out.println("请输入要删除的房源id");
        int delId = myScanner.nextInt();
        int index = findHouseIndexById(delId);
        if (index != -1) {
            // 将后面的元素前移
            for (int i = index; i < count - 1; i++) {
                houses[i] = houses[i + 1];
            }
            houses[count - 1] = null;
            count--;
            System.out.println("删除成功！");
        } else {
            System.out.println("未找到该房源！");
        }
    }

    private void updateHouse() {
        System.out.println("请输入要修改的房源id");
        int updateId = myScanner.nextInt();
        House house = findHouseById(updateId);
        if (house != null) {
            System.out.println("当前信息如下，请按照顺序输入新的参数：" + house.toString());
            house.setId(myScanner.nextInt());
            house.setOwner(myScanner.next());
            house.setTel(myScanner.next());
            house.setAddress(myScanner.next());
            house.setMonthPrice(myScanner.nextDouble());
            house.setState(myScanner.next());
            System.out.println("修改成功！当前房源信息如下：" + house.toString());
        } else {
            System.out.println("未找到该房源！");
        }
    }

    private void showAllHouses() {
        System.out.println("编号\t房主\t\t电话\t\t地址\t\t月租\t\t状态（已出租/未出租）");
        for (int i = 0; i < count; i++) {
            System.out.println(houses[i].toString());
        }
    }

    private House findHouseById(int id) {
        for (int i = 0; i < count; i++) {
            if (houses[i].getId() == id) {
                return houses[i];
            }
        }
        return null;
    }

    private int findHouseIndexById(int id) {
        for (int i = 0; i < count; i++) {
            if (houses[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
/**
public class HouseService {
    Scanner myScanner = new Scanner(System.in);
//    String firstLine = "编号\t房主\t电话\t地址\t月租\t状态（已出租/未出租）";
    static Object[][] houses = new Object[100][2];
    static int count = 0;

    public void control(int choice){
            switch( choice) {
                case 1:
                    System.out.println("请按顺序输入待添加新房源的各项信息:编号 房主 电话 地址 月租 状态（已出租/未出租）");
                    int id = myScanner.nextInt();
                    String owner = myScanner.next();
                    String tel = myScanner.next();
                    String address = myScanner.next();
                    double rent = myScanner.nextDouble();
                    String state = myScanner.next();
                    House house = new House(id, owner, tel, address, rent, state);
                    System.out.println("添加成功！");
                    new HouseService().deposit(house, house.toString(), HouseService.count);
                    count++;
                    break;
                case 2:
                    System.out.println("请输入要查找房屋的id");
                    int idSearch = myScanner.nextInt();
                    String res = this.searchHouse(idSearch, houses);
                    if (res != null) {
                        System.out.println(res);
                    } else System.out.println("未找到该房源！");
                    break;
                case 3:
                    System.out.println("请输入要删除的房源id");
                    int delId = myScanner.nextInt();
                    delHouse(delId);
                    break;
                case 4:
                    System.out.println("请输入要修改的房源id");
                    int updateId = myScanner.nextInt();
                    updateHouse(updateId, houses);
                    break;
                case 5:
                    System.out.println("当前系统中已录入的全部房源信息如下：");
                    System.out.println(showAllHouses(houses));
                    break;
            }
    }

    public String searchHouse(int id, Object[][] arr){
        for (int i = 0;i < arr.length;++i){
            if (arr[i][0] != null){
                House house = (House)arr[i][0];
                if (house.getId() == id)
                    return (String)arr[i][1];
            }
        }
        return null;
    }
    public void deposit(House house,String line,int count){
        HouseService.houses[count][0] = house;
        HouseService.houses[count][1] = line;
    }

    public void delHouse(int id){
        for (int i = 0;i < houses.length;++i){
            if (houses[i][0] != null){
                House house = (House)houses[i][0];
                if (house.getId() == id){
                    houses[i][0] = null;
                }

            }
        }
    }

    public void updateHouse(int id,Object[][] arr){
        for (int i = 0;i < arr.length;++i){
            if (arr[i][0] != null){
                House house = (House)arr[i][0];
                if (house.getId() == id){
                    System.out.println("当前信息如下，请按照顺序输入新的参数："+house.toString());
                    house.setId(myScanner.nextInt());
                    house.setOwner(myScanner.next());
                    house.setTel(myScanner.next());
                    house.setAddress(myScanner.next());
                    house.setMonthPrice(myScanner.nextDouble());
                    house.setState(myScanner.next());
                    ///house = new House(myScanner.nextInt(),myScanner.next(),myScanner.next(),
                    ///myScanner.next(),myScanner.nextDouble(),myScanner.next());
                    System.out.println("修改成功！当前房源信息如下"+house.toString());
                }

            }
        }

    }

    public String showAllHouses(Object[][] arr){
        String details = "编号\t房主\t电话\t地址\t月租\t状态（已出租/未出租）";
        for (int i = 0;i < arr.length;++i){
            if (arr[i][0] != null){
                details += '\n' + arr[i][1].toString();
            }
        }
        return details;
    }

    public static Object[][] getHouses() {
        return houses;
    }

    public void setHouses(House[][] houses) {
        HouseService.houses = houses;
    }
}
*/