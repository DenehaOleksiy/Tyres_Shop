package shop_DB.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Администратор on 09.07.2016.
 */
@Entity
public class Diameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private int sizeDiameter;



    @OneToMany(fetch = FetchType.LAZY,mappedBy = "diameter")
    private List<Goods> goodsList;

    public Diameter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSizeDiameter() {
        return sizeDiameter;
    }

    public void setSizeDiameter(int sizeDiameter) {
        this.sizeDiameter = sizeDiameter;
    }


    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "Diameter:  " + sizeDiameter ;

    }
}
