package OOPS;

public class Abstraction_Interface {
    public static void main(String[] args) {
        Payment pay=new UpiPayment();
        pay.pay();
    }
}
interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
