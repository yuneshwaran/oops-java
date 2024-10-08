
import java.util.Random;
import java.util.Scanner;


public class Bank {

    String name;
    int balance;
    int accnum;
    Random rand = new Random();

    //constructors

    Bank (){
        this.name = "NULL";
        
        this.balance =0;
        this.accnum = rand.nextInt(10000);
    }
    //const overload
    Bank(String n){
        this.name = n;
      //  Random rand = new Random();
        this.balance =0;
        this.accnum = rand.nextInt(10000);
    }
    Bank(String name,int initialdep){
        this.name = name;
       // Random rand = new Random();
        this.balance = initialdep;
        this.accnum = rand.nextInt(10000);
    }

    //methods
    public void credit(int amt){
        balance += amt;
        System.out.printf("Your balance is : %d \n" ,balance);

    }
    public void debit(int amt){
        if(balance - amt >= 0) 
             balance -= amt;
        else 
            System.out.println("Insufficient balance");
        System.out.printf("Your balance after transaction is : %d \n" ,balance);
    }

    public void bal(){

        System.out.printf("Name :%s\nAcc Num : %d \nYour balance  is : %d \n" ,name,accnum,balance);
    }


    //driver method
    public static void main(String[] args) {

        Bank p1 = new Bank("Yunesh");
        boolean ch = true;
        Scanner sc = new Scanner(System.in);
        while (ch){
            System.out.print("DEBIT -1 \nCREDIT  -2\nBALANCE -3\nQUIT -4\n");
            int x = sc.nextInt();
            if (x==4){
                ch = false;
                break;
            }
            int tmp;
            switch (x) {
                case 1:
                    System.out.print("Enter amount to debit : ");
                    tmp = sc.nextInt();
                    p1.debit(tmp);
                    p1.bal();

                    break;
                case 2:
                    System.out.print("Enter amount to debit : ");
                    tmp = sc.nextInt();
                    p1.credit(tmp);
                    p1.bal();

                    break;

                case 3:

                    p1.bal();
                    
                    break;

                default:
                    break;
            }
            System.out.println("-----------------------");
        }
        sc.close();
    }

}

