/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenconvocatoriaordinariafilmbrowser.View;

import examenconvocatoriaordinariafilmbrowser.Control.repo.FilmRepository;
import examenconvocatoriaordinariafilmbrowser.Model.Film;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Antonio Miguel Martel
 */
public final class MockFilmBrowserUI implements FilmBrowserUI {
    
    private final FilmRepository filmRepo;
    private final FilmDisplayer display = new MockFilmDisplayer();
    private int index = 0;
    private List<Film> filmList = new ArrayList<>();

    public MockFilmBrowserUI(FilmRepository filmRepo) {
        this.filmRepo = filmRepo;
        update();
        message();
        
    }
    
    public void changeOrder() {
        //dfilmRepo.changeSearchOrder();
        
    }
    
    public void update(){
        filmList = new ArrayList<>(filmRepo.get());
    }

    @Override
    public void displayCurrent(){
        display.display(filmList.get(index));
    }

    public FilmRepository getFilmRepo() {
        return filmRepo;
    }

    public FilmDisplayer getDisplay() {
        return display;
    }

    @Override
    public int getIndex() {
        return index;
    }
    
    @Override
    public List<Film> getFilmList() {
        return filmList;
    }

    @Override
    public void setIndex(int index) {
        this.index = index;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    private void message() {
        

    }
    
    
    
}
