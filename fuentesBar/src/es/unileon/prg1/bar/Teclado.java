package es.unileon.prg1.bar;

import java.io.*;

/**
 * Clase que recoge la pulsacion del teclado
 * @version 1.0
 **/

class Teclado{
    
    BufferedReader _entrada;
    
    Teclado() {
        try {
            _entrada = new BufferedReader(new InputStreamReader(System.in));
        } catch(Exception e) {
            System.out.println("Error en la lectura de teclado");
        }
    }
    
    char leerCaracter(){
        char c;
        
        c = ' ';
        try {
            c = (char)_entrada.read();
        } catch(Exception e) {
            System.out.println("Error en la lectura de teclado de un caracter");
        }
        return c;
    }
    
    String leerLinea(){
        String linea;
        
        linea = new String();
        try {
            linea = _entrada.readLine();
        } catch(Exception e) {
            System.out.println("Error en la lectura de teclado de una linea");
        }
        return linea;
    }
    
}
