/****************************************************************************
 *
 * Created on : Nov. 7 2017
 * Created for : ICS3UR
 * Daily Assignment - Unit4-03
 * This program accepts an address and formats it nicely
 *
 ****************************************************************************/
import java.util.Scanner;  

public class address 
{
     public static String printAddress(String stAddress, String city, String province, String postalCode, String aptNumber)
     {
           if (aptNumber.equals(""))
          {
               String address = stAddress + ", " + city + ", " + province + ", " + postalCode;    
               return address;           
           }   
           else
           {
                String address = aptNumber + ", " + stAddress + ", " + city + ", " + province + ", " + postalCode; 
                return address;
            }
                     
      } 
 
     public static void main(String[] args)
     { 
          String stAddress, city, province, postalCode, aptNumber;
          Scanner input = new Scanner(System.in);  
          System.out.println("Would you like to enter your apartment number (yes or no): ");  
          aptNumber = input.next();    
          
          while (aptNumber.equals("no") == false && aptNumber.equals("yes") == false)
          {                
               System.out.println("Please type 'yes' or 'no'");
               System.out.println("Would you like to enter your apartment number (yes or no): ");  
               aptNumber = input.next();           
           }          
          
          if (aptNumber.equals("yes"))
          {
               //String stAddress, city, province, postalCode;
               System.out.println("Please enter your apartment number: ");  
               aptNumber = input.next();               
               System.out.println("Please enter your street address: ");  
               stAddress = input.next(); 
               System.out.println("Please enter the city you live in: ");  
               city = input.next(); 
               System.out.println("Please enter the province you live in: ");  
               province = input.next(); 
               System.out.println("Please enter you postal code: ");  
               postalCode = input.next();
               System.out.println(printAddress(stAddress, city, province, postalCode, aptNumber));
           }              
          else if (aptNumber.equals("no"))
          {
               //String stAddress, city, province, postalCode;
               System.out.println("Please enter your street address: ");  
               stAddress = input.next(); 
               aptNumber = "";
               System.out.println("Please enter the city you live in: ");  
               city = input.next(); 
               System.out.println("Please enter the province you live in: ");  
               province = input.next(); 
               System.out.println("Please enter you postal code: ");  
               postalCode = input.next();
               System.out.println(printAddress(stAddress, city, province, postalCode, aptNumber));
           }          
      }
}
