package org.sepura.entity;


public class CartItem {
    private Integer id ;
    private Product product;
    private Integer quantity ;
    private User user;

    public CartItem(){
    }

    public CartItem(Integer id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public CartItem(Product product, Integer buyCount, User user) {
        this.product = product;
        this.quantity = quantity;
        this.user = user;
    }

    public CartItem(Integer id) {
        this.id = id;
    }

    public CartItem(Integer id, Product product, Integer quantity, User user) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
