package ua.serg.volumeDfz.interfaces.impl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ua.serg.volumeDfz.interfaces.ListMyBox;
import ua.serg.volumeDfz.objects.MyBox;

/**
 * Created by shpak on 05.07.2016.
 */
public class CollectionMyBoxImpl implements ListMyBox {

    private ObservableList<MyBox> listMyBox = FXCollections.observableArrayList();
    private ObservableList<String> listName = FXCollections.observableArrayList();



    public ObservableList<MyBox> getListMyBox() {
        return listMyBox;
    }
    public ObservableList<String> getListName(){
        for (MyBox myBox: listMyBox) {
            listName.add(myBox.getName());
        }
        return listName;
    }

    public MyBox getMyBox (String name){
        MyBox myBox = null;

        for (MyBox myBox1 : listMyBox){
            if (myBox1.getName().equals(name)){
                myBox = myBox1;


            }
        }
        return myBox;
    }
    public int getSize (){
        return getListMyBox().size();
    }
    public boolean contains(MyBox myBox){
        boolean b = false;
        for (MyBox box : listMyBox) {
            if (myBox.getName().equals(box.getName())) {
                b = true;
            }
        }
        return b;
    }

    public Double getVolumeList(){
        Double volume = 0.;
        for (MyBox myBox : listMyBox){
            volume += myBox.getVolume();
        }
        return volume / 1_000_000;
    }



    @Override
    public void add(MyBox myBox) {
        listMyBox.add(myBox);
    }

    @Override
    public void delete(MyBox myBox) {
        listMyBox.remove(myBox);
    }


}
