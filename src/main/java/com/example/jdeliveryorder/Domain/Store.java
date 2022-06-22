package com.example.jdeliveryorder.Domain;

public class Store {
    private int storeId;
    private String storeName;
    private String storePhoneNumber;
    private String storeAddress;
    private String storeStatus;
    private String storeDescription;
    private String storeIcon;     //이미지 파일 임시로 String 지정.

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public String getStoreIcon() {
        return storeIcon;
    }

    public void setStoreIcon(String storeIcon) {
        this.storeIcon = storeIcon;
    }
}
