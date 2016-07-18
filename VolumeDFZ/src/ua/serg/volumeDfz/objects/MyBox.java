package ua.serg.volumeDfz.objects;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by shpak on 05.07.2016.
 */
public class MyBox {

    private SimpleStringProperty name = new SimpleStringProperty("");
    private Double volume;
    private Integer countBox;
    private Integer countInBox;
    private Integer numberOfSubject;
    private int x;
    private int y;
    private int z;


    private MyBox(){

    }

    public MyBox(String name, int x, int y, int z, Integer countInBox) {
        this.name = new SimpleStringProperty(name);
        this.x = x;
        this.y = y;
        this.z = z;
        this.countInBox = countInBox;
        this.volume = Double.valueOf(x*y*z);
    }

    public String getName() {
        return name.get();
    }

    public Double getVolume() {
        return volume * countBox / 1_000;
    }

    public Integer getCountBox() {
        return countBox;
    }

    private void setCountBox() {
        this.countBox = numberOfSubject/countInBox +1;
    }

    public void setNumberOfSubject(Integer numberOfSubject) {
        this.numberOfSubject = numberOfSubject;
        setCountBox();
    }

    public Integer getNumberOfSubject() {
        return numberOfSubject;
    }
}
