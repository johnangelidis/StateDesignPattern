package StateDesignPattern;
/**
 * Interface that declares the state methods for a tv
 */
public interface State{
    /**
     * Method that represents pressing the home button
     */
    public void pressHomeButton();
    /**
     * Method that represents pressing the netflix button
     */
    public void pressNetflixButton();
    /**
     * Method that represents pressing the hulu button
     */
    public void pressHuluButton();
    /**
     * Method that represents pressing the movie button
     */
    public void pressMovieButton();
    /**
     * Method that represents pressing the tv show button
     */
    public void pressTVButton();
}