import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap chieu rong cua hinh chu nhat: ");
        double width = input.nextDouble();

        System.out.println("Nhap chieu cao cua hinh chu nhat: ");
        double height = input.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width * height);

        System.out.println("Dien tich hinh chu nhat: " + area);
        System.out.println("Chu vi hinh chu nhat: " + perimeter);

        input.close();
    }
}
