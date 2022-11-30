package org.sepura.entity;

public class User {
    private Integer id ;
    private String uname ;
    private String pwd ;
    private String email;
    private String review;

    public User(){}

    public User(Integer id) {
        this.id = id;
    }

    public User(String uname, String pwd, String email) {
        this.uname = uname;
        this.pwd = pwd;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
