package shop_DB.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private int summa;
    @Column
    private Date date;
    //    @Column
//    private String firstName;
//    @Column
//    private String secondName;
    @Column
    private String city;
    @Column
    private String street;
    @Column
    private int house;
    @Column
    private int appartment;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "goods_orders", joinColumns = @JoinColumn(name ="id_orders"), inverseJoinColumns = @JoinColumn(name ="id_goods"))
    private List<Goods>goodsList;

    public Orders() {
        this.date = Calendar.getInstance().getTime();
    }



    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }


    public Date getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getAppartment() {
        return appartment;
    }

    public void setAppartment(int appartment) {
        this.appartment = appartment;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", summa=" + summa +
                ", date=" + date +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", appartment=" + appartment +
                ", user=" + user +
                ", goodsList=" + goodsList +
                '}';
    }
}
