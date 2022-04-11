package com.example.comp1008a2st200497345;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;



public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("tv-guide.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Image icon = new Image(String.valueOf(getClass().getResource("Images/tvGuideLogo.png")));
        stage.getIcons().add(icon);

        stage.setTitle("Guide");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
       launch();





    }
}