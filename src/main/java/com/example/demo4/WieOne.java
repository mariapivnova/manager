package com.example.demo4;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;

public class WieOne {


    @FXML
    private Button inputlogin;

    @FXML
    private Button inputpass;

    @FXML
    private TextField login;

    @FXML
    private TextField pass;

    @FXML
    private Button registration;
    @FXML
    private ImageView picture;

    @FXML
    public void initialize() {
        inputpass.setOnAction(clik -> {
            try {
                String line=(pass.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\User\\IdeaProjects\\demo4\\src\\main\\resources\\com\\example\\demo4\\inputpassword.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Пароль сохранён");
            } catch (Exception e) {
                System.out.println("Пароль не удалось сохранить");
            }
        });
        inputlogin.setOnAction(clik -> {
            try {
                String line=(login.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\User\\IdeaProjects\\demo4\\src\\main\\resources\\com\\example\\demo4\\inputlogin.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Логин сохранён");
            } catch (Exception e) {
                System.out.println("Логин не удалось сохранить");
            }
        });
        registration.setOnAction(clik -> {
            try {


                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("WieTwo.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Ежедневник руководителя ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

}