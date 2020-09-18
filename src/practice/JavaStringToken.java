
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaStringToken {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        
        if (!sc.hasNext()) {
            System.out.println(0);
        }else{
            String input = sc.nextLine();
            String[] a = input.trim().split("[ !,?._'@]+");
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(a));
            System.out.println(list.size());
            
            for (String list1 : list) {
                System.out.println(list1);
            }
        }
    }
    
}
