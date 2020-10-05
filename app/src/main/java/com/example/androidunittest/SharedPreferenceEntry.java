package com.example.androidunittest;

import java.util.Calendar;

public class SharedPreferenceEntry {

    private final String mName;

    private final Calendar mDateofBirth;

    private final String mEmail;

    public SharedPreferenceEntry(String name, Calendar dateofBirth, String email) {
        mName = name;
        mDateofBirth = dateofBirth;
        mEmail = email;
    }

    public String getName() {
        return mName;
    }

    public Calendar getDateofBirth() {
        return mDateofBirth;
    }

    public String getEmail() {
        return mEmail;
    }
}
