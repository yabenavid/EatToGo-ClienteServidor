package co.unicauca.eattogo.commons.infra;

/**
 * Representa un error
 *
 * 
 */
public class JsonError {

    /**
     * Ej. 404
     */
    private String code;
    /**
     * Ej. Not_found
     */
    private String error;
    /**
     * Ej. La cédula del cliente no existe
     */
    private String message;
    /**
     * Constructor por defecto
     */
    public JsonError() {
    }
    /**
     * Constructor parametrizado
     * @param code
     * @param error
     * @param message 
     */
    public JsonError(String code, String error, String message) {
        this.code = code;
        this.error = error;
        this.message = message;
    }
    /**
     * Setters y getters
     * @return 
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
