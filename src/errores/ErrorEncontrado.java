package errores;

import java.util.ArrayList;

public class ErrorEncontrado {
    
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_RESET = "\u001B[0m";

    private String msgError;
    private String msgWarning;
    private String msgLine;
    private String msgSemantic;
    private String msgSyntactic;

    public ErrorEncontrado() {
        msgError = ANSI_RED + "Error: " + ANSI_RESET;
        msgWarning = ANSI_YELLOW + "Warning: " + ANSI_RESET;
        msgLine = "line: ";
        msgSemantic = " " + ANSI_BLUE + "(Error Semantico)" + ANSI_RESET;
        msgSyntactic = " " + ANSI_GREEN + "(Error Sintactico)" + ANSI_RESET;
    }
       
    public void errorSintactico(String position, String msg){
        System.out.println(msgError + msgLine + position + "; " + msg + msgSyntactic);
    }

    public void idDeclarado(int line, String nombre) {
        System.out.println(msgError + msgLine + line + "; '" + nombre + "' ya ha sido declarado" + msgSemantic);
    }

    public void idNoUsado(ArrayList<String> sinUso) {
        for (String id : sinUso) {
            System.out.println(msgWarning + "'" + id + "' ha sido declarado pero no usado" + msgSemantic);
        }
    }

    public void returnEnFuncionVoid(int line, String text) {
        System.out.println(msgError + msgLine + line + "; '" + text + "' return en funcion void" + msgSemantic);
    }

    public void noTieneReturnEnFuncionNoVoid(int line, String text) {
        System.out.println(msgError + msgLine + line + "; '" + text + "' no hay return en funcion no void" + msgSemantic);
    }

    public void returnDiferenteAlTipoDeFuncion(int line) {
        System.out.println(msgError + msgLine + line + "; tipo de dato y return son diferentes" + msgSemantic);
    }

    public void idNoDeclarado(int line, String text) {
        System.out.println(msgError + msgLine + line + "; '" + text + "' id no se encuentra declarado" + msgSemantic);
    }

    public void funcionNoDeclarada(int line, String text) {
        System.out.println(msgError + msgLine + line + "; '" + text + "' funcion no se encuentra declarado" + msgSemantic);
    }

    public void pocosArgumentos(int line, String text) {
        System.out.println(msgError + msgLine + line + "; '" + text + "' la funcion tiene menos argumentos del esperado" + msgSemantic);
    }

    public void muchosArgumentos(int line, String text) {
        System.out.println(msgError + msgLine + line + "; '" + text + "' la funcion tiene mas argumentos del esperado" + msgSemantic);
    }

    public void llamadaANoFuncion(int line, String text) {
        System.out.println(msgError + msgLine + line + "; '" + "El objeto '" + text + "' no es una funcion" + msgSemantic);
    }

    public void idNoAsignado(int line, String text) {
        System.out.println(msgError + msgLine + line + "; '" + text + "' el id no se encuentra asignado" + msgSemantic);
    }

    public void idNoInicializado(int line, String text) {
        System.out.println(msgError + msgLine + line + "; '" + text + "' el id no ha sido inicializado" + msgSemantic);
    }
}

