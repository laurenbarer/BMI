/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeowork.pkg1;
import java.util.Scanner;
/**
 *
 * @author labarer
 */
public class Homeowork1 {
 double numberDeposit;
 double yearlyRate;
 double incomeRate;      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner1=new Scanner (System.in);
        System.out.println("Enter the amount deposited this year");
        double numberDeposit= scanner1.nextDouble();
        System.out.println("Enter the yearly interest rate");
        double yearlyRate = scanner1.nextDouble();
         yearlyRate = yearlyRate / 100;
        System.out.println(yearlyRate);
        
        System.out.println("Enter the income interest rate");
        double incomeRate= scanner1.nextDouble();
        incomeRate = incomeRate /100;
        System.out.println(incomeRate);
       
     double interest;
     
             interest= numberDeposit * yearlyRate - incomeRate * yearlyRate * numberDeposit;
      
            
        System.out.println("The amount of interest earned this year is " + interest);
   
        
        
        // TODO code application logic here
    }
    
}
