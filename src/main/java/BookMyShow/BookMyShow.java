package BookMyShow;

public class BookMyShow {
    //Driver method

    MovieController movieController;
    TheatreController theatreController;
    BookMyShow(){
        movieController=new MovieController();
        theatreController=new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow=new BookMyShow();

    }

    private void initialize(){
        createMovies();
        createTheatre();
    }

    private void createTheatre() {

    }

    private void createMovies() {
        
    }
}
