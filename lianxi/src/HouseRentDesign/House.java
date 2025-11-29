package HouseRentDesign;
/// 创建实体类及其属性、及对外暴露对属性的获取和修改（setter&getter）、重写toString方法
/// 属性顺序如下：编号 房主 电话 地址 月租 状态（已出租/未出租）
public class House {
    private int id;
    private String owner;
    private String tel;
    private String address;
    private double monthPrice;
    private String state;

    public House(int id, String owner, String tel, String address,double monthPrice , String state) {
        this.id = id;
        this.owner = owner;
        this.tel = tel;
        this.monthPrice = monthPrice;
        this.address = address;
        this.state = state;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String isState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(double monthPrice) {
        this.monthPrice = monthPrice;
    }

    public String toString(){
        return id +
                "\t" + owner +
                "\t" + tel +
                "\t\t" + address +
                "\t" + monthPrice +
                "\t\t" + state;
    }
}
