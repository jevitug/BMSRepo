package com.example.durandal.budgetingmadesimple;

import android.app.Application;

/**
 * This is the class that handles Activity independant app state. Can store data with global access
 * level. Data lives as long as the app does.
 *
 * This is where ExpenditureSystem's singleton lives.
 * This is where DataBase's singleton lives
 * Account lives here
 *
 * Also contains a function OnCreate that can is called before any activity is created.
 */
public class BMSApplication extends Application {

    public static BMSApplication singleton;

    public static ExpenditureSystem expSystem = new ExpenditureSystem();

    // null at startup, instance created during setup process.
    public static Database database = null;

    // null at startup, instance created during login process.
    public static UserAccount account = null;

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }
}
