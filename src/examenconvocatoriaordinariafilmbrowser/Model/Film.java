/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenconvocatoriaordinariafilmbrowser.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Antonio Miguel Martel
 */
public class Film {
    
    final String name;
    final String genre;
    int views;
    final Map<Person, Integer> califications = new HashMap<>();
    final Image cover;
    final Person director;
    final List<Person> actors;
    final long duration;

    public Film(String name, String genre, Image cover, Person director, List<Person> actors, long duration) {
        this.name = name;
        this.genre = genre;
        this.cover = cover;
        this.director = director;
        this.actors = actors;
        this.duration = duration;
    }
    

    public void isViewed() {
        views = views + 1;
    }

    public void isRated(int calification, Person person) {
        califications.put(person, calification);
    }
    
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getViews() {
        return views;
    }

    public int getCalification() {
        int sol = 0;
        for ( Entry<Person, Integer> entry : califications.entrySet()) {
            sol = sol + entry.getValue();
        }
        return califications.size() == 0? 0 : sol/califications.size() * 100;
    }

    public Image getCover() {
        return cover;
    }

    public Person getDirector() {
        return director;
    }

    public List<Person> getActors() {
        return actors;
    }

    public long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Film{" + "name=" + name + ", genre=" + genre + ", views=" + views + ", califications=" + califications + ", cover=" + cover + ", director=" + director + ", actors=" + actors + ", duration=" + duration + '}';
    }
    
    
    
}
