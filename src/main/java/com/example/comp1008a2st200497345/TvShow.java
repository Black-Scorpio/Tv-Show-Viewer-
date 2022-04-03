package com.example.comp1008a2st200497345;

import javafx.scene.image.Image;

import java.util.Date;

public class TvShow {
    private String showTitle;
    private String showGenre;
    private int showRating, showSeasons;
    private Image tvImage;
    
    public TvShow(String showTitle, String showGenre, int showRating, int showSeasons) {
        setShowTitle(showTitle);
        setShowGenre(showGenre);
        setShowRating(showRating);
        setShowSeasons(showSeasons);
    }



    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public String getShowGenre() {
        return showGenre;
    }

    public void setShowGenre(String showGenre) {
        this.showGenre = showGenre;
    }

    public int getShowRating() {
        return showRating;
    }

    public void setShowRating(int showRating) {
        this.showRating = showRating;
    }

    public int getShowSeasons() {
        return showSeasons;
    }

    public void setShowSeasons(int showSeasons) {
        this.showSeasons = showSeasons;
    }

    public String toString(){
        return String.format("Title: %s \n Genre: %s \n Rating: %d \n Seasons: %d", getShowTitle(),getShowGenre(),getShowRating(),getShowSeasons());
    }


}
