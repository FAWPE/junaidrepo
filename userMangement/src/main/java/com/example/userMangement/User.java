package com.example.userMangement;

public class User {
    private Integer UserId;
    private String Name;
    private String UserName;
    private  String Address;
   private Integer PhoneNumber;

    public User(Integer UserId,  String Name, String UserName, String Address, Integer PhoneNumber){
        this.UserId = UserId;
        this.Address=Address;
        this.UserName=UserName;
        this.PhoneNumber=PhoneNumber;
        this.Name=Name;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
       this.Name = name;
    }

    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        this.UserId = userId;
    }
}
