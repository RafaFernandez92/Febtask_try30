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
    
    
    
    
    
    }
    
}
