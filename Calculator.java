package oops;

import java.util.Scanner;

public class Calculator {

        Scanner sc = new Scanner(System.in);
        public void calculator(int c){
    
            System.out.print("Enter n1: ");
            int n1 = sc.nextInt();
            System.out.print("Enter n2: ");
            int n2 = sc.nextInt();
            switch (c){
                case 1:{
                    System.out.println("Result :"+ (n1+n2));
                    break;
                }
                case 2:{
                    System.out.println("Result :"+ (n1-n2));
                    break;
                }
                case 3:{
                    System.out.println("Result :"+ (n1*n2));
                    break;
                }
                case 4:{
                    System.out.println("Result :"+ (n1/n2));
                    break;
                }
                default:{
                    break;
                }    
            }
            sc.close();
        }
        
        //Driver code
        public static void main(String[] args) {

            Calculator c = new Calculator();
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Add\n2.Sub\n3.Multiply\n4.Divide");
            System.out.print("Enter your choice : ");
            int x = sc.nextInt();
            c.calculator(x);
        }

    }
    
