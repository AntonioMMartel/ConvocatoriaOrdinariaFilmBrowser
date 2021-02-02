/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenconvocatoriaordinariafilmbrowser;

import examenconvocatoriaordinariafilmbrowser.Control.commands.ChangeFilmOrderCommand;
import examenconvocatoriaordinariafilmbrowser.Control.commands.Command;
import examenconvocatoriaordinariafilmbrowser.Control.commands.NextFilmCommand;
import examenconvocatoriaordinariafilmbrowser.Control.commands.NullCommand;
import examenconvocatoriaordinariafilmbrowser.Control.commands.PreviousFilmCommand;
import examenconvocatoriaordinariafilmbrowser.Control.commands.QuitCommand;
import examenconvocatoriaordinariafilmbrowser.Control.repo.FilmRepository;
import examenconvocatoriaordinariafilmbrowser.Model.Film;
import examenconvocatoriaordinariafilmbrowser.View.FilmBrowserUI;
import examenconvocatoriaordinariafilmbrowser.View.MockFilmBrowserUI;
import examenconvocatoriaordinariafilmbrowser.persistence.FilmListLoader;
import examenconvocatoriaordinariafilmbrowser.persistence.MockFilmListLoader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Antonio Miguel Martel
 */
public class FilmBrowser {


    public static void main(String[] args) {
        
        FilmListLoader filmloader = new MockFilmListLoader();
        List<Film> films = filmloader.load();
        
        
        FilmRepository filmRepo = new FilmRepository();
        filmRepo.add(films);
        
        FilmBrowserUI filmBrowser = new MockFilmBrowserUI(filmRepo);
        
        Map<String, Command> commands = initCommands(filmBrowser);
        
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.next();
            //if (commands.containsKey(input)) commands.get(input).execute();
            commands.getOrDefault(input, new NullCommand()).execute();
        }
        
    }
    
    private static Map<String, Command> initCommands(FilmBrowserUI filmBrowser) {
        Map<String, Command> commands = new HashMap<>();
        commands.put("d", new NextFilmCommand(filmBrowser));
        commands.put("a", new PreviousFilmCommand(filmBrowser));
        commands.put("q", new QuitCommand());
        commands.put("o", new ChangeFilmOrderCommand(filmBrowser));
        return commands;
    }

}
