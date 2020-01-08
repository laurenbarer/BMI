/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loooopsss;

import java.util.Scanner;

/**
 *
 * @author labarer
 */public class Loooopsss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        
        int sum = 0;
        
       
        System.out.println("Enter number2");
        int number2 = in.nextInt();
        
        
        
        for(int num = number ; num <= number2 ; num++){
            sum = sum + num ;
                    
   
            System.out.println(sum);
        }
        System.out.println(sum);
    }
    
}
