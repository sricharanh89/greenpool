package com.greenpool.model;

import java.util.Date;

public class Ride {

    private String srcLat;

    public String getSrcLat() {
        return srcLat;
    }

    public void setSrcLat(String srcLat) {
        this.srcLat = srcLat;
    }

    public String getSrcLong() {
        return srcLong;
    }

    public void setSrcLong(String srcLong) {
        this.srcLong = srcLong;
    }

    public String getDesLat() {
        return desLat;
    }

    public void setDesLat(String desLat) {
        this.desLat = desLat;
    }

    public String getDesLong() {
        return desLong;
    }

    public void setDesLong(String desLong) {
        this.desLong = desLong;
    }

    public Date getPickUpTim() {
        return pickUpTim;
    }

    public void setPickUpTim(Date pickUpTim) {
        this.pickUpTim = pickUpTim;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPreferred() {
        return preferred;
    }

    public void setPreferred(String preferred) {
        this.preferred = preferred;
    }

    private String srcLong;
    private String desLat;
    private String desLong;
    private Date pickUpTim;
    private String userId;
    private String preferred;


}
