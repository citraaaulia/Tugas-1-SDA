package SDA;

import java.util.ArrayList;

public class nomor6 {
    public static void main(String[] args) {
       ArrayList<String> huruf = new ArrayList<String>();
       huruf.add("u");
       huruf.add("l");
       huruf.add("i");
       huruf.add("a");

       huruf.add(0,"e");
       System.out.println("setelah elemen e ditambahkan pada index 0 :" +huruf);

       huruf.add(2,"f");
       System.out.println("setelah elemen f ditambahkan pada index 2 :" +huruf);

       huruf.add(3,"g");
       System.out.println("setelah elemen g ditambahkan pada index 3 :" +huruf);

       huruf.add(4,"h");
       System.out.println("setelah elemen h ditambahkan pada index 4 :" +huruf);

       huruf.add(6,"h");
       System.out.println("setelah elemen h ditambahkan pada index 6 :" +huruf);

       huruf.add(-3,"j");
       System.out.println("setelah elemen j ditambahkan pada index -3 :" +huruf);



       
       
        
    }
    
}
