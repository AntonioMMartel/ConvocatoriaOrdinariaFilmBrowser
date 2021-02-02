/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenconvocatoriaordinariafilmbrowser.Control.repo;

import examenconvocatoriaordinariafilmbrowser.Model.Film;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * @author Antonio Miguel Martel
 * 
 * Solo habra un repositorio de films
 * 
 * Usamos Singleton. Tambien le aplicaremos iterator.
 */
public class FilmRepository {

    private static List<Film> filmsList;
    

    public FilmRepository() {
        // Especificamos un default
       filmsList = new ArrayList<>();
    }
    
    public static void add(Collection<Film> filmsList){
        filmsList.forEach(film -> {
            FilmRepository.filmsList.add(film);
        });
    }
    
    public static void add(Film film){
       FilmRepository.filmsList.add(film);
    }
    
    public static List<Film> get() {
        return filmsList;
    }
    
    // Me da mala vibra este metodo pero bueno voy con prisas asi que
    //asi se queda.
    public static void changeSearchOrder(Comparator<Film> selected) {
        Collections.sort(filmsList, selected);
    }
     
    
}
