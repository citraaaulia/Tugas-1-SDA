package SDA;

import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {
        ArrayList<String> huruf = new ArrayList<String>();
        huruf.add("u");
        huruf.add("l");
        huruf.add("i");
        huruf.add("a");

        System.out.println("Array sebelum perintah Remove :");
        for(String var: huruf){
            System.out.println(var);
        }


        huruf.remove(0);
        huruf.remove(3);
        huruf.remove(2);
    

        System.out.println("Array setelah perintah Remove :");
            for(String var2: huruf){
                System.out.println(var2);
            }

    }
}
