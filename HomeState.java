package StateDesignPattern;
public class HomeState implements State {
    private TV tv;
    public HomeState(TV tv){
        this.tv=tv;
    }

    public void pressHomeButton() {
        System.out.println("The TV is already on the home screen");
        System.out.println();
        
    }

    public void pressNetflixButton() {
        System.out.println("Loading netflix...");
        tv.setState(tv.getNetflixState());
        System.out.println();
    }

    public void pressHuluButton() {
        System.out.println("Loading hulu...");
        tv.setState(tv.getHuluState());
        System.out.println();
    }

    public void pressMovieButton() {
        System.out.println("You must pick an app to show movies.");
    }

    public void pressTVButton() {
        System.out.println("You must pick an app to show tv shows."); 
    }
    
}
