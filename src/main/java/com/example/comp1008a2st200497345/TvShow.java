package com.example.comp1008a2st200497345;

import javafx.scene.image.Image;
import java.util.Arrays;
import java.util.List;


public class TvShow {
    private String showTitle;
    private String showGenre;
    private int showSeasons;
    private double showRating;
    private final Image tvImage;
    
    public TvShow(String showTitle, String showGenre, double showRating, int showSeasons) {
        setShowTitle(showTitle);
        setShowGenre(showGenre);
        setShowRating(showRating);
        setShowSeasons(showSeasons);
        String fileName = String.format("Images/%s_cover.jpg",showTitle);
        tvImage = new Image(getClass().getResource(fileName).toExternalForm());
    }

    public Image getTvImage() {
        return tvImage;
    }

    public String getShowTitle() {
        return showTitle;
    }
    /**
     * Tv Show title must be greater than 2 characters
     * @param showTitle
     */
    public void setShowTitle(String showTitle) {
        showTitle = showTitle.trim();
        showTitle = showTitle.substring(0,1).toUpperCase() + showTitle.substring(1);
        if(showTitle.length() > 2)
            this.showTitle = showTitle;
        else
            throw new IllegalArgumentException("The length of the title must be greater than 2");
    }

    public String getShowGenre() {
        return showGenre;
    }

    /**
     * The showGenre must be found in the list
     * "Comedy","Action", "Adventure", "Crime", "Mystery", "Fantasy",
     * "Historical", "Historical Fiction", "Horror", "Romance", "Reality"
     * @param showGenre
     */
    public void setShowGenre(String showGenre) {
        showGenre = showGenre.trim();
        showGenre = showGenre.substring(0,1).toUpperCase() + showGenre.substring(1);
        List<String> genre = Arrays.asList("Comedy","Action","Sitcom", "Adventure","Thriller",
                "Crime", "Mystery", "Fantasy", "Historical", "Historical Fiction", "Horror", "Romance", "Drama", "Reality");
        if(genre.contains(showGenre))
            this.showGenre = showGenre;
        else
            throw new IllegalArgumentException("The genre must be one of these genres: " + genre);
    }

    public double getShowRating() {
        return showRating;
    }

    /**
     * showRating must be a number between 1-5
     * if the number is not between 1-5 decimals included it will throw an error
     * @param showRating
     */
    public void setShowRating(double showRating) {
        //Formatting the rating to 1 decimal place

        if(showRating >= 1 && showRating <= 5)
            this.showRating = showRating;
        else
            throw new IllegalArgumentException("The rating must be between 1-5");
    }

    public int getShowSeasons() {
        return showSeasons;
    }

    /**
     * sets the number of showSeasons from a value of 1 or more
     * @param showSeasons
     */
    public void setShowSeasons(int showSeasons) {
        if(showSeasons >= 1)
            this.showSeasons = showSeasons;
        else
            throw new IllegalArgumentException("The show must have 1 or more seasons");
    }

    /**
     * Returns information about the TvShow objects attributes
     * @return
     */
    public String toString(){
        return String.format("Title: %s \n Genre: %s \n Rating: %f \n Seasons: %d", getShowTitle(),getShowGenre(),getShowRating(),getShowSeasons());
    }


}
