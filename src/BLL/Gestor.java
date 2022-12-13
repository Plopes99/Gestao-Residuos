/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Gestor extends Utilizador implements Serializable {
    
    private List<ParqueContentores> parque;
    
    public Gestor() {
        super();
        this.parque = new ArrayList();
        
    }
    
}
