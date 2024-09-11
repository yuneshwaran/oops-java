
// 7.Write a class Counter with an integer attribute count. 
// Implement methods to increment and decrement the count. Create an instance,\
// modify the count, and print the result.


public class Counter {
    int count;
    
    //constructor
    Counter(int i){
        this.count = i;
    }
    Counter(){
        this.count = 1;
    }

    public void increment(){
        ++this.count;
        display();
    }

    public void increment(int value){
        this.count += value;
        display();
        
    }

    public void decrement(){
        --this.count;
        if(this.count ==0){
            this.count = 0;
        }
        display();
        
    }
    
    public void decrement(int value){
        this.count -= value;
        if(this.count <= 0){
            this.count = 0;
        }
        display();
    }
    public void display(){
        System.out.println(this.count);
    }

    public static void main(String[] args) {
        Counter count = new Counter();
        count.display();
        count.increment();
        count.decrement();
        count.increment(5);
        count.decrement(10);

    }

}
