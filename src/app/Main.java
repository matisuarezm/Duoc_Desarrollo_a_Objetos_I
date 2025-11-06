package app;


import model.Direccion;
import model.Empleado;
import model.Persona;
import util.ValidaRutException;

public class Main {

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

            //Objeto empleado con campos nulos o vacios
            Persona empleado5 = new Empleado("Matias", "Suarez", "174043477", null,
                    null, "20-01-2020", "Encargado TI",
                    "Informatica", "", -1000);
            System.out.printf(empleado4.toString());


        } catch (ValidaRutException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}