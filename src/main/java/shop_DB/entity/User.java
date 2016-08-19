package shop_DB.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Администратор on 09.07.2016.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String secondname;

    @Column
    private String phoneNumber;
    @Column
    private String emailAdress;
    @Column
    private Date registrationDate;

    @Column
    private String password;
    @Transient
    private String passwordConfirm;

    @Column
    private int totalSumma;
    @Column
    private int goodsQuantity;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "user")
    private List<Orders> ordersList;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "goods_user" ,joinColumns = @JoinColumn(name ="id_user"),inverseJoinColumns = @JoinColumn(name ="id_goods"))
    private Set<Goods>goodsList;


    public User() {
        this.registrationDate = Calendar.getInstance().getTime();
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(Set<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public int getTotalSumma() {
        return totalSumma;
    }

    public void setTotalSumma(int totalSumma) {
        this.totalSumma = totalSumma;
    }

    public int getGoodsQuantity() {
        return goodsQuantity;
    }

    public void setGoodsQuantity(int goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                ", registrationDate=" + registrationDate +
                ", password='" + password + '\'' +
                '}';
    }
}
