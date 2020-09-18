package practice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
       /*int temp, num;
       boolean isPrime = true;
       
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       num = sc.nextInt();
       sc.close();
       
        for (int i = 2; i < num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " number is prime");
        }else{
            System.out.println(num + " number is not a number");
        }*/
        
        int num = 0;
        int j = 0;
        String primeNumbers = "";
        for (j = 1; j <= 100; j++) {
            int counter = 0;
            for (num = j;  num>=1; num--) {
                if (j%num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + j + " ";        
            }
        }
        System.out.println("Prime numbers from 1 to 100 are: ");
        System.out.println(primeNumbers);
    }
    
}
