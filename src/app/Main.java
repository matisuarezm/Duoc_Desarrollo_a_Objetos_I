package app;


import model.Direccion;
import model.Empleado;
import model.Persona;
import model.Rut;
import util.ValidaRutException;

/**
 *
 * Clase principal del programa para la creacion de Empleados de la empresa Salmontt.
 *
 * @author msuarez
 * @version 1.0
 */

public class Main {

    /**
     * Punto de entrada para la ejecucion de la aplicación.
     *
     * @param args es el argumento de entrada
     */
    public static void main(String[] args){

        try {
            //Objeto direccion y Empleado, se imprime información completa
            Direccion direccion = new Direccion("Avenida Concepcion", 1287, "Depto 503", "Colina", "RM");
            Persona empleado = new Empleado("Matias", "Suarez", "17405315-7", direccion,"+56965995289",
                    "20-01-2020", "Encargado TI","Informatica", "mati.suarez@duocuc.cl", 5000);
            System.out.printf(empleado.toString());

            System.out.println("-----------------------------");

            //Objeto empleado con constructor completo
            Persona empleado2 = new Empleado("Oriana", "Muñoz", "6068555-9", "Nuñez de Balboa", 1123,"Casa 15",
                    "Santiago", "RM", "+56960524879", "20-01-2020", "Encargado TI","Informatica", "mati.suarez@duocuc.cl", 3000);
            System.out.printf(empleado2.toString());

            System.out.println("-----------------------------");

            //Objeto empleado
            Persona empleado3 = new Empleado("Victoria", "Suarez", "26680048-7", null,"", "20-01-2020", "Encargado TI",
                    "Informatica", "", 2000);
            System.out.printf(empleado3.toString());

            System.out.println("-----------------------------");

            //Objeto empleado con campos nulos o vacios
            Persona empleado4 = new Empleado("Matias", "Suarez", "17404347-7", null,
                    null, "20-01-2020", "Encargado TI",
                    "Informatica", "", 1000);
            System.out.printf(empleado4.toString());

            System.out.println("-----------------------------");

            //Objeto empleado con campos nulos o vacios y sueldo negativo (arroja excepción)
            Persona empleado5 = new Empleado("Matias", "Suarez", "17404347-7", null,
                    null, "20-01-2020", "Encargado TI",
                    "Informatica", "", 1000);
            System.out.printf(empleado4.toString());

            System.out.println("-----------------------------");

            Direccion direccion2 = new Direccion("Avenida",123,null,"runge","RM");
            Persona persona = new Empleado();
            persona.setNombre("Diego");
            persona.setApellido("Varela");
            persona.setRut("15682541-7");
            persona.setTelefono("+56987456213");
            persona.setDireccion(direccion2);

            System.out.println(persona);

            System.out.println("-----------------------------");

            Empleado persona1 = new Empleado();
            persona1.setNombre("Luis");
            persona1.setApellido("Dinamarca");
            persona1.setRut("6068595-7");
            persona1.setTelefono("+5695040666");
            persona1.setDireccion("Puerto grande",2000,"Parcela 25","Chile chico","XII");
            persona1.setFechaIngreso("01-01-2020");
            persona1.setDepartamento("Administrativo");
            persona1.setCargo("Gerente Administración");
            persona1.setEmail("correo@correo.cl");
            persona1.setSueldo(7000);

            System.out.println(persona1);

            Rut r = new Rut("123456-8");


        } catch (ValidaRutException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}