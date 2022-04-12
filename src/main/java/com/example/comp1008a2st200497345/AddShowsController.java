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
}

