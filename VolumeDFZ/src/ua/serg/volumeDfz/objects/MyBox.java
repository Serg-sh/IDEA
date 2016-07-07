package ua.serg.volumeDfz.objects;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by shpak on 05.07.2016.
 */
public class MyBox {

    private SimpleStringProperty name = new SimpleStringProperty("");
    private Double volume;
    private Integer count = 1;
    private int x;
    private int y;
    private int z;

    public MyBox(String name, int z, int x) {
        this.name = new SimpleStringProperty(name);
        this.x = x;
        this.y = x;
        this.z = z;
        this.volume = Double.valueOf(x*y*z);
    }

    public String getName() {
        return name.get();
    }

    public Double getVolume() {
        return volume * count / 1_000;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}
