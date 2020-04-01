package principal;

import metodos.MandaPantalla;

/**
 * Programa principal (punto de entrada del proyecto) que usa los métodos auxiliares para salto de la clase MandaPantalla
 * @author sergio.montalban@campusfp.es
 * @version 1.1
 * @see <a href='https:/www.mipaginaweb.com'> mipagina.com - Aprender a programar </a>
 */

public class Main {

    /**
     * Punto de entrada único al proyecto
     * <ul>
     *  <li>Utiliza métodos sinSalto
     *  <li>Utiliza métodos conSalto
     * </ul>
     * @param args es un array de tipo String
     */
    
    public static void main(String[] args) { 
        MandaPantalla mp = new MandaPantalla();
        mp.conSalto("Esto es una línea con salto");
        mp.sinSalto("Esto es una línea sin salto");
    }
    
}
