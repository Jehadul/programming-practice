
package practice;

import java.util.Scanner;

public class Fabonacci {

    public static void main(String[] args) {
        int num, a = 0, b = 0, c = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of times");
        num = sc.nextInt();
        System.out.println("Febonacci series");
        
        for (int i = 0; i < num; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");
        }
        
    }
    
}
