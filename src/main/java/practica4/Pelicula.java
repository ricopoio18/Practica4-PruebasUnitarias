package practica4;
/**
 * Clase Película que simiula la información de una película
 * @author Josué Rodrigo Rico Arreola
 * @version 1.0
 */
public class Pelicula {
    String titulo;
    String director;
    int añoEstreno;
    String genero;
    int duracion;

    /**
     * Constructor sin parámentros de la clase
     */
    public Pelicula(){
        titulo = "Raging Bull";
        director = "Martin Scorsese";
        añoEstreno = 1980;
        genero = "Deporte, drama";
        duracion = 129;
    }

    /**
     * Constructor de la clase con parámetros
     * @param titulo
     * @param director
     * @param añoEstreno
     * @param genero
     * @param duracion
     */
    public Pelicula(String titulo, String director, int añoEstreno, String genero, int duracion){
        this.titulo = titulo;
        this.director = director;
        this.añoEstreno = añoEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    /**
     * Métodos para obtener los atributos de la clase
     * @return
     */
    public String getTitulo(){return titulo;}
    public String getDirector(){return director;}
    public int getAñoEstreno(){return añoEstreno;}
    public String getGenero(){return genero;}
    public int getDuracion(){return duracion;}

    /**
     * Método para obtener la informacion de la película
     * @return
     */
    public String getInformacion(){
        return "Título: " + titulo + ", Director: " + director + ", Año: "
                + añoEstreno + ", Género: " + genero + ", Duración: " + duracion + " min";
    }

    /**
     * Método para verificar si una película es clásica
     * @param añoActual
     * @return
     */
    public boolean esClasica(int añoActual){
        boolean esClasica = false;
        if ((añoActual - añoEstreno) > 25){
            esClasica = true;
        }
        return esClasica;
    }

    /**
     * Método toString de la clase
     * @return
     */
    public String toString(){
        return "Título: " + titulo + "\nDirector: " + director + "\nAño de estreno: "
                + añoEstreno + "\nGenero: " + genero + "\nDuracion: " + duracion + " minutos";
    }
}