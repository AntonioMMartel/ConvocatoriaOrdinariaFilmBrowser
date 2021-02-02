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
public class CurrentFilmCommand implements Command{
    
    private final FilmBrowserUI filmUI;

    public CurrentFilmCommand(FilmBrowserUI filmDisplayer) {
        this.filmUI = filmDisplayer;
        
    }
    @Override
    public void execute() {
        filmUI.displayCurrent();
    }
    
}
