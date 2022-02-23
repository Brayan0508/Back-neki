package com.neki.apineki.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class UserInserirDTO {
    @NotBlank(message = "O campo não pode ser invalido")
    public String login;
    @NotBlank(message = "O campo não pode ser invalido")
    public String password;
    public LocalDate lastLoginDate ;

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

    public UserInserirDTO() {}
    public UserInserirDTO(String login, String password ) {
        this.login = login;
        this.password = password;
    }
}
