/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenconvocatoriaordinariafilmbrowser.Control.repo;

import examenconvocatoriaordinariafilmbrowser.Model.Film;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 * @author Antonio Miguel Martel
 * 
 * Solo habra un repositorio de films
 * 
 * Usamos Singleton. Tambien le aplicaremos iterator.
 */
public class FilmRepository {

    private static Set<Film> filmsList;
    

    public FilmRepository() {
        // Especificamos un default
       filmsList = new TreeSet<>(FilmComparator.getNameComparator());
    }
    
    public static void add(Collection<Film> filmsList){
        filmsList.forEach(film -> {
            FilmRepository.filmsList.add(film);
        });
    }
    
    public static void add(Film film){
       FilmRepository.filmsList.add(film);
    }
    
    public static Set<Film> get() {
        return filmsList;
    }
    
    // Me da mala vibra este metodo pero bueno voy con prisas asi que
    //asi se queda.
    public static void changeSearchOrder(Comparator<Film> selected) {
        Set<Film> newFilmsList = new TreeSet<>(selected);
        newFilmsList.add((Film) filmsList);
        filmsList = newFilmsList;
    }
     
    
}
