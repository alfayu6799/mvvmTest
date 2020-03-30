package com.example.belalkhan.androidviewmodel;

/******************
 *
 * Account to https://api.github.com/
 * create User class
 * aratar_url
 * login
 * site_admin
 *
******************/

public class User {
    private String avatar_url;
    private String login;
    private String site_admin;

    public User(String avatar_url, String login, String site_admin) {
        this.avatar_url = avatar_url;
        this.login = login;
        this.site_admin = site_admin;
    }

    public String getAvatar_url() {
        return avatar_url;
    }


    public String getLogin() {
        return login;
    }


    public String getSite_admin() {
        return site_admin;
    }
}
