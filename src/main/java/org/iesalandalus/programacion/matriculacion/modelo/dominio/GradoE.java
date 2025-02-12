package org.iesalandalus.programacion.matriculacion.modelo.dominio;


//CAMBIOS V.3
public class GradoE extends Grado {
    private int numEdiciones;

    public GradoE(String nombre, int numAnios, int numEdiciones){
        super(nombre);
        setNumAnios(numAnios);
        setNumEdiciones(numEdiciones);
    }

    public int getNumEdiciones(){
        return numEdiciones;
    }

    public void setNumEdiciones(int numEdiciones){
        if (numEdiciones<=0){
            throw new IllegalArgumentException("El número de ediciones no puede ser menor ni igual a 0.");
        }
        this.numEdiciones = numEdiciones;
    }

    public void setNumAnios(int numAnios){
        if (numAnios != 1){
            throw new IllegalArgumentException("El Grado D solo puede tener 1 año.");
        }
        this.numAnios = numAnios;
    }

}
