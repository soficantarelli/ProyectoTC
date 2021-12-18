package models;

public abstract class ID {

    private String tipoDato;
    private String nombre;  
    private Boolean inicializado;
    private Boolean usado;
    private String valor;

    
    public ID() {

    }

    public ID(String tipoDato, String nombre, Boolean inicializado, Boolean usado) {
        this.tipoDato = tipoDato;
        this.nombre = nombre;
        this.inicializado = inicializado;
        this.usado = usado;
    }

    public String getTipoDato(){
        return tipoDato;
    }
    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean isInicializado() {
        return inicializado;
    }

    public void setInicializado(Boolean inicializado) {
        this.inicializado = inicializado;
    }

    public Boolean isUsado() {
        return usado;

    }
    public void setUsado(Boolean usado) {
        this.usado = usado;  
    }
    
    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tipo:" + this.tipoDato + " " + " Nombre:" + this.nombre + " usada:" + this.usado;

    }
}