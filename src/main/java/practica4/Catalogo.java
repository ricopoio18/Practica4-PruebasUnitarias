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
        Pelicula pelicula = new Pelicula();
        peliculas.add(pelicula);
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
        return peliculas.toString();
    }

    /**
     * Método buscar una película por título
     * @param titulo
     * @return
     */
    public String buscarPeliculaPorTitulo(String titulo){
        String s = "";
        for(Pelicula p: peliculas){
            if (titulo == p.getTitulo()){
                s = p.getInformacion();
            }
        }
        return s;
    }

    /**
     * Método toString para la clase Catalogo
     * @return
     */
    public String toString(){
        return peliculas.toString();
    }
}