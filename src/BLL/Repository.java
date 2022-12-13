/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package BLL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author pedro
 */
public class Repository {
    
    private List<ParqueContentores> parques;
    private List<Contentor> contentores;
    private List<Trabalhadores> trabalhadores;
    private List<OrdensServico> ordens;
    private Set<Utilizador> utilizadores;
    private List<Administrador> administradores;
    private List<Municipio> municipios;
    private List<Gestor> gestores;
    private List<Equipa> equipas;
    private List<TiposResiduos> tiposResiduos;
    
    
    private static Repository bd=null;
    
    private Repository(){
        
       
        
        parques = new ArrayList();
        contentores = new ArrayList();
        trabalhadores = new ArrayList();
        ordens = new ArrayList();
        utilizadores = new HashSet<>();
        administradores = new ArrayList();
        municipios = new ArrayList();
        gestores = new ArrayList();
        equipas = new ArrayList();
        tiposResiduos = new ArrayList();
        
    }
    
    
    public static Repository getInstance(){
        
        if (bd == null){
            bd = new Repository();
        }
        
        return bd;
    }
    
   

    public List<ParqueContentores> getParques() {
        return parques;
    }

    public void setParques(List<ParqueContentores> parques) {
        this.parques=parques;
    }

    public List<Contentor> getContentores() {
        return contentores;
    }

    public void setContentores(List<Contentor> contentores) {
        this.contentores = contentores;
    }

    public List<Trabalhadores> getTrabalhadores() {
        return trabalhadores;
    }

    public void setTrabalhadores(List<Trabalhadores> trabalhadores) {
        this.trabalhadores = trabalhadores;
    }

    public List<OrdensServico> getOrdens() {
        return ordens;
    }

    public void setOrdens(List<OrdensServico> ordens) {
        this.ordens = ordens;
    }

    public Set<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    public void setUtilizadores(Set<Utilizador> utilizadores) {
        this.utilizadores = utilizadores;
    }

    public List<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    public List<Gestor> getGestores() {
        return gestores;
    }

    public void setGestores(List<Gestor> gestores) {
        this.gestores = gestores;
    }

    public List<Equipa> getEquipas() {
        return equipas;
    }

    public void setEquipas(List<Equipa> equipas) {
        this.equipas = equipas;
    }

    public List<TiposResiduos> getTiposResiduos() {
        return tiposResiduos;
    }

    public void setTiposResiduos(List<TiposResiduos> tiposResiduos) {
        this.tiposResiduos = tiposResiduos;
    }
    
    public synchronized void novoUtilizador(Utilizador u){
        this.utilizadores.add(u);
    }
    
    public synchronized void novoResiduo(TiposResiduos tr){
        this.tiposResiduos.add(tr);
    }
    
    public synchronized void novaOrdem(OrdensServico o){
        this.ordens.add(o);
    }
    
    public synchronized void novoContentor(Contentor c){
        this.contentores.add(c);
    }
    
    public synchronized void novoParque(ParqueContentores p){
        this.parques.add(p);
    }
    
    public synchronized void novoTrabalhador(Trabalhadores t){
        this.trabalhadores.add(t);
    }
    
    public synchronized void novaEquipa(Equipa e){
        this.equipas.add(e);
    }
    
    
    public boolean addTiposResiduos (TiposResiduos tipoResiduo) throws Exception{
        boolean found=false;
        
        for(TiposResiduos tr: getTiposResiduos())
            if (tr.getNomeTipo().equals((tipoResiduo.getNomeTipo()))){
                found = true;
                break;
            }
        if(!found){
            getTiposResiduos().add(tipoResiduo);
            return true;
        }
        throw new Exception("Erro: Tipo de Resíduo já exite!");
    }  
    
    public boolean addOrdensServico (OrdensServico ordem) throws Exception{
        boolean found=false;
        
        for(OrdensServico os: getOrdens())
            if (os.getDescricao() == ordem.getDescricao()){
                found = true;
                break;
            }
        if(!found){
            getOrdens().add(ordem);
            return true;
        }
        throw new Exception("Erro: Ordem de Serviço já exite!");
    }
    
    public boolean addContentor (Contentor contentor) throws Exception{
        boolean found=false;
        
        for(Contentor cn: getContentores())
            if (cn.getIdContentor() == contentor.getIdContentor()){
                found = true;
                break;
            }
        if(!found){
            getContentores().add(contentor);
            return true;
        }
        throw new Exception("Erro: Contentor já exite!");
    } 
    
    public boolean addParquesContentores (ParqueContentores parqueContentor) throws Exception{
        boolean found=false;
        
        for(ParqueContentores pc: getParques())
            if (pc.getNome() == parqueContentor.getNome()){
                found = true;
                break;
            }
            if(!found){
                getParques().add(parqueContentor);
                return true;
            }
            throw new Exception("Erro: Contentor já exite!");
        }
    
    public boolean addTrabalhador (Trabalhadores trabalhador) throws Exception{
        boolean found=false;
        System.out.println("Enter Function REP Trabalhadores" + getTrabalhadores().size());
        try{
        for(Trabalhadores t: getTrabalhadores())
            if (t.getNifTrabalhador() == trabalhador.getNifTrabalhador()){
                found = true;
                break;
            }
        if(!found){
                getTrabalhadores().add(trabalhador);
            return true;
        }
      
        }catch(NullPointerException e){
            System.out.println("Adicione novo trablhador.");
            getTrabalhadores().add(trabalhador);
        }
             
        System.out.println("Size Trabalhadores " + getTrabalhadores().size());
        throw new Exception("Erro: Trabalhador já existe em sistema!");  
        
    }
    
    
    
    
    public static void serializar(String filename) {
        // Serializar um objeto para ficheiro
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(bd);
            System.out.println("Serialized data is saved in " + filename);
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
   
    public static void desserializar(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            bd = (Repository) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Cliente class not found. " + ex.getMessage());
        }
    }
    
    
    
}
