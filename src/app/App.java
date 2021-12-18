package app;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import Codigo3Direcciones.*;
import errores.*;

public class App {
    public static void main(String[] args) throws Exception {
            
            CharStream input = CharStreams.fromFileName("src/app/codigo.c");
            reglasLexer lexer = new reglasLexer(input);            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            reglasParser parser = new reglasParser(tokens);
            reglasBaseListener escucha = new MiListener();            
            parser.addParseListener(escucha);


            ErrorListener errorsListener = new ErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorsListener);

            ParseTree tree = parser.prog();
            /*System.out.println(escucha);
            System.out.println(tree.toStringTree(parser));*/

            Codigo3DireccionesVisitor visitor = new Codigo3DireccionesVisitor();

            visitor.visit(tree);
            visitor.getResultado();
            visitor.generateCode();
    }
}