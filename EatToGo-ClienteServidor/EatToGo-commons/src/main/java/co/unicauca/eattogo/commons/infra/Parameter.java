package co.unicauca.eattogo.commons.infra;

/**
 * Parametro.
 * Lo usa la clase Protocol
 *
 */
public class Parameter {
    /**
     * Atributos
     */
    private String name;
    private String value;

    /**
     * Constructor parametrizado
     * @param name nombre
     * @param value valor
     */
    public Parameter(String name, String value) {
        this.name = name;
        this.value = value;
    }
    /**
     * Constructor por defecto
     */
    public Parameter() {

    }
    /**
     * Setters y getters
     * @return 
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
