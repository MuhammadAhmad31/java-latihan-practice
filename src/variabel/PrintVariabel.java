package variabel;

public class PrintVariabel {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        String namaDepan = "Ahmad";
        String namaBelakang = "Muhammad";

        String number3 = "5";

//    ketika + digunakan untuk angka, maka akan terjadi penambahan angka
        System.out.println(number1 + number2);

//    ketika + digunakan untuk String, maka akan terjadi concatenation
        System.out.println(namaDepan + namaBelakang);

//    ketika + digunakan untuk angka dan string, maka akan terjadi concatenation
        System.out.println( number1 + number3);
    }
}
