package com.save.rabits;

import java.io.Serializable;

/**
 * Created by Asanka Nanayakkara on 20/03/2018.
 */

public class donation implements Serializable {
    private String donatorName = "";
    private String email = "";
    private String phone = "";
    private String amount = "";

    public String getDonatorName() {
         return donatorName;
    }

    public void setDonatorName(String donatorName) {
        this.donatorName = donatorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
