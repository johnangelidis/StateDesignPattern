package StateDesignPattern;
/**
 * Class that represents the home state of a tv.
 */
public class HomeState implements State {
    private TV tv;
    public HomeState(TV tv){
        this.tv=tv;
    }
    /**
     * Method that represents pressing the home button on a TV remote.
     */
    public void pressHomeButton() {
        System.out.println("The TV is already on the home screen");
        System.out.println();
        
    }
    /**
     * Method that represents pressing the netflix button on a TV remote.
     * Changes the state of the tv to netflix.
     */
    public void pressNetflixButton() {
        System.out.println("Loading netflix...");
        tv.setState(tv.getNetflixState());
        System.out.println();
    }
    /**
     * Method that represents pressing the hulu button on a TV remote.
     * Changes the state of the tv to hulu.
     */
    public void pressHuluButton() {
        System.out.println("Loading hulu...");
        tv.setState(tv.getHuluState());
        System.out.println();
    }
    /**
     * Method that represents pressing the movie button on a TV remote.
     */
    public void pressMovieButton() {
        System.out.println("You must pick an app to show movies.");
    }
    /**
     * Method that represents pressing the tv show button on a TV remote.
     */
    public void pressTVButton() {
        System.out.println("You must pick an app to show tv shows."); 
    }
    
}
