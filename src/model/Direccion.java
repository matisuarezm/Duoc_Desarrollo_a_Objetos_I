package model;

/**
 * Clase referente a detalles de la Direccion de los clientes de la empresa Salmontt de Puerto Montt
 * (calle, número, casa o Departamento, comuna y region) esta compone la clase {@link Persona} y así
 * manejar por separado los detalles de la dirección
 *
 * @author msuarez
 * @version 1.0
 */

public class Direccion {

    //Atributos de clase
    private String calle;
    private int numero;
    private String casaDepartamento;
    private String comuna;
    private String region;

    /**
     * Constructor vacio sin parametros, el cual permite crear un objeto sin inicializar sus atributos
     */
    public Direccion(){}

    /**
     * Constructor con parametros
     *
     * @param calle            nombre fisico de la ubicación del domicilio
     * @param numero           que define la casa ubicada en la calle
     * @param casaDepartamento dato opcional para especificar un conjunto de casas
     * @param comuna           lugar geografico donde se encuentra el domicilio dentro de la region
     * @param region           sector y ubicacion de un lugar en un pais
     */
    public Direccion(String calle, int numero, String casaDepartamento, String comuna, String region){
        this.calle = calle;
        this.numero = numero;
        this.casaDepartamento = casaDepartamento;
        this.comuna = comuna;
        this.region = region;
    }

    /**
     * Retorna el nombre de la calle
     *
     * @return calle, del tipo String
     */
    public String getCalle(){
        return calle;
    }

    /**
     * Retorna la numeracion de la calle
     *
     * @return numero, del tipo entero
     */
    public int getNumero(){
        return numero;
    }

    /**
     * Retorna un texto opcional a la numeracion en caso de ser algún departamento o condominio
     *
     * @return casaDepartamento, del tipo String
     */
    public String getCasaDepartamento(){
        return casaDepartamento;
    }

    /**
     * Retorna la comuna en donde se encuentra el domicilio dentro de la region
     *
     * @return del tipo String
     */
    public String getComuna(){
        return comuna;
    }

    /**
     * Retorna la region como complemento de la comuna
     *
     * @return del tipo String
     */
    public String getRegion(){return region;}


    /**
     * Establece la calle dentro de direccion
     *
     * @param calle the calle
     */
    public void setCalle(String calle){
        this.calle = calle;
    }

    /**
     * Establece la numeracion dentro de la calle
     *
     * @param numero the numero
     */
    public void setNumero(int numero){
        this.numero = numero;
    }

    /**
     * Establece datos adicionales y opcionales en la direccion
     *
     * @param casaDepartamento the casa departamento
     */
    public void setCasaDepartamento(String casaDepartamento){
        this.casaDepartamento = casaDepartamento;
    }

    /**
     * Establece la comuna dentro de la region
     *
     * @param comuna the comuna
     */
    public void setComuna(String comuna){
        this.comuna = comuna;
    }

    /**
     * Establece la region dentro de la direccion
     *
     * @param region the region
     */
    public void setRegion(String region){
        this.region = region;
    }

    /**
     * Es una representacion textual de la direccion física con todos sus atributos como calle, número,
     * Casa o departamento, comuna y región.
     * @return una cadena de texto con los datos de una dirección formateada.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s %s N° %s", "Dirección:", calle, numero));
        if (casaDepartamento != null && !casaDepartamento.isEmpty()) {
            sb.append(String.format(" %s", casaDepartamento));
        }
        sb.append(String.format(", %s, %s\n",comuna, region));

        return sb.toString();
    }

}
