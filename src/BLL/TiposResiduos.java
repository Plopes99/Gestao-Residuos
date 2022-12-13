/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;

/**
 *
 * @author pedro
 */
public class TiposResiduos implements Serializable {
    
    private String nomeTipo;
    
    public TiposResiduos(){
        
    }

    /**
     * @return the nomeTipo
     */
    public String getNomeTipo() {
        return nomeTipo;
    }

    /**
     * @param nomeTipo the nomeTipo to set
     */
    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }
    
    
    
}
