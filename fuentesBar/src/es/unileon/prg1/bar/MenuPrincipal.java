package es.unileon.prg1.bar;

/**
 * Clase que visualiza los distintos menus y bebidas. 
 * @author PRG
 * @version 1.0
 **/

public class MenuPrincipal {
    
    Bar bar;
    Teclado teclado;
    
    public MenuPrincipal(Bar bar) {
    	this.bar = bar;
    	teclado = new Teclado();
    }
    
    void mostrarMenuPrincipal(){
     	System.out.println();
    	System.out.println("Bar " + bar.getNombre());
    	System.out.println("1 - Comer menu");
    	System.out.println("2 - Un refresco");
    	System.out.println("3 - Salir");
    	System.out.println();
    	System.out.println("Seleccione una opcion...");
    }
    
    void mostrarMenuComer(){
     	System.out.println();
    	System.out.println("Menus");
    	System.out.println("1 - " + bar.getMenu(1));
    	System.out.println("2 - " + bar.getMenu(2));
    	System.out.println("3 - " + bar.getMenu(3));
    	System.out.println("4 - Salir");
    	System.out.println();
    	System.out.println("Seleccione una opcion...");
    }
		
    void mostrarMenuBebida(){
     	System.out.println();
    	System.out.println("Bebidas");
    	System.out.println("1 - " + bar.getBebida(1));
    	System.out.println("2 - " + bar.getBebida(2));
    	System.out.println("3 - " + bar.getBebida(3));
    	System.out.println("4 - Salir");
    	System.out.println();
    	System.out.println("Seleccione una opcion...");
    }
		
    boolean menu(){
    	int opcion = 3;
    	boolean correcta, salir;
    	
    	salir = false;
    	correcta = false;
    	mostrarMenuPrincipal();
    	while (!correcta){
    	    opcion = Integer.parseInt(teclado.leerLinea());
    	    if ( (opcion >= 1) && (opcion <= 3) ) {
    		    correcta = true;
				System.out.println("opcion=" + opcion);
    	    } else {
        		System.out.println();
        		System.out.println("ERROR: Opcion incorrecta");
        		System.out.println();
        		mostrarMenuPrincipal();
    	    }
    	}
	
    	switch (opcion){
    	case 1:
    	    while (!salir)
    		salir = menuComer();
    	    salir = false;
    	    break;
    	case 2:
    	    while (!salir)
    		salir = menuBebida();
    	    salir = false;
    	    break;
    	case 3: 
    	    salir = true;
    	}
    	
    	return salir;
    }
    
    boolean menuComer(){
		int opcion = 4;
    	boolean correcta, salir;
    	
    	salir = false;
    	correcta = false;
    	mostrarMenuComer();
    	while (!correcta){
    	    opcion = Integer.parseInt(teclado.leerLinea());
    	    if ( (opcion >= 1) && (opcion <= 4) ) {
        		correcta = true;
    	    } else {
        		System.out.println();
        		System.out.println("ERROR: Opcion de comer incorrecta " + opcion);
        		System.out.println();
        		mostrarMenuComer();
    	    }
    	}

		if (opcion != 4) {
  		  bar.sirveMenu(opcion);    	    
		} else {
		  salir = true;
		}

    	return salir;
    }
    
    boolean menuBebida(){
    	int opcion = 4;
    	boolean correcta, salir;
    	
    	salir = false;
    	correcta = false;
    	mostrarMenuBebida();
    	while (!correcta){
    	    opcion = Integer.parseInt(teclado.leerLinea());
    	    if ( (opcion >= 1) && (opcion <= 4) ) {
    		    correcta = true;
    	    } else {
        		System.out.println();
        		System.out.println("ERROR: Opcion de beber incorrecta");
        		System.out.println();
        		mostrarMenuBebida();
    	    }
    	}

		if (opcion != 4) {
  		  bar.sirveBebida(opcion);    	    
		} else {
		  salir = true;
		}


    	return salir;
    }
    
}
