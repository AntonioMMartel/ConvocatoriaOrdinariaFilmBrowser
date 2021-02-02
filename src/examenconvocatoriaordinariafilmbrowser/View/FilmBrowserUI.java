/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenconvocatoriaordinariafilmbrowser.View;

import examenconvocatoriaordinariafilmbrowser.Model.Film;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface FilmBrowserUI {
    
    
    public void displayCurrent();
    public int getIndex();
    public void setIndex(int i);
    public List<Film> getFilmList();
    
}
