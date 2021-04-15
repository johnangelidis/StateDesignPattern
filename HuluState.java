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

    public void pressHomeButton() {
        System.out.println("Loading the home screen...");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("We are already on Hulu");
        
    }

    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        for(String m:movies){
            System.out.println("- " + m);
        }
        System.out.println();
    }

    public void pressTVButton() {
        System.out.println("Hulu TV Shows:"); 
        for(String s:shows){
            System.out.println("- " + s);
        }
        System.out.println();
    }
}

