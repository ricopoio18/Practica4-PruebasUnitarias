package practica4;

import java.util.ArrayList;


/**
 * Clase Catalogo que guarda un grupo de películas
 * @author Josué Rodrigo Rico Arreola
 * @version 1.0
 */
public class Catalogo {
    ArrayList<Pelicula> peliculas;
    /**
     * Constructor sin parámetros de la clase
     */
    public Catalogo() {
        peliculas = new ArrayList<>();
    }

    /**
     * Constructor de la clase con parámetros
     * @param pelicula
     */
    public Catalogo(Pelicula pelicula) {
        peliculas = new ArrayList<>();
        peliculas.add(pelicula);
    }

    /**
     * Método para obtener el número de películas
     * @return peliculas.size();
     */
    public int getNumeroPeliculas(){
        return peliculas.size();
    }

    /**
     * Método para agregar una película al catálogo
     * @param pelicula
     */
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    /**
     * Método para obtener las películas
     * @return
     */
    public String getPeliculas(){
        if (peliculas.isEmpty()){
            return "El catálogo está vacío";
        }
        return peliculas.toString();
    }

    /**
     * Método buscar una película por título
     * Utiliza un método equalsIgnoreCase() para que la comparación
     * no se a sensible a las mayúsuclas y minúsculas
     * @param titulo
     * @return
     */
    public String buscarPeliculaPorTitulo(String titulo){
        for(Pelicula p: peliculas){
            if (p.getTitulo().equalsIgnoreCase(titulo)){
                return p.getInformacion();
            }
        }
        return "No se encontró la película con título: " + titulo;
    }

    /**
     * Método toString para la clase Catalogo
     * @return
     */
    public String toString(){
        return getPeliculas();
    }
}