/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package febtask_try30;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Febtask_try30 {
// Link to GitHub: https://github.com/RafaFernandez92/Febtask_try30
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Reading the document    
// try{
//            Scanner readFile=new Scanner(new FileReader("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Febtask_try30\\students.txt"));
//            
//            System.out.println(readFile.nextLine());;
//            System.out.println(readFile.nextLine());
//            System.out.println(readFile.nextLine());
//            System.out.println(readFile.nextLine());
//            System.out.println(readFile.nextLine());
//            System.out.println(readFile.nextLine());
//                
//        }catch (FileNotFoundException e){
//            System.out.println(e);
//        }
    //Cheking valid name
        Scanner userName = new Scanner(System.in);
        System.out.println("Insert name: ");
        String userEntry = userName.nextLine();
        //Tried to create the file status.txt with BufferedWriter and to append the text input by user.
        try {
            BufferedWriter myWriter = new BufferedWriter(FileWriter('status.txt', true));
        }catch(Exception e) {
            myWriter.write(userEntry);
        }
        //this should have been one of the requirements for input Data
         if (userEntry.length() < 10) {
            System.out.println("Incorrect length. Please enter at least 4 characters.");
        } else {
            String first7 = userEntry.substring(0, 7);
            if (first7.matches("[0-9]+")) {
                System.out.println("First 7 characters cannot be numbers");
            } else {
                String firstChars = userEntry.substring(0, 7);
                if (!firstChars.matches("[a-zA-Z]+")) { 
                    System.out.println("Well done, let's register it!");
                } else {
                    System.out.println("Valid name, let's register");
 // I don't know how to proceed.               
}
}
        }
    
        
            System.out.println("Well done.");
        
            
            
            
        }
        
      
    }
    
    
    
    
    
    }
    

