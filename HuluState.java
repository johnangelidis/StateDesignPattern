package StateDesignPattern;
import java.util.ArrayList;
public class HuluState implements State {
    private TV tv;
    private ArrayList<String> movies;
    private ArrayList<String> shows;
    public HuluState(TV tv){
        this.tv=tv;
        movies = new ArrayList<String>();
        shows = new ArrayList<String>();

        movies.add("American Pie");
        movies.add("Step Brothers");
        movies.add("Anchorman");
        movies.add("The Campaign");
        movies.add("Talladega Nights");

        shows.add("The Office");
        shows.add("Parks and Recreation");
        shows.add("Modern Family");
        shows.add("Cobra Kai");
        shows.add("The Bachelor");
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
     * Changes the state of the tv to netflix.
     */
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }
    /**
     * Method that represents pressing the hulu button on a TV remote.
     */
    public void pressHuluButton() {
        System.out.println("We are already on Hulu");
        
    }
    /**
     * Method that represents pressing the movie button on a TV remote.
     * Lists all the hulu movies available
     */
    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        for(String m:movies){
            System.out.println("- " + m);
        }
        System.out.println();
    }
    /**
     * Method that represents pressing the tv show button on a TV remote.
     * Lists all hulu shows available
     */
    public void pressTVButton() {
        System.out.println("Hulu TV Shows:"); 
        for(String s:shows){
            System.out.println("- " + s);
        }
        System.out.println();
    }
}

