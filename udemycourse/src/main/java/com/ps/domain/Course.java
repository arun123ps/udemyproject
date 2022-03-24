package com.ps.domain;

public class Course {
    public  int id;
    public String title;
    public String author;
    public String desciption;
    public String category;
    public String imageurl;
    public String lastupdatedate;
    public int numberofrating;
    public int discountprice;
    public int fixedprice;
    public boolean bestseller;
    public int rating;
    public  int originalprice;
    public String level;

    public Course(int id, String title, String author, String desciption, String category, String imageurl, String lastupdatedate, int numberofrating, int discountprice, int fixedprice, boolean bestseller, int rating, int originalprice, String level) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.desciption = desciption;
        this.category = category;
        this.imageurl = imageurl;
        this.lastupdatedate = lastupdatedate;
        this.numberofrating = numberofrating;
        this.discountprice = discountprice;
        this.fixedprice = fixedprice;
        this.bestseller = bestseller;
        this.rating = rating;
        this.originalprice = originalprice;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getLastupdatedate() {
        return lastupdatedate;
    }

    public void setLastupdatedate(String lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    public int getNumberofrating() {
        return numberofrating;
    }

    public void setNumberofrating(int numberofrating) {
        this.numberofrating = numberofrating;
    }

    public int getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(int discountprice) {
        this.discountprice = discountprice;
    }

    public int getFixedprice() {
        return fixedprice;
    }

    public void setFixedprice(int fixedprice) {
        this.fixedprice = fixedprice;
    }

    public boolean isBestseller() {
        return bestseller;
    }

    public void setBestseller(boolean bestseller) {
        this.bestseller = bestseller;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(int originalprice) {
        this.originalprice = originalprice;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public static void main(String[] args) {

    }
}
