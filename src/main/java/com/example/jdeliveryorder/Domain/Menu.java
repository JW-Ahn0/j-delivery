package com.example.jdeliveryorder.Domain;

public class Menu {
    private int menuId;
    private String menuName;
    private int menuPrice;

    private String menuPicture; //menuPicture 임시로 String으로 타입지정.
    private String menuDescription;
    private int storeId;

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

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
}
