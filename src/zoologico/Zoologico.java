/*
 * Desarrollar el tema de Jswing que usted seleccione (parejas)
    Debe subir 6 versiones del codigo en github
    Aproveche y repase para el parcial
    
 */
package zoologico;

public class Zoologico {
    
    private String nombre;
    private int habitat;
    private String Animales;
    private String Zona;

    public Zoologico(String nombre, int habitat, String Animales, String Zona) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.Animales = Animales;
        this.Zona = Zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitat() {
        return habitat;
    }

    public void setHabitat(int habitat) {
        this.habitat = habitat;
    }

    public String getAnimales() {
        return Animales;
    }

    public void setAnimales(String Animales) {
        this.Animales = Animales;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String Zona) {
        this.Zona = Zona;
    }
    
 }
