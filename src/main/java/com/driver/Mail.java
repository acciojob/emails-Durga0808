package com.driver;
import java.util.Date;
public class Mail {
    private String message;
    private String sender;
    private Date date;

    public Mail( Date date, String sender,String message) {
        this.message = message;
        this.sender = sender;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }

    public Date getDate() {
        return date;
    }
}
