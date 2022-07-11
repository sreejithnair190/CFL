/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cfl_5;

/**
 *
 * @author admin
 */
import java.io.FileWriter;
public class CFL_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        try{
            FileWriter fw=new FileWriter("C:\\Users\\admin\\Desktop\\CFL\\testout.txt"); 
           while(true){
            fw.append("Welcome to javaTpoint."); 
           }
        }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");     
         
     }    
    
}
