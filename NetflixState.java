package StateDesignPattern;
import java.util.ArrayList;
public class NetflixState implements State {
    private TV tv;
    private ArrayList<String> movies;
    private ArrayList<String> shows;
    public NetflixState(TV tv){
        this.tv=tv;
        movies = new ArrayList<String>();
        shows = new ArrayList<String>();

        movies.add("The Godfather");
        movies.add("Kill Bill");
        movies.add("Scarface");
        movies.add("Coach Carter");
        movies.add("Remember The Titans");

        shows.add("Breaking Bad");
        shows.add("Prison Break");
        shows.add("Lost");
        shows.add("Game of Thrones");
        shows.add("Law and Order");
    }

    public void pressHomeButton() {
        System.out.println("Loading the home screen...");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("We are already on Netflix.");
        
    }

    public void pressHuluButton() {
        System.out.println("Loading hulu...");
        tv.setState(tv.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        for(String m:movies){
            System.out.println("- " + m);
        }
        System.out.println();
    }

    public void pressTVButton() {
        System.out.println("Netflix TV Shows:"); 
        for(String s:shows){
            System.out.println("- " + s);
        }
        System.out.println();
    }
}
