package model;

import util.ValidaRutException;

/**
 *
 * @author msuarez
 * @version 1.0
 */

public class Empleado extends Persona{

    private String fechaIngreso;
    private String cargo;
    private String departamento;
    private String email;
    private double sueldo;

    public Empleado(){}

    public Empleado(String fechaIngreso,String cargo,String departamento, String email, double sueldo){ //Datos Empleado
        validaSueldo(sueldo);
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.departamento = departamento;
        this.email = email;
        this.sueldo = sueldo;
    }

    //Constructor datos Persona y empleado (Objeto Direccion)
    public Empleado(String nombre, String apellido, String textoRut, Direccion direccion, String telefono,
                    String fechaIngreso,String cargo,String departamento, String email, double sueldo) throws ValidaRutException {
       super(nombre, apellido, textoRut, direccion, telefono);
       validaSueldo(sueldo);
       this.fechaIngreso = fechaIngreso;
       this.cargo = cargo;
       this.departamento = departamento;
       this.email = email;
       this.sueldo = sueldo;
    }

    public Empleado(String nombre, String apellido, String textoRut, String calle, int numero, String casaDepartamento, String comuna, String region,
                    String telefono, String fechaIngreso,String cargo,String departamento, String email, double sueldo) throws ValidaRutException {
        super(nombre, apellido, textoRut, calle, numero, casaDepartamento, comuna, region, telefono);
        validaSueldo(sueldo);
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.departamento = departamento;
        this.email = email;
        this.sueldo = sueldo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEmail() {
        return email;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSueldo(double sueldo) {
        validaSueldo(sueldo);
        this.sueldo = sueldo;
    }

    public void validaSueldo(double sueldo){
        if (sueldo < 0){
            throw new IllegalArgumentException("El sueldo no puede ser menor a 0.");
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%-10s %s\n","F.Ingreso:",fechaIngreso));
        sb.append(String.format("%-10s %s\n","Cargo:",cargo));
        sb.append(String.format("%-10s %s\n","Depto.:",departamento));
        if (email != null && !email.isEmpty()) {
            sb.append(String.format("%-10s %s\n","Email:",email));
        }
        sb.append(String.format("%-10s %s\n","Sueldo:",sueldo));

        return sb.toString();
    }
}
