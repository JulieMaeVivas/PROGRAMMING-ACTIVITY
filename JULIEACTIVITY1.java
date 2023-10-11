/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juls;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JULS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        System.out.println("Choose Operator;"
                + "1. Addirion"
                + "2. Subtraction"
                + "3. Multiplication"
                + "4. Division");
        int a = input.nextInt();
        
        if (a==1) {
            System.out.println("Enter 1st Digit:");
            int b = input.nextInt();
            System.out.println("Enter 2nd Digit:");
            int c = input.nextInt();
            int ans=b+c;
            
                    System.out.println("The answer  is" + ans);
        }else if (a==2){
            System.out.println("Enter 1st Digit: ");
            int b = input.nextInt();
            System.out.println("Enter 2nd Digit: ");
            int c = input.nextInt();
            int ans=b-c;
            
                    System.out.println("The answer  is" + ans);
        }else if (a==3){
            System.out.println("Enter 1st Digit: ");
            int b = input.nextInt();
            System.out.println("Enter 2nd Digit: ");
            int c = input.nextInt();
            int ans=b*c;
            
                    System.out.println("The answer  is" + ans);
        }else if (a==4){
            System.out.println("Enter 1st Digit: ");
            int b = input.nextInt();
            System.out.println("Enter 2nd Digit: ");
            int c = input.nextInt();
            int ans=b/c;
            
                    
                    System.out.println("The answer is " + ans);
                    
        
            
                
               
                
    }
    }
    
}
