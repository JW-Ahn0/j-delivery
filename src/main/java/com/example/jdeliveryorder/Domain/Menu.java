package com.example.jdeliveryorder.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name="menu") //테이블 명
@Getter
public class Menu  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment로 설
    private int menuId;
    private String menuName;
    private int menuPrice;
    private String menuPicture; //menuPicture 임시로 String으로 타입지정.
    private String menuDescription;
    private Long storeId;
    @JsonManagedReference
    @OneToMany(mappedBy = "menu",cascade = CascadeType.PERSIST) // OrderMenu 클래스에 필드로 설정된 Menu 타입의 필드이름이 오는 곳. mappedBy가 없는 곳이 연관관계의 주인.
    private List<OrderMenu> orderMenus = new ArrayList<>();

    public List<OrderMenu> getOrderMenus() {
        return orderMenus;
    }

    public void setOrderMenus(List<OrderMenu> orderMenus) {
        this.orderMenus = orderMenus;
    }
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMenuPicture() {
        return menuPicture;
    }

    public void setMenuPicture(String menuPicture) {
        this.menuPicture = menuPicture;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }
}
