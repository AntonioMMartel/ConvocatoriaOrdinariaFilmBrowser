/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenconvocatoriaordinariafilmbrowser.View;

import examenconvocatoriaordinariafilmbrowser.Model.Film;

/**
 * @author Antonio Miguel Martel
 */
public class MockFilmDisplayer implements FilmDisplayer {

    @Override
    public void display(Film film) {
        System.out.println(film.toString());
    }
    
    
    
}
