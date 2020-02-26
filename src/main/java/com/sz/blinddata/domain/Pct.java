package com.sz.blinddata.domain;

import java.sql.Timestamp;

public class Pct {
    private String account;
    private Timestamp ptime;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Timestamp getPtime() {
        return ptime;
    }

    public void setPtime(Timestamp ptime) {
        this.ptime = ptime;
    }
}
