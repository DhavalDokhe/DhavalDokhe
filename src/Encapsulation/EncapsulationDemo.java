package Encapsulation;

import java.security.PrivateKey;

public class EncapsulationDemo {
    private int id;
    private String name;
    private String address;

    public void setId(int id)
    {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setId(1);
        obj.setName("Dhaval");
        obj.setAddress("Shirdi");
        System.out.println(obj.getId()+"    "+obj.getName()+"    "+obj.getAddress());
    }
}
