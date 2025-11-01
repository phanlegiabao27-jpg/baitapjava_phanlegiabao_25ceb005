public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(0 ,"Bao",'n');
        System.out.println(c1);
        System.out.println("customers ID is :" + c1.getId());
        System.out.println("customers name is :" + c1.getName());
        System.out.println("customer gender is :" + c1.getGender());
        Account a1 = new Account(0 , c1,0.0);
        System.out.println(a1);
        System.out.println("accounts ID is :" + a1.getId());
        System.out.println("accounts customer is :" + a1.getCustomer());
        System.out.println("customer account balance is :" + a1.getBalance());
        a1.setBalance(999.99);
        System.out.println("customer account balance is :" + a1.getBalance());
        System.out.println("customer name is :" + a1.getCustomerName());
        a1.deposit(0.01);
        System.out.println("customer account balance is :" + a1.getBalance());
        a1.withdraw(1000.01);
        a1.withdraw(1000.00);
        System.out.println("customer account balance is :" + a1.getBalance());
    }

}
