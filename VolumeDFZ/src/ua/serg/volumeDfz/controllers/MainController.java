package ua.serg.volumeDfz.controllers;

import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ua.serg.volumeDfz.interfaces.impl.CollectionMyBoxImpl;
import ua.serg.volumeDfz.objects.MyBox;
import ua.serg.volumeDfz.utils.DialogManager;

/**
 * Created by shpak on 05.07.2016.
 */
public class MainController {

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn<MyBox, String> tableColName;
    @FXML
    private TableColumn<MyBox, Integer> tableColNumOfSubject;
    @FXML
    private TableColumn<MyBox, Integer> tableColCount;
    @FXML
    private TableColumn<MyBox, Double> tableColVolume;
    @FXML
    private TableColumn tableColNum;
    @FXML
    private ComboBox<String> cbName;
    @FXML
    private TextField txtCount;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnDelete;
    @FXML
    private Label labelAllVolume;
    @FXML
    private Label labelAllCountPotdon;
    @FXML
    private Label labelCountSmalPotdon;
    @FXML
    private Label labelCountBigPotdon;
    @FXML
    private Label labelKoef;

    private Stage mainStage;
    private CollectionMyBoxImpl listMyBoxName = new CollectionMyBoxImpl();

    private CollectionMyBoxImpl listMyBox = new CollectionMyBoxImpl();
    private Double koef = 0.95;
    private final Double VOLUME_BIG_POTDON = 1.44 * koef;
    private final Double VOLUME_SMAL_POTDON = 0.48 * koef;

    private int countPotdon;
    private int countBigPotdon;
    private int countSmalPotdon;


