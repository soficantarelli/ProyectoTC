package models;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

import java.util.ArrayList;


public class TablaSimbolos {

    private LinkedList<HashMap<String,ID>> tablaSimbolo; 

    public TablaSimbolos(){
        tablaSimbolo = new LinkedList<HashMap<String,ID>>();
    }

    /* Creo el contexto(mapa) dentro de la lista */
    public void agregarContexto(){
        HashMap<String, ID> contexto = new HashMap<String, ID>();
        this.tablaSimbolo.add(contexto);
    }

    public void addParamContext(){
        HashMap<String, ID> context = new HashMap<String, ID>();
        this.tablaSimbolo.add(context);
    }
    
    /* elimino el nuevo mapa -contexto- d la lista*/
    public void eliminarContexto(){
        this.tablaSimbolo.removeLast();
    }

    public void insertFunction(ID function){
        if (this.tablaSimbolo.size()>1){
            this.tablaSimbolo.get(this.tablaSimbolo.size()-2).put(function.getNombre(), function);
        } else{
            this.tablaSimbolo.get(this.tablaSimbolo.size()-1).put(function.getNombre(), function);
        }
    }
    
    public int getContexto(){
        return this.tablaSimbolo.size();
    }

    public HashMap<String,ID> getContextos(){
        return ((LinkedList<HashMap<String,ID>>)tablaSimbolo).getLast();
    }

    /*agrego al contexto actual que es el ultimo mapa de la lista*/
    public void agregarId(ID id){
        this.tablaSimbolo.getLast().put(id.getNombre(), id);
    }

    public ID encontrarIdLocal(String nombre){
        ID aux = tablaSimbolo.getLast().get(nombre);
        if(aux != null){
            return aux;
        }
        return null;
    }

    public ID encontrarId(String nombre){
        ID aux = tablaSimbolo.getLast().get(nombre);

        if(aux != null){
            return aux;
        }else{
            ListIterator<HashMap<String, ID>> iterador = this.tablaSimbolo.listIterator(tablaSimbolo.size()-1);

            while(iterador.hasPrevious()){
                aux = iterador.previous().get(nombre);
                if(aux != null)
                    return aux;
            }
        }
        
        return aux;
    }

    public ArrayList<String> sinUso(){

        ArrayList<String> variablesSinUSo = new ArrayList<String>();

        HashMap<String, ID> aux = this.tablaSimbolo.getLast();

        for(ID id : aux.values()){

            if(id instanceof Funcion && id.getNombre().equals("main")){
                continue;
            }

            if(!id.isUsado()){
                variablesSinUSo.add(id.getNombre());
            }

        }

        return variablesSinUSo;
    }

    public void imprimirTablaSimbolo(){
        int ctx = 1;
        System.out.println("\n=== SYMBOL TABLE ===");
        for (HashMap<String, ID> entry : this.tablaSimbolo) {
            System.out.println("Contexto: " + ctx++ + " {");
            for(ID id : entry.values()) {
                System.out.println("    " + id.toString());
            }
            System.out.println("}");
        }
    }

    public LinkedList<HashMap<String, ID>> getTablaSimbolos() {
        return tablaSimbolo;
    }

    @Override
    public String toString(){
        return tablaSimbolo.toString();
    }    
}