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
public class Equipa extends Utilizador implements Serializable {
    
    private String nomeEquipa;
    private String chefeEquipa;
    
    private List<TiposResiduos> tipoResiduo;
    private List<Trabalhadores> trabalhador;
    private List<OrdensServico> ordens;
    private List<ParqueContentores> parques;
    
    
    public Equipa(String nomeEquipa, String chefeEquipa) {
        
        super();
        
        this.tipoResiduo = new ArrayList();
        this.trabalhador = new ArrayList();
        this.ordens = new ArrayList();
        this.parques = new ArrayList();
        
        this.nomeEquipa = nomeEquipa;
        this.chefeEquipa = chefeEquipa;
        
        
    }

    public Equipa() {
        
    }
    
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nomeEquipa;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nomeEquipa = nome;
    }

    /**
     * @return the tipoResiduo
     */
    public List<TiposResiduos> getTipoResiduo() {
        return tipoResiduo;
    }

    /**
     * @param tipoResiduo the tipoResiduo to set
     */
    public void setTipoResiduo(List<TiposResiduos> tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    /**
     * @return the trabalhador
     */
    public List<Trabalhadores> getTrabalhador() {
        return trabalhador;
    }

    /**
     * @param trabalhador the trabalhador to set
     */
    public void setTrabalhador(List<Trabalhadores> trabalhador) {
        this.trabalhador = trabalhador;
    }

    /**
     * @return the ordem
     */
    public List<OrdensServico> getOrdens() {
        return ordens;
    }

    /**
     * @param ordens the ordem to set
     */
    public void setOrdens(List<OrdensServico> ordens) {
        this.ordens = ordens;
    }

    /**
     * @return the parque
     */
    public List<ParqueContentores> getParques() {
        return parques;
    }

    /**
     * @param parques the parque to set
     */
    public void setParques(List<ParqueContentores> parques) {
        this.parques = parques;
    }

    /**
     * @return the chefeEquipa
     */
    public String getChefeEquipa() {
        return chefeEquipa;
    }

    /**
     * @param chefeEquipa the chefeEquipa to set
     */
    public void setChefeEquipa(String chefeEquipa) {
        this.chefeEquipa = chefeEquipa;
    }
    
    
    
    
    
}
