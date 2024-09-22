import java.sql.SQLOutput;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {

        // nhap so tu nguoi dung
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        double n = input.nextDouble();

        // tinh sin(n), cos(n), sqrt(n)
        double sinN = Math.sin(n);
        double cosN = Math.cos(n);
        double sqrtN = Math.sqrt(n);

        // hien thi ket qua
        System.out.println("sin(" + n + ") = " + sinN);
        System.out.println("cos(" + n + ") = " + cosN);
        System.out.println("sqrt(" + n + ") = " + sqrtN);

        input.close();
    }
}

