package shop_DB.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;


@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int price;
    @Lob
    @Column
    private byte[] image = new byte[1];

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
    @ManyToOne(fetch = FetchType.EAGER)
    private Brand brand;
    @ManyToOne(fetch = FetchType.EAGER)
    private Diameter diameter;
    @ManyToOne(fetch = FetchType.EAGER)
    private Height height;
    @ManyToOne(fetch = FetchType.EAGER)
    private Width width;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "goods_user" ,joinColumns = @JoinColumn(name ="id_goods"),inverseJoinColumns = @JoinColumn(name ="id_user"))
    private List<User>userList;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "goods_orders",joinColumns = @JoinColumn(name ="id_goods"),inverseJoinColumns = @JoinColumn(name ="id_orders"))
    private List<Orders>ordersList;



    public Goods() {
    }

    public int getId() {
        return id;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Diameter getDiameter() {
        return diameter;
    }

    public void setDiameter(Diameter diameter) {
        this.diameter = diameter;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Width getWidth() {
        return width;
    }

    public void setWidth(Width width) {
        this.width = width;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }



    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", image=" + Arrays.toString(image) +
                ", category=" + category +
                ", brand=" + brand +
                ", diameter=" + diameter +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
