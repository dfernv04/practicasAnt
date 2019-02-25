package es.unileon.prg1.bar;


/**
 * Clase principal para la gestion de comidas y bebidas
 * @author PRG
 * @version 1.0
 **/

public class PruebaMenuPrincipal {
    
    public static void main(String[] args) {

    Bar bar;
    MenuPrincipal menuPrincipal;
    boolean salir;
    
    salir = false;
    if ( args.length != 1){
        System.out.println("\tSintaxis del programa:");
        System.out.println("\tjava PruebaMenuPrincipal nombreBar");
    }
    else{
        bar = new Bar(args[0]);
        menuPrincipal = new MenuPrincipal(bar);
        while (!salir) {
            salir = menuPrincipal.menu();
        }
    }
    }
    
}
