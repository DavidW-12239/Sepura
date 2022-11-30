package org.sepura.entity;

public class Product {
    private Integer id;
    private String Img;
    private String Name;
    private Double currPrice;
    private Double origPrice;
    private Integer sales;
    private Integer stock;
    private Integer status;
    private Integer reviewNum;
    private Double review;

    public Product(){}

    public Product(Integer id) {
        this.id = id;
    }

    public Product(Integer id, String img, String name, Double currPrice, Double origPrice, Integer sales, Integer stock, Integer status, Integer reviewNum, Double review) {
        this.id = id;
        Img = img;
        Name = name;
        this.currPrice = currPrice;
        this.origPrice = origPrice;
        this.sales = sales;
        this.stock = stock;
        this.status = status;
        this.reviewNum = reviewNum;
        this.review = review;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(Double currPrice) {
        this.currPrice = currPrice;
    }

    public Double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Double origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(Integer reviewNum) {
        this.reviewNum = reviewNum;
    }

    public Double getReview() {
        return review;
    }

    public void setReview(Double review) {
        this.review = review;
    }
}
