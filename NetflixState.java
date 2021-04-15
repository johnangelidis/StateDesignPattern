package StateDesignPattern;
import java.util.ArrayList;
/**
 * Class that represents the netflix state on a tv
 */
public class NetflixState implements State {
    private TV tv;
    private ArrayList<String> movies;
    private ArrayList<String> shows;
    public NetflixState(TV tv){
        this.tv=tv;
        movies = new ArrayList<String>();
        shows = new ArrayList<String>();
        //adding movies to netflix
        movies.add("The Godfather");
        movies.add("Kill Bill");
        movies.add("Scarface");
        movies.add("Coach Carter");
        movies.add("Remember The Titans");
        //adding shows to netflix
        shows.add("Breaking Bad");
        shows.add("Prison Break");
        shows.add("Lost");
        shows.add("Game of Thrones");
        shows.add("Law and Order");
    }
    /**
     * Method that represents pressing the home button on a TV remote.
     */
    public void pressHomeButton() {
        System.out.println("Loading the home screen...");
        tv.setState(tv.getHomeState());
    }
    /**
     * Method that represents pressing the netflix button on a TV remote.
     */
    public void pressNetflixButton() {
        System.out.println("We are already on Netflix.");
        
    }
    /**
     * Method that represents pressing the hulu button on a TV remote.
     * Changes the state of the tv to hulu.
     */
    public void pressHuluButton() {
        System.out.println("Loading hulu...");
        tv.setState(tv.getHuluState());
    }
    /**
     * Method that represents pressing the movie button on a TV remote.
     * Lists all the netflix movies available
     */
    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        for(String m:movies){
            System.out.println("- " + m);
        }
        System.out.println();
    }
    /**
     * Method that represents pressing the tv show button on a TV remote.
     * Lists all netflix shows available
     */
    public void pressTVButton() {
        System.out.println("Netflix TV Shows:"); 
        for(String s:shows){
            System.out.println("- " + s);
        }
        System.out.println();
    }
}
