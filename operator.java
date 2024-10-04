import java.io.*;
import java.lang.Math;
import java.util.Scanner;
class calculator{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        System.out.println("+,-,*,/");
        char op=scan.next().charAt(0);
        int result=0;
        switch(op) {
           case '+':
            result=n1+n2;
            System.out.println("The Result:"+n1+op+n2+"="+result);
            break;
           case '-':
            result=n1-n2;
            System.out.println("The Result:"+n1+op+n2+"="+result);
            break;
           case '*':
            result=n1*n2;
            System.out.println("The Result:"+n1+op+n2+"="+result);
            break;
           case '/':
            result=n1/n2;
            System.out.println("The Result:"+n1+op+n2+"="+result);
            break;
           default:
            System.out.println("Wrong Input");
          
        }

    }
}