/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone.number;

/**
 *
 * @author Alumno
 */
public class Contact { //Atributos de la clase
    private String name;
    private int number;

    public Contact(String name, int number) {//constructor  apartir de nombre del contacto y numero de telefono
        this.name = name;
        this.number = number;
    }

    public String getName() { //getter y setter de nombre
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() { //getter y setter de numero
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString(){//metodo to string para regresar una cadena nombre+numero
        return name+": "+number;
    }
}
