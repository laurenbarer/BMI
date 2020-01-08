/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author labarer
 */
public class Methods {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three names of family members");
        //int numberOfSiblings = in.nextInt();  
        String name1 = in.nextLine();
        String name2 = in.nextLine();
        String name3 = in.nextLine();
        System.out.println("Please enter the years of births for the family members");
         int year1 = in.nextInt();
         int year2 = in.nextInt();
         int year3 = in.nextInt();
        
         int age1 = ageCalculator (year1);
         int age2 = ageCalculator (year2);
         int age3 = ageCalculator (year3);
         
         int eldest = max(age1,age2,age3);
         if (eldest == age1){
             display(name1, "eldest");
         if (age2>age3){
             display(name2, "Second Oldest");
             display(name3, "youngest");}
         else{
             display(name3, "Second Oldest");
             display(name2, "youngest");
         }
         }
         else if (eldest == age2){
             display(name2, "eldest");
             if (age1>age3) {
             display(name1, "Second Oldest");
             display(name3, "youngest");
         } else{
             display(name3, "Second Oldest");
             display(name1, "youngest");
         }
         }else {
                 if(age1>age2) {
                display(name1, "Second Oldest");
                display(name2, "youngest");
                 } else {
                 display(name2, "Second Oldest");
                display(name1, "youngest");
                 }
                 }
         
                 
                  
 
        int i = 0;
        int age = 0;
        
    }

         
        
    
    public static int ageCalculator(int year){
        return 2019 - year;
                
    }
    public static int max(int age1, int age2,int age3 ){
        if (age1>age2)
            return age1;
       
    else if (age2 > age3)
     
        return age2;
        
    else 
        return age3;
     
             
    }
    public static void display(String name, String age){
        System.out.println(name + " is " + age + "years old");
      
    }

