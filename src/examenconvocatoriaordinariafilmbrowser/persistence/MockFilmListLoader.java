/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenconvocatoriaordinariafilmbrowser.persistence;

import examenconvocatoriaordinariafilmbrowser.Model.Film;
import examenconvocatoriaordinariafilmbrowser.Model.Image;
import examenconvocatoriaordinariafilmbrowser.Model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Antonio Miguel Martel
 */
public class MockFilmListLoader implements FilmListLoader {

    @Override
    public List<Film> load() {
        List<Film> list = new ArrayList<>();
        List<Person> people = new ArrayList<>();
        people.add(new Person("Manolo 1"));
        people.add(new Person("Manolo 2"));
        Person eustaquio = new Person("EustaquioDirector");
        
        list.add(new Film("Pepe", "Terror", new Image("Imagen 1"), eustaquio, people,137246));
        list.add(new Film("Albondiga", "Drama", new Image("Imagen 2347"), new Person("GerardoDirector"), people, 544444));
        list.add(new Film("ZZZZ", "Drama", new Image("Imagen 2347"), new Person("GerardoDirector"), people, 12));
        
        return list;
    }
    
    
    
}
