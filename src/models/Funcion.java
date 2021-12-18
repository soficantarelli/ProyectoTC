package models;

import java.util.ArrayList;

public class Funcion extends ID {
    
    private ArrayList<Variable> params;

    public Funcion(){
        this.params = new ArrayList<Variable>();
    }

    public Funcion(String tipoDato, String nombre, Boolean inicializado, Boolean usado) {
        super(tipoDato, nombre, inicializado, usado);
        this.params = new ArrayList<Variable>();
    }


    public ArrayList<Variable> getParams() {
        return params;
    }

    public void setParams(ArrayList<Variable> params) {
        this.params = params;
    }

    public boolean areParametersEquals(ArrayList<Variable> parameters){
        return this.params.equals(parameters);    
    }

    @Override
    public String toString() {
        return getTipoDato() + " " + getNombre() + "(" + this.params.toString() + ")";     

    }
}