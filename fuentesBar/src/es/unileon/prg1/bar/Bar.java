package es.unileon.prg1.bar;

/**
 * Clase que representa un Bar. Sirve menus y comidas.
 * @author PRG
 * @version 1.0
 **/
class Bar{

    String nombre;

    Bar(String nombre){
        this.nombre = new String(nombre);
    }

	/**
	 * Devuelve el nombre del Bar.
	 * @return Nombre del bar
	 **/
    String getNombre(){
        return nombre;
    }

	String getMenu(int menu){

		String cad = "";

    	switch (menu){
    	case 1:
			cad = "Macarrones y bistec";
    	    break;
    	case 2:
			cad = "Ensalada y pescadilla";
    	    break;
    	case 3: 
			cad = "Paella y Chuleta de Sajonia";
    	}

		return cad;

	}

	String getBebida(int bebida){

		String cad = "";

    	switch (bebida){
    	case 1:
			cad = "Coca-cola";
    	    break;
    	case 2:
			cad = "Fanta";
    	    break;
    	case 3: 
			cad = "Cafe";
    	}

		return cad;

	}


    void sirveMenu(int menu){

		if (menu >= 1 && menu <= 3) {
		  System.out.println("Marchando una de " + getMenu(menu));
		} else {
		  System.out.println("Error: menu no disponible");
		}
        
    }

    void sirveBebida(int bebida){
		if (bebida >= 1 && bebida <= 3) {
  	      System.out.println("Aqui tienes tu " + getBebida(bebida));
		} else {
		  System.out.println("Error: bebida no disponible");
		}
    }


}
