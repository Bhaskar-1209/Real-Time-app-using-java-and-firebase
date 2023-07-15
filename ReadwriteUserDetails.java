package com.example.firebaseapp;

public class ReadwriteUserDetails {
    public String fullname, DoB, gender, mobile;

    public ReadwriteUserDetails(String textFullname, String textDoB, String textMobile, String mobile){
     this.fullname = textFullname;
     this.DoB = textDoB;
     this.mobile = textMobile;
    }
}
