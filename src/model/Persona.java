package model;

import util.ValidaRutException;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private Rut rut;
    private Direccion direccion;
    private String telefono;

    /** Constructo vacio para crear una persona por medio de la herencia*/
    public Persona(){}

    /**
     * Constructor que inicializa una persona con todos sus datos personales y de contacto
     *
     * @param nombre es el nombre de la persona en formato String.
     * @param apellido es el apellido de la persona en formato String.
     * @param textoRUT es la creacion del objeto de rut en formato String con su respectiva excepcion.
     * @param direccion es un objeto direccion con todos los datos del domicilio.
     * @param telefono es el telefono asociado al cliente.
     * @throws ValidaRutException si el textoRut no cumple con el formato.
     */
    public Persona(String nombre, String apellido, String textoRUT, Direccion direccion, String telefono) throws ValidaRutException {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = new Rut(textoRUT);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Sobre carga de metodo constructor que permite crear una persona con sus datos personales y los atributos individuales de la direccion
     * @param nombre es el nombre de la persona en formato String.
     * @param apellido es el apellido de la persona en formato String.
     * @param textoRUT el RUT de la persona que será validado al crear el objeto RUT
     * @param calle el nombre de la calle del domicilio
     * @param numero el numero de la calle del domicilio
     * @param casaDepartamento dato opcional para especificar si es un departamento o casa de condominio en el domicilio
     * @param comuna la comuna donde se encuentra el domicilio
     * @param region region geográfica del domicilio
     * @param telefono telefono de contacto de la persona
     * @throws ValidaRutException si el textoRut no cumple el formato esperado
     */
    public Persona(String nombre, String apellido, String textoRUT,
            String calle, int numero, String casaDepartamento, String comuna, String region,
            String telefono) throws ValidaRutException {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = new Rut(textoRUT);
        this.direccion = new Direccion(calle, numero, casaDepartamento, comuna,region);
        this.telefono = telefono;
    }

    /** Retorna el nombre de una Persona */
    public String getNombre(){
        return nombre;
    }

    /** Retorna el apellido de una Persona */
    public String getApellido(){
        return apellido;
    }

    /** Retorna el rut de una Persona */
    public Rut getRut(){
        return rut;
    }

    /** Retorna la direccion de una Persona */
    public Direccion getDireccion(){
        return direccion;
    }

    /** Retorna el telefono de una Persona */
    public String getTelefono(){
        return telefono;
    }

    /** Establece un nombre */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Establece un apellido */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /** Establece el RUT */
    public void setRut(Rut rut) {
        this.rut = rut;
    }

    /** Establece una direccion */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /** Establece un telefono */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Es una representacion textual de una persona con todos sus atributos como nombre, apellido, telefono y direccion
     * @return una cadena de texto con los atributos del cliente formateados
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append("Nombre:    ").append(nombre).append(" ").append(apellido).append("\n");
        sb.append(String.format("%-10s %s %s\n", "Nombre:", nombre, apellido));
        sb.append(rut);
        if (telefono != null && !telefono.isEmpty()) {
            //sb.append("Teléfono:  ").append(telefono).append("\n");
            sb.append(String.format("%-10s %s\n", "Teléfono:", telefono));
        }
        if (direccion != null && !direccion.toString().isEmpty()){
            sb.append(direccion);
        }

        return sb.toString();
    }
}
