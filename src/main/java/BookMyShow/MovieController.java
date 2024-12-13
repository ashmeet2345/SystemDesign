package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovies;
    List<Movie> allMovies;

    //CRUD Operations
    MovieController(){
        cityVsMovies=new HashMap<>();
        allMovies=new ArrayList<>();
    }
 }
