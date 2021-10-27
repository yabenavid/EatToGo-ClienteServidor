/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.eattogo.client.access;

import co.unicauca.eattogo.commons.domain.Plate;
import java.util.List;

/**
 * Interface que define los servicios de persistencia de platos de un restaurante.
 */
public interface IPlateAccess {
    
    /**
     * Crear un plato especial.
     * @param plate plato del restaurante.
     * @return  verdadero o falso segun sea el resultado de la operacion.
     * @throws Exception error al crear el plato.
     */
    public String createPlate(Plate plate)throws Exception;
    
    /**
     * Obtiene una lista de los platos registrados.
     * @return Lista de platos
     * @throws Exception error al consultar los platos
     */
    public List<Plate> listPlate()throws Exception;
}
