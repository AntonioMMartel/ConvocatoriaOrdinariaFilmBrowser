/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenconvocatoriaordinariafilmbrowser.View;

import examenconvocatoriaordinariafilmbrowser.Control.repo.FilmComparator;
import examenconvocatoriaordinariafilmbrowser.Control.repo.FilmRepository;
import examenconvocatoriaordinariafilmbrowser.Model.Film;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author Antonio Miguel Martel
 */
public final class MockFilmBrowserUI implements FilmBrowserUI {
    
    private final FilmRepository filmRepo;
    private final FilmDisplayer display = new MockFilmDisplayer();
    private int index = 0;
    private List<Film> filmList = new ArrayList<>();
    private Iterator comparatorIterator;
    private Map<String, Comparator<Film>> comparators = new TreeMap<>();

    public MockFilmBrowserUI(FilmRepository filmRepo) {
        this.filmRepo = filmRepo;
        update();
        message();
        initComparators();
    }
    
    private void message() {
        System.out.println("Press a to see previous film");
        System.out.println("Press d to see next image");
        System.out.println("Press q to quit");
        System.out.println("Press o to change the order in which films are visualized.");
    }
    
    private void initComparators() {
        comparatorIterator = comparators.entrySet().iterator();
        comparators.put("name", FilmComparator.getNameComparator());
        comparators.put("genre", FilmComparator.getGenreComparator());
        comparators.put("calification", FilmComparator.getCalificationComparator());
    }

    
    
    public void changeOrder() { 
        Entry<String, Comparator<Film>> temp;
        if(comparatorIterator.hasNext()) {
            temp = (Entry<String, Comparator<Film>>) comparatorIterator.next();
            FilmRepository.changeSearchOrder(temp.getValue());
        } else {
            comparatorIterator = comparators.entrySet().iterator();
            temp = (Entry<String, Comparator<Film>>)  comparatorIterator.next();
            FilmRepository.changeSearchOrder(temp.getValue());
        }
        System.out.println("Se ha cambiado el orden a " + temp.getKey());
        update();
    }
    
    public void update(){
        filmList = new ArrayList<>(filmRepo.get());
        System.out.println(filmList);
        index = 0;
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

   
    
    
    
}
