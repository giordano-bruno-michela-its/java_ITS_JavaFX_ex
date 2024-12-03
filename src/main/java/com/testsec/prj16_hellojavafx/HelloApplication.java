package com.testsec.prj16_hellojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Text testo = new Text();
        testo.setText("Semo à classe er mejo!");
        testo.setFont(Font.font("Verdana"));
        testo.setFill(Color.DARKBLUE);
        testo.setX(10);
        testo.setY(50);

        Line linea = new Line();
        linea.setStartX(20);
        linea.setStartY(60);
        linea.setEndX(140);
        linea.setEndY(140);
        
        linea.setStroke(Color.DARKRED);
        linea.setStrokeWidth(3);

        Rectangle rettangolo = new Rectangle();
        rettangolo.setX(100);
        rettangolo.setY(100);
        rettangolo.setWidth(200);
        rettangolo.setHeight(100);
        rettangolo.setFill(Color.CORNFLOWERBLUE);
        rettangolo.setStroke(Color.DARKBLUE);
        rettangolo.setStrokeWidth(3);
        rettangolo.setArcWidth(20);
        rettangolo.setArcHeight(20);

        Button btn = new Button("Pigia qui nè!");
        btn.setOnAction(e -> {
            testo.setText("Bravo! Hai pigiato il bottone!");
        });
        
        
        
        Group gruppo = new Group(testo, linea, rettangolo, btn);
//        gruppo.getChildren().add(testo);

        Pane pannello = new Pane(gruppo);
        
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene = new Scene(pannello, 360, 340); // Dimensioni finestra

        
        primaryStage.setTitle("ITS SoftDev 2025 er toppe!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}