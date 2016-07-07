package ua.serg.volumeDfz.utils;

import javafx.scene.control.Alert;

/**
 * Created by shpak on 05.07.2016.
 */
public class DialogManager {
    public static void showInfoDialog(String title, String text){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(text);
        alert.setHeaderText("");
        alert.showAndWait();
    }
}
