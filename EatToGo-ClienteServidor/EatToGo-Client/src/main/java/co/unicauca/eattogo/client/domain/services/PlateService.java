/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.eattogo.client.domain.services;

import co.unicauca.eattogo.client.access.IPlateAccess;
import co.unicauca.eattogo.commons.domain.Plate;
import java.util.List;

/**
 *  Es una fachada para comunicar la presentación con el
 * dominio
 */
public class PlateService {
    
    /**
     * Atributo
     */
    private final IPlateAccess service;

    /**
     * Constructor
     * @param service implementacion de tipo IPlateAccess
     */
    public PlateService(IPlateAccess service) {
        this.service = service;
    }
    /**
     * Crea un plato en el servidor remoto
     * @param plate Plato a crear
     * @return Nombre del plato
     * @throws Exception Error al registrar el plato
     */
    public String createPlate(Plate plate) throws Exception {
        return service.createPlate(plate);

    }
     /**
     * Obtiene los platos registrados en el servidor remoto
     *
     * @return Lista de objetos tipo Plate
     * @throws java.lang.Exception la excepcion se lanza cuando no logra conexión
     * con el servidor
     */
    public List<Plate> listPlate() throws Exception{
        return service.listPlate();
    }
}
