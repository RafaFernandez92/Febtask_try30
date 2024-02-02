/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package febtask_try30;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Febtask_try30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Reading the document    
         
        try{
            Scanner readFile=new Scanner(new FileReader("C:\\Users\\User\\OneDrive\\Documentos\\NetBeansProjects\\Febtask_try30\\students.txt"));
            
            System.out.println(readFile.nextLine());;
            System.out.println(readFile.nextLine());
            System.out.println(readFile.nextLine());
            System.out.println(readFile.nextLine());
            System.out.println(readFile.nextLine());
            System.out.println(readFile.nextLine());
                
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        
    //public static String userNameEntry() {
    
        Scanner userName=new Scanner(System.in);
        System.out.println("Insert name: ");
        String userEntry = userName.nextLine();
        if(userEntry.length() < 2 || userEntry.length() > 10 ){
            System.out.println("User needs 3 letters at least. Please, try again.");
        } else {
            String first3 = userEntry.substring(2, 10);
            if (!first3.matches("[0-9]+")) {
                System.out.println("First 7 characters are not letters");
            }
            
        }
        
      
    }
    
    
    
    
    
    }
    

