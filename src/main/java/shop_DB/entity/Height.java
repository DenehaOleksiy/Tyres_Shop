package shop_DB.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Администратор on 09.08.2016.
 */
@Entity
public class Height {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private int height;

    @OneToMany(fetch = FetchType.LAZY , mappedBy = "height")
    List<Goods> goodsList;

    public Height() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "Height:  " + height;
    }
}
