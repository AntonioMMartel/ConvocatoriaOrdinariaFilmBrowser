/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenconvocatoriaordinariafilmbrowser.Control.commands;

import examenconvocatoriaordinariafilmbrowser.View.FilmBrowserUI;

/**
 * @author Antonio Miguel Martel
 */
public class PreviousFilmCommand implements Command{

    private final FilmBrowserUI filmBrowserUI;

    public PreviousFilmCommand(FilmBrowserUI filmBrowserUI) {
        this.filmBrowserUI = filmBrowserUI;
    }
    
    @Override
    public void execute() {
        filmBrowserUI.setIndex(filmBrowserUI.getIndex() - 1);
        if(filmBrowserUI.getIndex() < 0) 
            filmBrowserUI.setIndex(filmBrowserUI.getFilmList().size() - 1);
        filmBrowserUI.displayCurrent();
    }
    
    
    
}
