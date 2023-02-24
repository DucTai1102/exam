package entity;

public class Seller extends Person  {
    private int id;
    private String dayContract;
    private static int AUTO_ID = 1000;


    public Seller(String name, String addres, String phone, int id, String dayContract) {
        super(name, addres, phone);
        this.id = id;
        this.dayContract = dayContract;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDayContract() {
        return dayContract;
    }

    public void setDayContract(String dayContract) {
        this.dayContract = dayContract;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", dayContract='" + dayContract + '\'' +
                ", name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo(){
        super.inputInfo();
        this.id = AUTO_ID;
        AUTO_ID++;
    }

}
