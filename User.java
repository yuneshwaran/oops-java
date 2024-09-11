
//9. Create a class User with an attribute email. Implement a method is_valid_email() that checks 
//if the email contains an "@" symbol. Instantiate a User object and validate the email.

public class User {
    
    String name;
    String mailid;

    //constructor
    User(){
        this.mailid = "NULL";
        this.name = "NULL";
    }
    User(String name){
        this.name = name;
    }

    //geter and setter
    public void setMailid(String mail){
        if(mail.contains("@")) this.mailid = mail;

        else this.mailid = "Invlaid";
    }
    public String getMailid(){
        return this.mailid;
    }

        public static void main(String[] args) {

            User u1 = new User("Alpaca");
            u1.setMailid("alpacagmail.com");
            System.out.println(u1.getMailid());
            u1.setMailid("alpaca@gmail.com");
            System.out.println(u1.getMailid());
            
        }
    }

