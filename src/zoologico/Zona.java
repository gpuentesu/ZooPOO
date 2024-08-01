
package zoologico;

/**
 *
 * @author luisc
 */
public class Zona {
    
    private int numero;
    private String nombre;
    private int metros;    

    public Zona(String nombre, int metros, int numero) {
        
        this.numero = numero;
        this.nombre = nombre;
        this.metros = metros;
    }

    public int getNumero () {
        return numero;
    }
    
    public void setNumero (int numero) {
        this.numero = numero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }
    
    
    
}
