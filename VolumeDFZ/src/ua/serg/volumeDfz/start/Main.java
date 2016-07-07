package ua.serg.volumeDfz.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ua.serg.volumeDfz.controllers.MainController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../fxml/main.fxml"));

        Parent fxmlMain = fxmlLoader.load();
        MainController mainController = fxmlLoader.getController();
        mainController.setMainStage(primaryStage);

        primaryStage.setTitle("Расчет кол-ва потдонов");
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.setScene(new Scene(fxmlMain));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
