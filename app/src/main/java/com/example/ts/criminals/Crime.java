package com.example.ts.criminals;

import android.support.annotation.NonNull;

import java.util.Date;
import java.util.UUID;

/**
 * Created by TS on 02/07/2017.
 */

public class Crime implements Comparable<Crime> {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;


    public UUID getId() {
        return mId;
    }


    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime() {
        // Generate unique identifier
       this(UUID.randomUUID());
    }
    public Crime(UUID uuid){
        mId=uuid;
        mDate=new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean equals(Object o){
        return this.getId().equals(((Crime)o).getId());
    }


    @Override
    public int compareTo(@NonNull Crime o) {
        if(this.getId().equals(o.getId())) return 0;
                else return -1;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

}
