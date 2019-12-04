package com.prestamosapi.prestamosapi.dominio;

public class Domicilio {
    // Atributos
    private String domicilio;
    private Integer numero;
    private String piso;
    private String provincia;

    // Constructores
    public Domicilio(String domicilio, Integer numero, String piso, String provincia){
        this.domicilio= domicilio;
        this.numero= numero;
        this.piso= piso;
        this.provincia= provincia;
    }
    
    // Getters & Setters
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }
    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String toString(){
        return this.getDomicilio() + " " + this.getNumero() + ", " + this.getPiso() + " Provincia: " + this.getProvincia();
    }
}
