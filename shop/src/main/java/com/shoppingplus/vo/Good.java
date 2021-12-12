package com.shoppingplus.vo;

public class Good {

    String name;
    float price;
    String desc;//描述
    String photo;
    String typeName;


    public Good() {
    }

    public Good(String name, float price, String desc, String photo, String typeName) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.photo = photo;
        this.typeName = typeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
