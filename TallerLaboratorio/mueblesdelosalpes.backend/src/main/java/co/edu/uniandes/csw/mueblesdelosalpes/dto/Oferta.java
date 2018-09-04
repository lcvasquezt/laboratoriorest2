/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

public class Oferta {   
    
    public Oferta()
    {}    

    /**
     * Constructor de la clase con argumentos
     * @param idOferta Id de la oferta
     * @param loginUsuarioOfertante Verificar usuario
     * @param referenciaMueble Referencia del Mueble
     * @param oferta Oferta del Mueble
     */    
    public Oferta(int idOferta, String loginUsuarioOfertante, long referenciaMueble, int oferta)
    {
        this.idOferta = idOferta;
        this.loginUsuarioOfertante = loginUsuarioOfertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta = oferta;
    }    

    /**
     * Devuelve el Id de la oferta
     * @return idOferta Id de la oferta
     */    
    public int getIdOferta() {
        return idOferta;
    }
    /**
     * Modifica el Id de la oferta
     * @param idOferta Id de la oferta
     */
    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    /**
     * Devuelve el usuario agregado
     * @return loginUsuarioOfertante usuario agregado
     */     
    public String getLoginUsuarioOfertante() {
        return loginUsuarioOfertante;
    }

    /**
     * Modifica el usuario agregado
     * @param loginUsuarioOfertante usuario agregado
     */    
    public void setLoginUsuarioOfertante(String loginUsuarioOfertante) {
        this.loginUsuarioOfertante = loginUsuarioOfertante;
    }

    /**
     * Devuelve la Referencia del Mueble
     * @return referenciaMueble Referencia del Mueble
     */     
    public long getReferenciaMueble() {
        return referenciaMueble;
    }

    /**
     * Modifica la Referencia del Mueble
     * @param referenciaMueble Referencia del Mueble
     */    
    public void setReferenciaMueble(long referenciaMueble) {
        this.referenciaMueble = referenciaMueble;
    }

    /**
     * Devuelve la Oferta
     * @return oferta Oferta del Mueble
     */    
    public int getOferta() {
        return oferta;
    }

    /**
     * Modifica la Oferta
     * @param oferta Oferta del Mueble
     */    
    public void setOferta(int oferta) {
        this.oferta = oferta;
    }
    
    private int idOferta;
    private String loginUsuarioOfertante;
    private long referenciaMueble;
    private int oferta;    
}
