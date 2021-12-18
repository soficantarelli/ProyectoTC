package models;

public class Variable extends ID {

    public Variable (){
        super();
    }

    public Variable(String tipoDato, String nombre, Boolean inicializado, Boolean usado) {
        super(tipoDato, nombre, inicializado, usado);
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof Variable) {
            if (getNombre().equals(((Variable) o).getNombre()) && getTipoDato().equals(((Variable) o).getTipoDato())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String variable = getTipoDato() + " " + getNombre() + " " + isInicializado() + " " + isUsado();
        return variable;
    }
}