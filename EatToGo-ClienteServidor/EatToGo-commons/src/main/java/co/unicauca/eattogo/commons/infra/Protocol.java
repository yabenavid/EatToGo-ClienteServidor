package co.unicauca.eattogo.commons.infra;

import java.util.ArrayList;
import java.util.List;

/**
 * Protocolo de comunicación entre la aplicación cliente y el servidor
 *
 * @author 
 */
public class Protocol {
    /**
     * Atributos
     */
    private String resource;
    private String action;
    private List<Parameter> parameters;
    /**
     * Constructor por defecto
     */
    public Protocol() {
        parameters = new ArrayList<>();
    }
    /**
     * Setters y getters
     * @return 
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
    
    /**
     * Permite agregar un nuevo parámetro
     * @param name nombre de nuevo parámetro
     * @param value valor de nuevo parámetro
     */
    public void addParameter(String name, String value) {
        parameters.add(new Parameter(name, value));
    }

}

