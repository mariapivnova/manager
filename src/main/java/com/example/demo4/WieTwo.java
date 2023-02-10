package com.example.demo4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class WieTwo  {

    @FXML
    private Button button;

    @FXML
    private TextField logn;

    @FXML
    private TextField pass;

    @FXML
    void initialize() {
        button.setOnAction(clik -> {
            button.setText("Спасибо за регистрацию ");
            System.out.println("Логин: " + logn.getText());
            System.out.println("Пароль: " + pass.getText());
            button.getScene().getWindow().hide();
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\demo4\\src\\main\\resources\\com\\example\\demo4\\inputlogin.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(logn.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("daily.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Ежедневник руководителя ");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("WieError.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Ежедневник руководителя ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\demo4\\src\\main\\resources\\com\\example\\demo4\\inputpassword.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {

                    if (line.equals(pass.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("daily.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Ежедневник руководителя ");
                        } catch (Exception e) {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("WieError.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Ежедневник руководителя ");
                            e.printStackTrace();
                        }

                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("WieError.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Ежедневник руководителя ");
                    }

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}

