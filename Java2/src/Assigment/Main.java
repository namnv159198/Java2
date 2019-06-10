/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author namku
 */
public class Main {
    
    public static void main(String[] args) {
        int choie;
        Scanner in = new Scanner (System.in);
        Contact ct = new Contact();
        
        do {            
            System.out.println("\n----------------------- Address Book -----------------------");
        System.out.println("1.Add new contact");
        System.out.println("2.Find a contact by name");
        System.out.println("3.Display contacts");
        System.out.println("4.Exit");
        
            do {                
                System.out.println("Input choice menu (1/2/3/4) : ");
                choie = in.nextInt();
                if (choie < 1 || choie > 4) {
                    System.out.println("Return choice ! ");
                }
            } while (choie < 1 || choie > 4);
            
            switch(choie){
                case 1 :
                    ct.addContanct();
                   break;
                case 2:
                    ct.searchContactName();
                     break;
                case 3:
                    ct.display();
                     break;
                case 4:
                    System.exit(4);
            }
        } while (choie !=4);
        
        
    }
    
    
    
    
}
