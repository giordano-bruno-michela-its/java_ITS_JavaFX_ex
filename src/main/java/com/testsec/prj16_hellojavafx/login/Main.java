package com.testsec.prj16_hellojavafx.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {

        GridPane griglia = new GridPane();
        griglia.setAlignment(Pos.CENTER);
        griglia.setHgap(10);
        griglia.setVgap(10);
        griglia.setPadding(new Insets(5));

        Scene scena = new Scene(griglia, 400, 300, Color.AZURE);

        Text titolo = new Text("Test login");
        Text message = new Text("");
        titolo.setFont(Font.font("Calibri", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 30));
        message.setFont(Font.font("Calibri", FontPosture.REGULAR, 20));
        
        griglia.add(titolo, 0, 0, 2, 1);

        Label lblUser = new Label("Username:");
        Label lblPass = new Label("Password:");

        TextField tfUser = new TextField();
        PasswordField tfPass = new PasswordField();
        
        // riga 1 username
        griglia.add(lblUser, 0, 1);
        griglia.add(tfUser, 1, 1);
        
        // riga 2 password
        griglia.add(lblPass, 0, 2);
        griglia.add(tfPass, 1, 2);

        Button btnLogin = new Button("Login");
        
        btnLogin.setOnAction(e -> {
            if (tfUser.getText().equals("its") && tfPass.getText().equals("123456")) {
//                System.out.println("Login effettuato!");
                message.setText("Login effettuato!");
            } else {
//                System.out.println("Login fallito!");
                message.setText("Login fallito!");
            }
        });
        
        griglia.add(btnLogin, 1, 3);
        griglia.add(message, 0, 4, 2, 1);
        
        stage.setTitle("Test login");
        stage.setScene(scena);
        stage.show();
    }
}
