package com.atguigu.com.bean;

import java.util.ArrayList;

public class Customer {

    //prsf
    //private static final

    //ArrayList
    ArrayList arrayList = new ArrayList();



    public void test1(){
        System.out.println("arrayList = " + arrayList);//soutv
        System.out.println("Customer.test1");//soutm
        System.out.println("");//soutp
        System.out.println();//sout

        //fori
        String [] arr = new String[]{"Tom","Bob","HanMeimei","LiLei"};
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


        //ArrayList.for
        ArrayList arrayList = new ArrayList();
        arrayList.add("123");
        arrayList.add("789");
        arrayList.add("456");

        for (Object o : arrayList) {
            
        }


        //ArrayList.fori
        for (int i = 0; i < arrayList.size(); i++) {
            
        }


        //ArrayList.forr 倒叙遍历
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            
        }
    }

    public void test(){
        ArrayList list = new ArrayList();
        arrayList.add("123");
        arrayList.add("789");
        arrayList.add("456");

        //ifn
        if (list == null) {

        }

        //inn
        if (list != null) {
            
        }

        //xxx.nn xxx.null




    }
}