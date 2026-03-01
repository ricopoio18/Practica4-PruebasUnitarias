import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import practica4.Pelicula;

public class PeliculaTest {

    @Test
    public void ConstructorPeliculaTestSinParametros() {
        Pelicula pelicula = new Pelicula();
        assertEquals("Raging Bull", pelicula.getTitulo());
        assertEquals("Martin Scorsese", pelicula.getDirector());
        assertEquals(1980, pelicula.getAñoEstreno());
        assertEquals("Deporte, drama", pelicula.getGenero());
        assertEquals(129, pelicula.getDuracion());
    }
    @Test
    public void ConstructorPeliculaTestConParametros(){
        Pelicula pelicula = new Pelicula("El Padrino", "Francis Ford Coppola", 1972, "Drama", 175);

        assertEquals("El Padrino", pelicula.getTitulo());
        assertEquals("Francis Ford Coppola", pelicula.getDirector());
        assertEquals(1972, pelicula.getAñoEstreno());
        assertEquals("Drama", pelicula.getGenero());
        assertEquals(175, pelicula.getDuracion());
    }
    @Test
    public void getInformacionTest(){
        Pelicula pelicula = new Pelicula("Pulp Fiction", "Quentin Tarantino", 1994, "Crimen", 154);

        String infoEsperada = "Título: Pulp Fiction, Director: Quentin Tarantino, Año: 1994, Género: Crimen, Duración: 154 min";
        assertEquals(infoEsperada, pelicula.getInformacion());
    }
    @Test
    public void testEsClasica() {
        Pelicula peliculaClasica = new Pelicula("Casablanca", "Michael Curtiz", 1942, "Romance", 102);
        Pelicula peliculaNoClasica = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia Ficción", 148);

        assertTrue(peliculaClasica.esClasica(2026));
        assertFalse(peliculaNoClasica.esClasica(2026));
    }
    @Test
    public void testToString() {
        Pelicula pelicula = new Pelicula("Matrix", "Hermanas Wachowski", 1999, "Ciencia Ficción", 136);

        assertTrue(pelicula.toString().contains("Matrix"));
        assertTrue(pelicula.toString().contains("1999"));
    }


}
