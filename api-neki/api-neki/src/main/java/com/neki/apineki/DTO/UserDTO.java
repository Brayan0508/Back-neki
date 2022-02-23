package com.neki.apineki.DTO;

import com.neki.apineki.model.UserModel;

import java.time.LocalDate;

public class UserDTO {
    public Integer id;
    public String login;
    public LocalDate lastLoginDate ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public UserDTO(String login, LocalDate lastLoginDate) {
        this.login = login;
        this.lastLoginDate = lastLoginDate;

    }

    public UserDTO(UserModel user) {
        this.login = user.getLogin();
        this.lastLoginDate = user.getLastLoginDate();
    }

    public UserDTO() {
    }
}
