package Encapsulation;

public class Account {
    private int acc_no;
    private String name,email,address;
    private float amount;

    public void setAcc_no()
    {
        this.acc_no=acc_no;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        Account obj=new Account();
        obj.setAcc_no();
        obj.setName("Dhaval");
        obj.setEmail("dhavaldokhe@gmail.com");
        obj.setAddress("Shirdi");
        obj.setAmount(2545645);

        System.out.println(obj.getAcc_no()+"   "+obj.getName()+"    "+obj.getEmail()+"   "+obj.getAmount());
    }
}

