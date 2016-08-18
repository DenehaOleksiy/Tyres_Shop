package shop_DB.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Администратор on 09.08.2016.
 */
@Entity
public class Width {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private int width;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "width")
    List<Goods> goodsList;

    public Width() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "Width:  " + width;

    }
}
