package com.project.bea.design_patterns;

public class MyDataBase {

    String databaseUrl;
    private static MyDataBase instance;

    private MyDataBase(){
    }

    public static MyDataBase getInstance() {
        if(instance == null){
            instance = new MyDataBase();
        }
        return instance;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }
}
