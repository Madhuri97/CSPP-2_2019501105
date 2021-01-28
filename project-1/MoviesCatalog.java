import java.lang.*;
import java.io.*;
import java.util.*;

public class MoviesCatalog {
	
	private ArrayList<Movies> easyMovies;
	private ArrayList<Movies> mediumMovies;
    private ArrayList<Movies> hardMovies;

    // Constructor
	public MoviesCatalog() {
		easyMovies = new ArrayList<>();
        mediumMovies = new ArrayList<>();
        hardMovies = new ArrayList<>();
	}

	//Getters
	public ArrayList<Movies> getEasyMovies() {
        return easyMovies;    }
    public ArrayList<Movies> getMediumMovies() {
        return mediumMovies;
    }    
    public ArrayList<Movies> getHardMovies() {
        return hardMovies;
    }
	
    //Setters
	public void setEasyMovies(final Movies easyMovies) {

        this.easyMovies.add(easyMovies);
    }

    public void setMediumMovies(final Movies mediumMovies) {

        this.mediumMovies.add(mediumMovies);
    }
    public void setHardMovies(final Movies hardMovies) {

        this.hardMovies.add(hardMovies);
    }
}