import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17
 * String question Write question for user to be asked
 * System.out.println Ask user to input a number
 * scanner Get user input
 * count beginning from until userInputValue Calculate the sum of user input
 * System.out.println(sum);Display the sum 
 */
public class Main {

    public static void main(String[] args){  
       String question = "Enter a number";
       System.out.println(question);
      
       Scanner scanner = new Scanner(System.in);
       int userInputValue = scanner.nextInt();
       
       int sum =0;
       
           for (int i = 0; i<=userInputValue; i++){
               sum = sum + i;
               
  
            
        }
        
        System.out.println(sum);
         
        }
        
               
               
        
       
       
    }

        
        
    
        
            
        
    

