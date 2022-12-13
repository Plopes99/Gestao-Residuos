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
public class Trabalhadores implements Serializable {
    
    private String nome;
    private int nifTrabalhador;
    private int nSegSocial;
    private int contacto;
    private float salario;

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
     * @return the nifTrabalhador
     */
    public int getNifTrabalhador() {
        return nifTrabalhador;
    }

    /**
     * @param nifTrabalhador the nifTraballhador to set
     */
    public void setNifTrabalhador(int nifTrabalhador) {
        this.nifTrabalhador = nifTrabalhador;
    }

    /**
     * @return the nSegSocial
     */
    public int getnSegSocial() {
        return nSegSocial;
    }

    /**
     * @param nSegSocial the nSegSocial to set
     */
    public void setnSegSocial(int nSegSocial) {
        this.nSegSocial = nSegSocial;
    }

    /**
     * @return the contacto
     */
    public int getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Trabalhadores get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void remove(Trabalhadores t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
