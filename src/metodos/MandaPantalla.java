package metodos;

/**
 * Programa que implementa una clase con métodos auxiliares para salto de línea en línea continua
 * @author sergio.montalban@campusfp.es
 * @version 1.1
 * @see <a href='https:/www.mipaginaweb.com'> mipagina.com - Aprender a programar </a>
 */
public class MandaPantalla {
    
    /**
     * Método para línea continua
     * @param s Un String que se muestra en pantalla sin salto 
     */
    
    public void sinSalto (String s) {
        System.out.print(s);
    
    }
    
    /**
     * Método para salto de línea
     * @param s Un String que se muestra en pantalla con salto 
     */
    
    public void conSalto (String s) {
        System.out.println(s);
    
    }
    
}
