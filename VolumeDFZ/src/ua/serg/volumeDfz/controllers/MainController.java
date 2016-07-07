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
    private  Double koef = 0.95;
    private final Double VOLUME_BIG_POTDON = 1.44 * koef;
    private final Double VOLUME_SMAL_POTDON = 0.48 * koef;

    private int countPotdon;
    private int countBigPotdon;
    private int countSmalPotdon;


    private void createListMyBox() {

        listMyBoxName.add(new MyBox("Блюдце під чашку еспресо 90мл, FARN 135 мм", 118, 136));
        listMyBoxName.add(new MyBox("Блюдце під кавову чашку 200мл, FARN 155 мм", 120, 158));
        listMyBoxName.add(new MyBox("Блюдце під чайну та бульйонну чашку, FARN 160 мм ", 133, 162));
        listMyBoxName.add(new MyBox("Миска 130 мм", 112, 268));
        listMyBoxName.add(new MyBox("Миска 145 мм", 134, 295));
        listMyBoxName.add(new MyBox("Салатник 140 мм", 133, 143));
        listMyBoxName.add(new MyBox("Салатник 160 мм", 157, 161));
        listMyBoxName.add(new MyBox("Тарілка дрібна 17см з бортом, FARN 170 мм", 113, 172));
        listMyBoxName.add(new MyBox("Тарілка дрібна 19см з бортом, FARN 190 мм", 118, 192));
        listMyBoxName.add(new MyBox("Тарілка дрібна 21см з бортом, FARN 210 мм", 134, 213));
        listMyBoxName.add(new MyBox("Тарілка дрібна 24,5см з бортом, FARN 245 мм", 76, 248));
        listMyBoxName.add(new MyBox("Тарілка дрібна 26,5см з бортом, FARN 265 мм", 88, 267));
        listMyBoxName.add(new MyBox("Тарілка дрібна 28см з бортом, FARN 280 мм", 58, 282));
        listMyBoxName.add(new MyBox("Тарілка глибока 24см з бортом, FARN 240 мм", 95, 244));
        listMyBoxName.add(new MyBox("Тарілка глибока Паста, 30см, FARN 300 мм", 76, 304));
        listMyBoxName.add(new MyBox("Тарілка для Піци, 32см, FARN 320 мм", 40, 325));
        listMyBoxName.add(new MyBox("Блюдо овал, вузький борт, 25см, FARN 250 мм", 77, 197));
        listMyBoxName.add(new MyBox("Блюдо овал, вузький борт, 29см, FARN (290*220) 290 мм", 83, 222));
        listMyBoxName.add(new MyBox("Блюдо овал, вузький борт, 33см, FARN (330*255) 330 мм", 96, 258));
        listMyBoxName.add(new MyBox("Блюдо овал, широкий борт, 32см, FARN 320 мм", 90, 210));
        listMyBoxName.add(new MyBox("Блюдо овал, широкий борт, 38см, FARN 380 мм", 100, 260));
        listMyBoxName.add(new MyBox("Блюдо для лазаньї, 25,5см, FARN 255 мм", 95, 261));
        listMyBoxName.add(new MyBox("Блюдо для лазаньї, 28см, FARN 277 мм", 122, 293));
        listMyBoxName.add(new MyBox("Блюдо овальне, 17,5см, FARN (175*100) 175 мм", 70, 100));
        listMyBoxName.add(new MyBox("Блюдо овальне, 24,5см, FARN ( 245*140) 245 мм", 110, 140));
        listMyBoxName.add(new MyBox("Чашка 90мл для еспресо, FARN 90 мл", 94, 218));
        listMyBoxName.add(new MyBox("Чашка 200мл для кави, FARN 200 мл", 116, 176));
        listMyBoxName.add(new MyBox("Чашка 250мл для чаю та кави, FARN 250 мл", 125, 206));
        listMyBoxName.add(new MyBox("Бульйонниця з ручками, 320мл, FARN 320 мл", 125, 228));
        listMyBoxName.add(new MyBox("Соуcник порційний 50мл, FARN 50 мл", 110, 210));
        listMyBoxName.add(new MyBox("Соуcник порційний 100мл, FARN 100 мл", 90, 210));
        listMyBoxName.add(new MyBox("Молочник  50мл, FARN 50 мл", 100, 200));
        listMyBoxName.add(new MyBox("Молочник  110мл, FARN 110 мл", 140, 220));
        listMyBoxName.add(new MyBox("Молочник  250мл, FARN 250 мл", 95, 240));
        listMyBoxName.add(new MyBox("Цукорниця з кришкою, 200мл, FARN 200 мл", 150, 200));
        listMyBoxName.add(new MyBox("Заварник 450мл для чаю, FARN 450 мл", 110, 210));
        listMyBoxName.add(new MyBox("Заварник 600мл для чаю, FARN 600 мл", 130, 230));
        listMyBoxName.add(new MyBox("Заварник 900мл для чаю, FARN 900 мл", 140, 250));
        listMyBoxName.add(new MyBox("Набір для спецій FARN, (4 предмета)", 95, 150));
        listMyBoxName.add(new MyBox("Попільничка кругла 10см, FARN 100 мм", 140, 200));
        listMyBoxName.add(new MyBox("Підставка під яйце 15см, FARN 130 мм", 150, 150));
        listMyBoxName.add(new MyBox("Серветниця, FARN", 80, 150));

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
        tableColCount.setCellValueFactory(new PropertyValueFactory<MyBox, Integer>("count"));
        tableColVolume.setCellValueFactory(new PropertyValueFactory<MyBox, Double>("volume"));
        tableView.setItems(listMyBox.getListMyBox());
        labelKoef.setText("Коэффициент заполнения: " + String.valueOf(koef * 100 + "%"));
        initLisners();


    }

    public void actionAdd(ActionEvent actionEvent) {
        try {
            MyBox tmpMyBox = listMyBoxName.getMyBox(cbName.getSelectionModel().getSelectedItem());
            tmpMyBox.setCount(Integer.valueOf(txtCount.getText()));


            if (listMyBox.contains(tmpMyBox)) {
                listMyBox.delete(tmpMyBox);
            }
            listMyBox.add(tmpMyBox);

        } catch (NullPointerException e) {
            DialogManager.showInfoDialog("Ошибка!", "Выберите наименование");
        } catch (NumberFormatException e) {
            DialogManager.showInfoDialog("Ошибка!", "Укажите количество коробок");
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
                countBigPotdon += (int) (volume  / VOLUME_BIG_POTDON);
                volume -= VOLUME_BIG_POTDON * countBigPotdon;
                calcCountPotdon(volume);


            }
            else {
                countBigPotdon = (int) ((volume) / VOLUME_BIG_POTDON);
                volume -= VOLUME_BIG_POTDON * countBigPotdon;
                System.out.println(volume);
                calcCountPotdon(volume);

            }

        }
    }

}
