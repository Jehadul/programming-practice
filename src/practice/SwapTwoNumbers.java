package practice;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
       int x, y, temp;
       
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y number");
       x = sc.nextInt();
       y = sc.nextInt();
       
        System.out.println("Before Swapping");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
        /*
        temp = x;
        x = y;
        y = temp;*/
        
        x = x - y;
        y = x + y;
        x = y - x;
        
        System.out.println("After Swapping");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
    
}
