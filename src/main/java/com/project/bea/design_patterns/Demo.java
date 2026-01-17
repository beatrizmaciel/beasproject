package com.project.bea.design_patterns;

public class Demo {

    public static void main(String[] args) {

        MyDataBase myDataBase = MyDataBase.getInstance();

        myDataBase.setDatabaseUrl("www.meusite.com.br");

        MyDataBase myDataBase2 = MyDataBase.getInstance();

        System.out.println(myDataBase2.getDatabaseUrl());

    }

}
