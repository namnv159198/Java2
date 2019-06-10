/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author namku
 */
public class Contact {
    public String name;
    public String phone;
    Scanner in = new Scanner(System.in);
    public  HashMap<String,String> hs = new HashMap<>();
    
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Contact(){
    }
    public String getName() {
        return name;
    }

   
    void addContanct(){
        Contact ct = new Contact();
        for (int i = 0; i < 1; i++) {
            System.out.println("Input contact name : ");
            ct.name = in.nextLine();
            System.out.println("Input phone number ");
            ct.phone = in.nextLine();
            hs.put(ct.name, ct.phone);
        }
    }
    void  searchContactName(){
        String n;
        boolean b= false;
        System.out.println("Input name : ");
        n = in.nextLine();
        hs.forEach((keyStr, valStr) -> {
            if (hs.containsKey(n)) {
                System.out.println("\nSearch : " +n);
                System.out.println("Contact Name\t Phone number ");
                System.out.println(keyStr + "\t\t"+valStr);
            }else System.out.println("\nNot found !");
        });
        
    }
    void display(){
        System.out.println("---------------Address Book---------------");
        System.out.println("Contact Name\t Phone number ");
        hs.forEach((keyStr, valStr) -> {
            System.out.println(keyStr + "\t\t"+valStr);
        });
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
