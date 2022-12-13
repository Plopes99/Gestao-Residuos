/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.Date;
import java.io.Serializable;

/**
 *
 * @author pedro
 */
public class OrdensServico implements Serializable {
    
    private String descricao;
    private String dataOrdem;
    

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataOrdem
     */
    public String getDataOrdem() {
        return dataOrdem;
    }

    /**
     * @param dataOrdem the dataOrdem to set
     */
    public void setDataOrdem(String dataOrdem) {
        this.dataOrdem = dataOrdem;
    }

    
    
    
    
    
}
