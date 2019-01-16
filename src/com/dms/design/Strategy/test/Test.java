package com.dms.design.Strategy.test;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        try{
            File file = new File("d:/hteos/upload/icons/");
            if (!file.exists()){
                file.mkdirs();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
