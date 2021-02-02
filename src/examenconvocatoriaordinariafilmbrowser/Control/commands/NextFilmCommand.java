package examenconvocatoriaordinariafilmbrowser.Control.commands;

import examenconvocatoriaordinariafilmbrowser.View.FilmBrowserUI;

/**
 * @author Antonio Miguel Martel
 */
public class NextFilmCommand implements Command {

    private final FilmBrowserUI filmUI;

    public NextFilmCommand(FilmBrowserUI filmDisplayer) {
        this.filmUI = filmDisplayer;
        
    }
    @Override
    public void execute() {
        filmUI.setIndex((filmUI.getIndex() + 1) % filmUI.getFilmList().size());
        filmUI.displayCurrent();
    }

}

