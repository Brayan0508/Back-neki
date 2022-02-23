package com.neki.apineki.model;

import com.neki.apineki.DTO.UserInserirDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;
    @Column(name = "login")
    public String login;
    @Column(name = "password")
    public String password;
    @Column(name = "last_login_date")
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }
    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public UserModel(UserInserirDTO userInserirDTO) {
        this.login = userInserirDTO.getLogin();
        this.password = userInserirDTO.getPassword();
        this.lastLoginDate = userInserirDTO.getLastLoginDate();
    }
    public UserModel() {}
}
