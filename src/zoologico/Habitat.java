
package zoologico;

/**
Estas clases estan sujetas a cambios y perspectivas
* del programador 
* 
* CUMPLA CON LOS CASOS DE USO
 */
public abstract class Habitat{
    
    private int numero;
    private String descripcion;
    private int año;
    
    private Zona zona;

    public Habitat(int numero, String descripcion, int año, Zona zona) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.año = año;
        this.zona = zona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    

 
}
