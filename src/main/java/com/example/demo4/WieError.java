package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WieError {

    @FXML
    private Button button;
    @FXML
    void initialize(){
        button.setOnAction(clik->{
            button.getScene().getWindow().hide();
            try{
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("WieTwo.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Ежедневник руководителя ");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });
    }

}
