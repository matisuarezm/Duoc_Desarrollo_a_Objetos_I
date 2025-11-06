package util;

/**
 * Clase validadora con una excepcion específica para la validacion del RUT, extendida de Exception
 *
 * @author msuarez
 * @version 1.0
 */

public class ValidaRutException extends Exception{

    /**Metodo constructor para arrojar el mensaje de la excepcion llamado al padre con super() */
    public ValidaRutException(String mensaje){
        super(mensaje);
    }
}
