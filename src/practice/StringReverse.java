/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Md Rafiqul Islam
 */
public class StringReverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        //String str = "Automation";
        /*StringBuilder stb = new StringBuilder();
        stb.append(str);
        stb = stb.reverse();*/
        
        char chr[] = str.toCharArray();
        for (int i= chr.length - 1; i>=0; i--) {
            System.out.print(chr[i]);
        }        
        System.out.println();
    }
    
}
