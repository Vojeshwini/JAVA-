package com.xworkz.duster.temp;

public class LiftTester {

    public static void main(String[] args) {


        try(LiftResource liftResource=new LiftResource();) {
            liftResource.open();//
            //liftResource.close();
        }




    }
}
