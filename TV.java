package StateDesignPattern;
/**
 * Class that represents a tv with different states
 */
public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    /**
     * Constructor that sets each instance of a state to a new state
     * Default state set to home state
     */
    public TV(){
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = HomeState;
    }
    /**
     * Method that represents pressing the home button on a TV remote.
     */
    public void pressHomeButton(){
        state.pressHomeButton();
    }
    /**
     * Method that represents pressing the netflix button on a TV remote.
     */
    public void pressNetflixButton(){
        state.pressNetflixButton();
    }
    /**
     * Method that represents pressing the hulu button on a TV remote.
     */
    public void pressHuluButton(){
        state.pressHuluButton();
    }
    /**
     * Method that represents pressing the movie button on a TV remote.
     */
    public void pressMovieButton(){
        state.pressMovieButton();
    }
    /**
     * Method that represents pressing the tv show button on a TV remote.
     */
    public void pressTVButton(){
        state.pressTVButton();
    }
    /**
     * Method that sets the tv state to a given state
     * @param state
     */
    public void setState(State state){
        this.state = state;
    }
    /**
     * Method that returns the home state
     * @return HomeState
     */
    public State getHomeState(){
        return HomeState;
    }
    /**
     * Method that returns the netflix state
     * @return NetflixState
     */
    public State getNetflixState(){
        return NetflixState;
    }
    /**
     * Method that returns the hulu state
     * @return HuluState
     */
    public State getHuluState(){
        return HuluState;
    }
}
