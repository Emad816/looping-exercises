package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        for(int k =10; k > 0; k--){
            System.out.println(k);
            Thread.sleep(1000);
            if(k == 1){
                System.out.println("Launch");
            }
        }
    }
}
