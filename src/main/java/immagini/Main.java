package immagini;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox box = new VBox();
        
        Lampadina lamp = new Lampadina(5);

        ImageView iv = new ImageView();
        Image lampOn = new Image("file:src/main/resources/img/lampon.png");
        Image lampOff = new Image("file:src/main/resources/img/lampoff.png");
        
        iv.setImage(lampOff);
        iv.setFitWidth(200);
        iv.setFitHeight(400);
        
        box.getChildren().add(iv);

        Button btn = new Button("Accendi");
        
        Text testo = new Text();
        
        btn.setOnAction(e -> {
            if (lamp.isAccesa()){
                btn.setText("Accendi");
                iv.setImage(lampOff);
            } else {
                btn.setText("Spegni");
                iv.setImage(lampOn);
            }
            lamp.click();
            testo.setText(lamp.stato());
        });
        
        box.getChildren().add(btn);
        box.getChildren().add(testo);
        
        Scene scena = new Scene(box, 500, 500);
        
        stage.setTitle("Lampadina");
        stage.setScene(scena);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
