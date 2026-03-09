package Assignments.Assignment2.Module4;

public interface Payment {
    void pay();
}
class CreditCardPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment successful! using Credit card");
    }
}
class UPIPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Payment successful! using UPI");
    }
}
class Driver1{
    public static void main(String[] args) {
        Payment c=new CreditCardPayment();
        Payment u=new UPIPayment();

        c.pay();
        u.pay();
    }
}

