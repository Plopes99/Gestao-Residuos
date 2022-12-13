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
public class ParqueContentores implements Serializable {
    
    private String nome;
    private String localidade;
    private String morada;
      
    private List<Contentor> contentores;
    
    
    public ParqueContentores() {
        
        this.contentores = new ArrayList();
        
    }
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the localidade
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     * @param localidade the localidade to set
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * @return the contentores
     */
    public List<Contentor> getContentores() {
        return contentores;
    }

    /**
     * @param contentores the contentores to set
     */
    public void setContentores(List<Contentor> contentores) {
        this.contentores = contentores;
    }

    
    
}
