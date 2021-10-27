/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.eattogo.commons.domain;

/**
 * Clase Plato
 */
public class Plate {
    /**
     * nombre
     */
    private String name;
    
    /**
     * descripcion
     */   
    private String description;
    
    /**
     * precio
     */
    private int price;
    
    /**
     * categoria
     */
    private EnumCategory category;
    
    /**
     * Constructor parametrizado
     * @param name nombre
     * @param descripction descripcion
     * @param price precio
     * @param category categoria
     */
    public Plate(String name, String descripction, int price, EnumCategory category) {
        this.name = name;
        this.description = descripction;
        this.price = price;
        this.category = category;
    }
    
    /**
     * Constructor por defecto
     */
    public Plate() {     
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String descripction) {
        this.description = descripction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EnumCategory getCategory() {
        return category;
    }

    public void setCategory(EnumCategory category) {
        this.category = category;
    }   
}
