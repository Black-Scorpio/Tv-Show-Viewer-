package com.example.comp1008a2st200497345;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.ResourceBundle;

public class TvGuideController implements Initializable {

    @FXML
    private Label genreLbl;

    @FXML
    private Label ratingLbl;

    @FXML
    private Label seasonsLbl;

    @FXML
    private ImageView showCoverImage;

    @FXML
    private Label titleLbl;

    @FXML
    private Button nextShowBtn;

    @FXML
    private Label datePlayingLbl;



    //Tv objects to add to the guide shows list
    TvShow tvShowYou = new TvShow("You","Thriller",4.5,3);
    TvShow tvShowScrubs = new TvShow("Scrubs","Sitcom",4.2,11);
    TvShow tvShowYellowStone = new TvShow("YellowStone","Drama",4.8,4);
    TvShow tvShowTheOffice = new TvShow("TheOffice","Sitcom",4.4,11);
    TvShow tvShowUpload = new TvShow("Upload","Comedy",3.8,2);


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Adding TvShows to the guide
        GuideData.shows.addTvShow(tvShowYellowStone);
        GuideData.shows.addTvShow(tvShowYou);
        GuideData.shows.addTvShow(tvShowScrubs);
        GuideData.shows.addTvShow(tvShowTheOffice);
        GuideData.shows.addTvShow(tvShowUpload);

        viewNextShow();
    }

    /**
     * This method will show the next instance of TvShow object
     * displayed on the Scene
     */

    @FXML
    private void viewNextShow(){

        TvShow tvShow = GuideData.shows.viewNextShow();

        //updating the labels with the tvShow information
        titleLbl.setText(String.format("Title:\n%s", tvShow.getShowTitle()));
        genreLbl.setText(String.format("Genre:\n%s", tvShow.getShowGenre()));
        seasonsLbl.setText(String.format("Seasons:\n%d",tvShow.getShowSeasons()));
        ratingLbl.setText(String.format("Rating:\n%.1f/5",tvShow.getShowRating()));
        datePlayingLbl.setText(String.format("Date Playing:\n%s",GuideData.shows.getDatePlaying().toString()));
        showCoverImage.setImage(tvShow.getTvImage());
    }


    /**
     * Changes the scene to the tv selections giving shows to add to the collection
     * @param event
     */
    @FXML
    void addShows(ActionEvent event) throws IOException {
        Parent tvViewParent = FXMLLoader.load(getClass().getResource("add-shows.fxml"));

        Scene addTvScene = new Scene(tvViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(addTvScene);
        window.show();
    }
}

