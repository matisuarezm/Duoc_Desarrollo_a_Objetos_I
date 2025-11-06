package model;


import util.ValidaRutException;

/**
 * Clase específica para el RUT de un cliente, en donde establecemos el formato de ingreso y un constructor
 * que verifíca si se cumple el formato correspondiente. Esta clase es parte por medio de la composicion de la clase {@link Persona}
 *
 * @author msuarez
 * @version 1.0
 */

public class Rut {

    //Atributos
    private String textoRut;

    /**
     * Constructor que recibe un texto como parametro y se valida que cumpla el formato esperado.
     * @param textoRut Texto del rut a validar
     * @throws ValidaRutException si el RUT no cumple con el formato indicado
     */
    public Rut(String textoRut) throws ValidaRutException {
        validaFormatoRut(textoRut);
        this.textoRut = textoRut;
    }

    /**
     * Metodo que valida el formato del RUT ingresado es correcto
     * @param formatoRut es la cadena de texto a validar (ingreso del RUT)
     * @throws ValidaRutException si el RUT no cumple con el formato indicado
     */
    private static void validaFormatoRut(String formatoRut) throws ValidaRutException{
        String formato = "^[0-9]+-[0-9Kk]$";
        if(!formatoRut.matches(formato)){
            throw new ValidaRutException("El RUT ingresado no tiene el formato esperado. Debe ser: 87654321-9 o K");
        }
    }

    //Getter

    /** Retorna el RUT en formato texto */
    public String getTextoRut(){
        return textoRut;
    }

    //Setter
    /** Establece el rut de una persona y lo valida */
    public void setTextoRut(String nuevoRut) throws ValidaRutException {
        validaFormatoRut(nuevoRut);
        this.textoRut = nuevoRut;
    }

    /** Forma en que se mostrara el RUT al imprimirlo por consola */
    @Override
    public String toString(){
        return String.format("%-10s %s\n","RUT:", textoRut);
        //return "RUT: " + textoRut + '\n';
    }
}
