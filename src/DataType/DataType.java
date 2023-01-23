package DataType;

import java.util.Locale;

public class DataType {
//    Tipe data dibagi menjadi 2
    /*
    1. Tipe data Primitive
        char, byte, short, int, long, float, double, boolean
        tipe data ini tidak bisa dimanipulasi, bener" pakek logika kalau mau nggunain variabelnya

    2. Tipe data non Primitive / Object
        String, Byte, Short, Integer, Float, Double, Boolean
    * */
public static void main(String[] args) {
    int number1 = 5;
    int number2 = 10;

    System.out.println(Integer.valueOf(number1).compareTo(Integer.valueOf(number2)));

    String nama = "Muham";
    System.out.println(nama.toLowerCase());
    System.out.println(nama.toUpperCase());
}


}
