package com.example.comp1008a2st200497345;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class AddShowsController implements Initializable {

    @FXML
    private Button addShowsBtn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private CheckBox dexterCb;

    @FXML
    private CheckBox loveIslandCb;

    @FXML
    private CheckBox sonsOfAnarchyCb;

    @FXML
    private CheckBox spongebobCb;

    @FXML
    private CheckBox theFlashCb;

    @FXML
    private CheckBox theWalkingDeadCb;

    @FXML
    private Button viewShowsBtn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    /**
     * Changes the scene to the tv shows view
     * @param event
     */
    @FXML
    void viewShows(ActionEvent event) throws IOException {
        Parent tvViewParent = FXMLLoader.load(getClass().getResource("tv-guide.fxml"));

        Scene addTvScene = new Scene(tvViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(addTvScene);
        window.show();
    }

    //Creating the list of checkbox items
    List<CheckBox> checkBoxes = new ArrayList<CheckBox>();

    @FXML
    void addShowsToList(ActionEvent event) {
        //Creating TvShows that can be added
        TvShow dexter = new TvShow("Dexter","Crime",4.6,7);
        TvShow spongebob = new TvShow("Spongebob","Comedy",4.9,13);
        TvShow loveIsland = new TvShow("LoveIsland","Reality",4.1,7);
        TvShow theWalkingDead = new TvShow("TheWalkingDead","Drama",4.2,11);
        TvShow theFlash = new TvShow("TheFlash","Crime",4.2,8);
        TvShow sonsOfAnarchy = new TvShow("SonsOfAnarchy","Drama",4.8,7);

        checkBoxes.add(dexterCb);
        checkBoxes.add(spongebobCb);
        checkBoxes.add(loveIslandCb);
        checkBoxes.add(theWalkingDeadCb);
        checkBoxes.add(theFlashCb);
        checkBoxes.add(sonsOfAnarchyCb);


        for(CheckBox checkBox : checkBoxes){
            String showTitle = "";
            if (checkBox.isSelected())
                showTitle = checkBox.getText().replaceAll(" ","");
            //Using a switch case to get the title of the shows that are checkboxed and adding it to the show list
            switch (showTitle) {
                case "Dexter" -> GuideData.shows.addTvShow(dexter);
                case "Spongebob" -> GuideData.shows.addTvShow(spongebob);
                case "LoveIsland" -> GuideData.shows.addTvShow(loveIsland);
                case "TheWalkingDead" -> GuideData.shows.addTvShow(theWalkingDead);
                case "TheFlash" -> GuideData.shows.addTvShow(theFlash);
                case "SonsOfAnarchy" -> GuideData.shows.addTvShow(sonsOfAnarchy);
            }

        }
    }
}

