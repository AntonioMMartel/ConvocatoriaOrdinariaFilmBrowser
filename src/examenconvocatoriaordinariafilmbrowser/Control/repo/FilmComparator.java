/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenconvocatoriaordinariafilmbrowser.Control.repo;

import examenconvocatoriaordinariafilmbrowser.Model.Film;
import java.util.Comparator;

/**
 *
 * @author Antonio Miguel Martel
 */
public class FilmComparator {
    public static Comparator<Film> getNameComparator() {
        
        return new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return compareStringAlphabetically(f1.getName(), f2.getName());
            }
        };
    }
    
    public static Comparator<Film> getGenreComparator() {
        
        return new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return compareStringAlphabetically(f1.getGenre(), f2.getGenre());
            }
        };
    }
    
    public static Comparator<Film> getCalificationComparator() {
        
        return new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return compareIntegers(f1.getCalification(), f2.getCalification());
            }
        };
    }
            

    
    private static int compareStringAlphabetically(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
    
    private static int compareIntegers(int i1, int i2){
        return i1 < i2? -1 : i1 > i2? 1: 0;
    }
    
}
