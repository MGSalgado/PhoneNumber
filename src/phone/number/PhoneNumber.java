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
       
    public static Scanner scanner = new Scanner(System.in); //creacion de objeto scanner
    public static MobilePhone myPhone = new MobilePhone(); //creacion de clase maestra tipo MobilePhone
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main, solo contiene un metodo que llama al menu
       menu();
    }
    
    public static void menu(){ //el metodo menu tiene un switch con el cual accedemos a las diferentes opciones que se pueden elegir
       int option;          //primero llama almetodo "printMenu()" para mostrar las opciones en pantalla y despues pide por teclado
                            //que el usuario ingrese la opcion que desea ejecutar
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
    
    public static void printMenu(){ //muestra las opciones en pantalla
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
    
    public static void addContact(){ //utiliza la clase myPhone para crear un contacto
        if( myPhone.addContact(askName(),askNumber())){
            System.out.println("Contact succesfully created");
                    }else{
            System.out.println("Contact already in list");
        }
    }
    
    public static void updateContact(){ //utiliza la clase myPhone para actualizar un contacto
        if(myPhone.updateContact(askName(),askNumber())){
            System.out.println("Contact succesfully updated");
        }else{
            System.out.println("Contact not updated");
        }
    }
    
    public static void removeContact(){ //utiliza la clase myPhone para eliminar un contacto
        if(myPhone.removeContact(askName(),askNumber())){
            System.out.println("Contact succesfully removed");
        }else{
            System.out.println("Contact not in list");
        }
    }
    
    public static void queryContact(){ //utiliza la clase myPhone para solicitar un contacto
        System.out.println(myPhone.queryContact(askName()));
    }
    
    public static void listAllContacts(){ //utiliza la clase myPhone para mostrar una lista de todos los contactos
        myPhone.listContacts();
    }
    
    public static String askName(){ //para facilitar la escritura de codigo, varios metodos llaman a "askName()" para pedir al usuario
        String name;                      //el nombre del contacto
        System.out.println("Contact name");
        name= scanner.next();
        return name;
    }
    
    public static int askNumber(){  //para facilitar la escritura de codigo, varios metodos llaman a "askNumber()" para pedir a usuario
        int number;                       //el numero del contacto
        System.out.println("Number?");
        return number= scanner.nextInt();
    }
}
