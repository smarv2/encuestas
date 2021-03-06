/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos.VO;

import java.io.Serializable;

/**
 *
 * @author smarv
 */
public class OpcionVO implements Serializable {
    
    
    /**
    * El campo {@code serialVersionUID}, es una instancia {@code long}.
    */
    private static final long serialVersionUID = 1L;
    
    /**
     * campo IdOpcion de tipo String.
     */
    private String IdOpcion;
    
    /**
     * campo NombreOpcion de tipo String.
     */
    private String NombreOpcion;
    
    /**
     * campo IdPregunta de tipo String.
     */
    private String IdPregunta;
    
    /**
     * campo NombrePregunta de tipo String.
     */
    private String NombrePregunta;
    
    /**
     * campo NombreEncuesta de tipo String.
     */
    private String NombreEncuesta;

    /**
     * @return the IdOpcion
     */
    public String getIdOpcion() {
        return IdOpcion;
    }

    /**
     * @param IdOpcion the IdOpcion to set
     */
    public void setIdOpcion(String IdOpcion) {
        this.IdOpcion = IdOpcion;
    }

    /**
     * @return the NombreOpcion
     */
    public String getNombreOpcion() {
        return NombreOpcion;
    }

    /**
     * @param NombreOpcion the NombreOpcion to set
     */
    public void setNombreOpcion(String NombreOpcion) {
        this.NombreOpcion = NombreOpcion;
    }

    /**
     * @return the IdPregunta
     */
    public String getIdPregunta() {
        return IdPregunta;
    }

    /**
     * @param IdPregunta the IdPregunta to set
     */
    public void setIdPregunta(String IdPregunta) {
        this.IdPregunta = IdPregunta;
    }

    /**
     * @return the NombrePregunta
     */
    public String getNombrePregunta() {
        return NombrePregunta;
    }

    /**
     * @param NombrePregunta the NombrePregunta to set
     */
    public void setNombrePregunta(String NombrePregunta) {
        this.NombrePregunta = NombrePregunta;
    }

    /**
     * @return the NombreEncuesta
     */
    public String getNombreEncuesta() {
        return NombreEncuesta;
    }

    /**
     * @param NombreEncuesta the NombreEncuesta to set
     */
    public void setNombreEncuesta(String NombreEncuesta) {
        this.NombreEncuesta = NombreEncuesta;
    }
    
    

}
