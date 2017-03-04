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
public class MobilePhone { //atributos de la clasa (solo es uno jajja)
    private ArrayList<Contact> contactos;

    public MobilePhone() { //construtor de la clase
        contactos = new ArrayList<Contact>();
    }
    
   
  public boolean addContact (Contact contacto){ //metodo para agregar un contacto a partir de un objeto tipo "contact"
      if (findContact(contacto.getName())==-1){
          contactos.add(contacto);
          return true;
      }
      return false;
  }  
  
  public boolean addContact (String name, int number){ //metodo para agregar un contacto a partir de un nombre de contacto y un numero
      return addContact(new Contact(name, number));
  }
 

  public int findContact(String name){ //metodo para encontrar si un contacto ya esta dentro de nuestro ArrayList de contactos
      for(int i = 0; i<contactos.size();i++){
          if(contactos.get(i).getName().equals(name)){
              return i;
          }
      }return -1;
  }
  
  public boolean removeContact(Contact contacto){ //metodo para quitar un contacto a partir e un objeto Contact
      int pos= findContact(contacto.getName());
      if(pos== -1){
          return false;
      }
      contactos.remove(pos);
      return true;
      }
  
  public boolean removeContact(String name, int number){ //metodo para remover un contacto a partir de un nombre y un numero de contacto
      return removeContact(new Contact(name,number));
  }
  
  public boolean removeContact(String name){ //metodo para remover un contacto a partir de un nombre de contacto
      return removeContact(new Contact(name,123));
  }
  
  public boolean updateContact(Contact contacto){ //metodo para actualizar la informacion de un contacto, requiere un objeto tipo contact
      int pos = findContact(contacto.getName());
      if(pos == -1){
          return false;
      }
      contactos.get(pos).setName(contacto.getName());
      contactos.get(pos).setNumber(contacto.getNumber());
      return true;
  }
  
  public boolean updateContact(String name, int number){ //metodo para actualizar la información de un contacto a partir de un nombre y numero
      return updateContact(new Contact(name,number));
  }
  
  public void listContacts(){ //metodo para mostrar a modo de lista todos los contacto del ArrayList contactos
      for (Contact tempContact : contactos){
          System.out.println(tempContact.toString());
      }
  }
  
  public String queryContact(String name){ //metodo para regresar la información de un contacto determinado
      int pos = findContact(name);
      
      if(pos==-1){
          return "Contact not found";
      }else{
          return contactos.get(pos).toString();
      }
  }
  }