    private void createListMyBox() {

        listMyBoxName.add(new MyBox("Блюдце для чашки эспрессо 135 мм", 280, 145, 120, 24));
        listMyBoxName.add(new MyBox("Блюдце для чашки кофе 155 мм", 325, 170, 120, 24));
        listMyBoxName.add(new MyBox("Блюдце для чашки чая и бульона 160 мм ", 335, 170, 130, 24));
        listMyBoxName.add(new MyBox("Миска 130 мм", 280, 280, 110, 24));
        listMyBoxName.add(new MyBox("Миска 145 мм", 300, 300, 140, 24));
        listMyBoxName.add(new MyBox("Салатник 140 мм", 290, 160, 135, 24));
        listMyBoxName.add(new MyBox("Салатник 160 мм", 170, 170, 160, 12));
        listMyBoxName.add(new MyBox("Тарелка мелкая с широким бортом 170 мм", 180, 180, 125, 12));
        listMyBoxName.add(new MyBox("Тарелка мелкая с широким бортом 190 мм", 200, 200, 120, 12));
        listMyBoxName.add(new MyBox("Тарелка мелкая с широким бортом 210 мм", 220, 220, 140, 12));
        listMyBoxName.add(new MyBox("Тарелка мелкая с широким бортом 245 мм", 255, 255, 80, 6));
        listMyBoxName.add(new MyBox("Тарелка мелкая с широким бортом 265 мм", 280, 280, 90, 6));
        listMyBoxName.add(new MyBox("Тарелка мелкая с широким бортом 280 мм", 290, 290, 90, 6));
        listMyBoxName.add(new MyBox("Тарелка глубокая с широким бортом 240 мм", 250, 250, 100, 6));
        listMyBoxName.add(new MyBox("Тарелка глубокая \"Паста\" 300 мм", 310, 310, 85, 3));
        listMyBoxName.add(new MyBox("Тарелка плоская \"Пицца\" 320 мм", 330, 330, 45, 3));
        listMyBoxName.add(new MyBox("Блюдо овальное с узким бортом (250*20) 250 мм", 250, 200, 80, 6));
        listMyBoxName.add(new MyBox("Блюдо овальное с узким бортом (290*22) 290 мм", 290, 220, 85, 6));
        listMyBoxName.add(new MyBox("Блюдо овальное с узким бортом (330*25) 330 мм", 330, 255, 90, 6));
        listMyBoxName.add(new MyBox("Блюдо овальное с широким бортом 320 мм", 320, 210, 100, 6));
        listMyBoxName.add(new MyBox("Блюдо овальное с широким бортом 380 мм", 380, 270, 100, 6));
        listMyBoxName.add(new MyBox("Блюдо для лазаньи 255 мм", 255, 130, 80, 6));
        listMyBoxName.add(new MyBox("Блюдо для лазаньи 277 мм", 270, 140, 110, 6));
        listMyBoxName.add(new MyBox("Селедочник (175*100) 175 мм", 175, 100, 80, 6));
        listMyBoxName.add(new MyBox("Селедочник (245*140) 245 мм", 245, 140, 100, 6));
        listMyBoxName.add(new MyBox("Чашка для эспрессо (стэк) 90 мл", 340, 220, 95, 24));
        listMyBoxName.add(new MyBox("Чашка для кофе (стэк) 200 мл", 310, 200, 125, 12));
        listMyBoxName.add(new MyBox("Чашка для чая (стэк) 250 мл", 320, 220, 150, 12));
        listMyBoxName.add(new MyBox("Чашка для бульона 320 мл", 360, 235, 160, 12));
        listMyBoxName.add(new MyBox("Соусник 50 мл", 310, 210, 110, 36));
        listMyBoxName.add(new MyBox("Соусник 100 мл", 300, 225, 95, 24));
        listMyBoxName.add(new MyBox("Молочник 50 мл", 320, 220, 100, 48));
        listMyBoxName.add(new MyBox("Молочник 110 мл", 290, 220, 140, 24));
        listMyBoxName.add(new MyBox("Молочник 250 мл", 310, 240, 95, 12));
        listMyBoxName.add(new MyBox("Сахарница с крышкой 200 мл", 320, 220, 150, 12));
        listMyBoxName.add(new MyBox("Чайник с крышкой 450 мл", 370, 240, 140, 6));
        listMyBoxName.add(new MyBox("Чайник с крышкой 600 мл", 370, 240, 120, 6));
        listMyBoxName.add(new MyBox("Чайник с крышкой 900 мл", 305, 285, 135, 4));
        listMyBoxName.add(new MyBox("Набор для специй (4 предмета)", 210, 150, 70, 6));
        listMyBoxName.add(new MyBox("Пепельница 100 мм", 305, 210, 110, 24));
//        listMyBoxName.add(new MyBox("Подставка для яйца 130 мм", 0,0,0,6));
        listMyBoxName.add(new MyBox("Салфетница", 210, 150, 70, 6));

    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

    @FXML
    private void initialize() {
        createListMyBox();

        cbName.setPromptText("Выберите наименование...");
        cbName.setItems(listMyBoxName.getListName());
        tableColName.setCellValueFactory(new PropertyValueFactory<MyBox, String>("name"));
        tableColNumOfSubject.setCellValueFactory(new PropertyValueFactory<MyBox, Integer>("numberOfSubject"));
        tableColCount.setCellValueFactory(new PropertyValueFactory<MyBox, Integer>("countBox"));
        tableColVolume.setCellValueFactory(new PropertyValueFactory<MyBox, Double>("volume"));
        tableView.setItems(listMyBox.getListMyBox());
        labelKoef.setText("Коэффициент заполнения: " + String.valueOf(koef * 100 + "%"));
        initLisners();


    }

    public void actionAdd(ActionEvent actionEvent) {
        try {
            MyBox tmpMyBox = listMyBoxName.getMyBox(cbName.getSelectionModel().getSelectedItem());
            tmpMyBox.setNumberOfSubject(Integer.valueOf(txtCount.getText()));


            if (listMyBox.contains(tmpMyBox)) {
                listMyBox.delete(tmpMyBox);
            }
            listMyBox.add(tmpMyBox);

        } catch (NullPointerException e) {
            DialogManager.showInfoDialog("Ошибка!", "Выберите наименование");
        } catch (NumberFormatException e) {
            DialogManager.showInfoDialog("Ошибка!", "Укажите количество предметов");
        }


    }


    public void actionDelete(ActionEvent actionEvent) {
        listMyBox.delete((MyBox) tableView.getSelectionModel().getSelectedItem());
    }

    private void initLisners() {
        listMyBox.getListMyBox().addListener((ListChangeListener<MyBox>) c -> {
            updateLabelAllVolume();
            updateCountPotdon();
        });

    }

    private void updateLabelAllVolume() {
        labelAllVolume.setText(String.valueOf(listMyBox.getVolumeList()) + " м^3");
    }

    private void updateCountPotdon() {


        calcCountPotdon(listMyBox.getVolumeList());

        labelCountSmalPotdon.setText(String.valueOf(countSmalPotdon) + " шт.");
        labelCountBigPotdon.setText(String.valueOf(countBigPotdon) + " шт.");
        labelAllCountPotdon.setText(String.valueOf(countBigPotdon + countSmalPotdon) + " шт.");
        countPotdon = 0;
        countBigPotdon = 0;
        countSmalPotdon = 0;
    }

    private void calcCountPotdon(Double volume) {
        if (volume == 0) {
            countPotdon = 0;
            countBigPotdon = 0;
            countSmalPotdon = 0;
            return;
        } else if (volume <= VOLUME_SMAL_POTDON) {
            if (countSmalPotdon > 0) {
                countSmalPotdon += 1;

            } else {
                countSmalPotdon = 1;
            }
            return;

        } else if (volume > VOLUME_SMAL_POTDON & volume < VOLUME_BIG_POTDON) {
            if (countBigPotdon > 0) {
                countBigPotdon += 1;

            } else {
                countBigPotdon = 1;
            }

        } else if (volume > VOLUME_BIG_POTDON) {
            if (countBigPotdon > 0) {
                countBigPotdon += (int) (volume / VOLUME_BIG_POTDON);
                volume -= VOLUME_BIG_POTDON * countBigPotdon;
                calcCountPotdon(volume);


            } else {
                countBigPotdon = (int) ((volume) / VOLUME_BIG_POTDON);
                volume -= VOLUME_BIG_POTDON * countBigPotdon;
                calcCountPotdon(volume);

            }

        }
    }

}
