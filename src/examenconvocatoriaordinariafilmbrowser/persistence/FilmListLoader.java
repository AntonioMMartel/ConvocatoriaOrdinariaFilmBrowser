package examenconvocatoriaordinariafilmbrowser.persistence;

import examenconvocatoriaordinariafilmbrowser.Model.Film;
import java.util.List;

/**
 *
 * @author Antonio Miguel Martel
 */
public interface FilmListLoader {
    
    public List<Film> load();
    
}
