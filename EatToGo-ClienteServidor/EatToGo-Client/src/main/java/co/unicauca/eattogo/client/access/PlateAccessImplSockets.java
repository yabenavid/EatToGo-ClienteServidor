/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.eattogo.client.access;

import co.unicauca.eattogo.client.infra.RestaurantSocket;
import co.unicauca.eattogo.commons.domain.Plate;
import co.unicauca.eattogo.commons.infra.JsonError;
import co.unicauca.eattogo.commons.infra.Protocol;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Personal
 */
public class PlateAccessImplSockets implements IPlateAccess {

    /**
     * Atributos
     */
    private RestaurantSocket mySocket;

    /**
     * Constructor: El servicio utiliza un socket para comunicarse con la
     * aplicación server
     */
    public PlateAccessImplSockets() {
        mySocket = new RestaurantSocket();
    }

    /**
     * Crea un Plato. Utiliza el socket para pedir el servicio al servidor
     *
     * @param plate Plato que se va a registrar
     * @return Nombre de plato
     * @throws Exception Error al crear el plato
     */
    @Override
    public String createPlate(Plate plate) throws Exception {
        String jsonResponse = null;
        String requestJson = createPlateRequestJson(plate);
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(PlateAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        System.out.println("******"+ jsonResponse); 
       if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(PlateAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Agregó correctamente, devuelve el nombre del plato
                return plate.getName();
            }

        }
    }
    /**
    * Crea la solicitud en formato json para crear el plato
    * 
    * @param plate Plato a registrar
    * @return solicitud en json
    */
    private String createPlateRequestJson(Plate plate) {

        Protocol protocol = new Protocol();
        protocol.setResource("plate");
        protocol.setAction("post");
        protocol.addParameter("name", plate.getName());
        protocol.addParameter("description", plate.getDescription());
        protocol.addParameter("price", plate.getPrice() + "");
        protocol.addParameter("category", plate.getCategory().toString());

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }

    /**
     * Extrae los mensajes de la lista de errores
     *
     * @param jsonResponse lista de mensajes json
     * @return Mensajes de error
     */
    private String extractMessages(String jsonResponse) {
        JsonError[] errors = jsonToErrors(jsonResponse);
        String msjs = "";
        for (JsonError error : errors) {
            msjs += error.getMessage();
        }
        return msjs;
    }

    /**
     * Convierte el jsonError a un array de objetos jsonError
     *
     * @param jsonError
     * @return objeto MyError
     */
    private JsonError[] jsonToErrors(String jsonError) {
        Gson gson = new Gson();
        JsonError[] error = gson.fromJson(jsonError, JsonError[].class);
        return error;
    }

    /**
     * Convierte jsonPlate, proveniente del server socket, de json a un objeto
     * Plate
     *
     * @param jsonPlate objeto plato en formato json
     * @return objeto Plate
     */
    private Plate jsonToPlate(String jsonPlate) {

        Gson gson = new Gson();
        Plate plate = gson.fromJson(jsonPlate, Plate.class);

        return plate;

    }
    /**
     * Crea la solicitud en formato json para listar los platos
     * 
     * @return solicitud en formato json
     */
    public String createListRequestJson() {
        Protocol protocol = new Protocol();
        protocol.setResource("plate");
        protocol.setAction("get");

        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        System.out.println("json: " + requestJson);

        return requestJson;
    }
    
    /**
     * Obtiene lista de platos. Utiliza el socket para pedir el servicio al servidor
     *
     * @return Lista de platos
     * @throws Exception Error al consultar los platos
     */
    @Override
    public List<Plate> listPlate() throws Exception {
        String jsonResponse = null;
        String requestJson = createListRequestJson();

        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();

        } catch (IOException ex) {
            Logger.getLogger(PlateAccessImplSockets.class.getName()).log(Level.SEVERE, "No hubo conexión con el servidor", ex);
        }
        if (jsonResponse == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {

            if (jsonResponse.contains("error")) {
                //Devolvió algún error                
                Logger.getLogger(PlateAccessImplSockets.class.getName()).log(Level.INFO, jsonResponse);
                throw new Exception(extractMessages(jsonResponse));
            } else {
                //Agregó correctamente, devuelve el nombre del plato
                List<Plate> platos = jsonToListPlate(jsonResponse);
                return platos;
            }
        }
    }
    
    /**
     * Convierte la lista jsonListPlates, proveniente del server socket, de json a una lista de platos
     *
     * @param jsonListPlates Lista de platos en formato json
     * @return Lista de objetos Plate
     */
    private List<Plate> jsonToListPlate(String jsonListPlates) {
        Gson gson = new Gson();
        List<Plate> plates = gson.fromJson(jsonListPlates, new TypeToken<List<Plate>>() {
        }.getType());
        return plates;
    }
}
