package documentsystem;

import domein.DomeinController;
import gui.Paneel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.stage.*;
 
public class DocumentSystem extends Application {

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        stage.setTitle("Document System: Command Pattern");
        Scene scene = new Scene(new Paneel(new DomeinController()), 400, 350);
        scene.setFill(Color.OLDLACE);
        stage.setScene(scene);
        stage.show();
    }
}
