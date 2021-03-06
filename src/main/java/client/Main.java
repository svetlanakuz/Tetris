package client;

import client.controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //открываем главную форму
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main.fxml"));
        Parent root = loader.load();
        root.setId("pane");
        Scene scene = new Scene(root);
        scene.getStylesheets().addAll(this.getClass().getResource("/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Тетрис");
        primaryStage.setResizable(false);

        MainController controller = loader.getController();
        controller.setPrimaryStage(primaryStage);

        primaryStage.show();
    }
}
