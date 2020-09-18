
package practice;

import java.util.Scanner;

 class Staircase {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j<num-i?" ":"#");
            }
            System.out.println("");
        }
    }
    
}
