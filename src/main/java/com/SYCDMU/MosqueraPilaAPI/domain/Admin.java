package com.SYCDMU.MosqueraPilaAPI.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
@ToString
public class Admin {

    private String id;

    private String names;

    private String lastnames;

    private String email;

    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
