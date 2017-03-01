/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone.number;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class PhoneNumber {
       
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone myPhone = new MobilePhone();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       menu();
    }
    
    public static void menu(){
       int option;
       
       printMenu();
       option = scanner.nextInt();
       while(option >0&&option <7){
           switch(option){
               case 1:
                   addContact();
                   break;
               case 2:
                    updateContact();
                    break;
               case 3:
                   removeContact();
                    break;
               case 4:
                   queryContact();
                   break;
               case 5:
                   listAllContacts();
                   break;
               case 6:
                   printMenu();
                   break;
               default:
                   break;
               
           }
           
           System.out.println("Option?");
           option = scanner.nextInt();
       }
    }
    
    public static void printMenu(){
        System.out.println("Menu");
        System.out.println("0. Quit");
        System.out.println("1. Add contact");
        System.out.println("2. Update contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Query contact");
        System.out.println("5. List all contacts");
        System.out.println("6. Print options");
        System.out.println("Option?");
    }
    
    public static void addContact(){
        if( myPhone.addContact(askName(),askNumber())){
            System.out.println("Contact succesfully created");
                    }else{
            System.out.println("Contact already in list");
        }
    }
    
    public static void updateContact(){
        if(myPhone.updateContact(askName(),askNumber())){
            System.out.println("Contact succesfully updated");
        }else{
            System.out.println("Contact not updated");
        }
    }
    
    public static void removeContact(){
        if(myPhone.removeContact(askName(),askNumber())){
            System.out.println("Contact succesfully removed");
        }else{
            System.out.println("Contact not in list");
        }
    }
    
    public static void queryContact(){
        System.out.println(myPhone.queryContact(askName()));
    }
    
    public static void listAllContacts(){
        myPhone.listContacts();
    }
    
    public static String askName(){
        String name;
        System.out.println("Contact name");
        name= scanner.next();
        return name;
    }
    
    public static int askNumber(){
        int number;
        System.out.println("Number?");
        return number= scanner.nextInt();
    }
}
