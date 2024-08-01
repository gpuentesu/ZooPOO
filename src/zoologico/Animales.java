
package zoologico;


public class Animales extends Habitat{
    
    private String nombre;
    private String especie;

    private Habitat habitat;    

    public Animales(String nombre, String especie,Habitat habitat, int numero, String descripcion, int año, Zona zona) {
        super(numero, descripcion, año, zona);
        this.nombre = nombre;
        this.especie = especie;
        this.habitat = habitat;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }


}




