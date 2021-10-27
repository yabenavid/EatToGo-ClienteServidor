/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.eattogo.client.access;

import co.unicauca.eattogo.commons.infra.Utilities;

/**
 * Fabrica que se encarga de instanciar PlateAcces o cualquier otro que
 * se cree en el futuro.
 */
public class FactoryPlate {
    
    /**
     * Atributo
     */
    private static FactoryPlate instance;

    /**
     * Constructor por defecto
     */
    private FactoryPlate() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static FactoryPlate getInstance() {

        if (instance == null) {
            instance = new FactoryPlate();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IPlateAcces
     *
     * @return una clase hija de la abstracción IPlateAcces
     */
    public IPlateAccess getPlateService() {

        IPlateAccess result = null;
        String type = Utilities.loadProperty("plate.service");

        switch (type) {
            case "default":
                result = new PlateAccessImplSockets();
                break;
        }

        return result;

    }
}
