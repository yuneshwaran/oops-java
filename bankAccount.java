


public class bankAccount {
    String accnum;
    double balance;

    bankAccount(){
        this.accnum = "00000";
        this.balance = 0;
    }
    bankAccount(double balance){
        this.accnum = "11111";
        this.balance = balance;
    }

    public double deposit (int amt){

        this.balance += amt;
        return this.balance;
    }

    public static void main(String[] args) {
        bankAccount ac1 = new bankAccount();
        System.out.println(ac1.deposit(200));
        System.out.println(ac1.deposit(200));
        System.out.println(ac1.deposit(200));
    }

}
