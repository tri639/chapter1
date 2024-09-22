import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vap mot chuoi: ");
        String userInput = input.nextLine();

        int length = userInput.length();

        System.out.println("Do dai cua chuoi la: " + length);

        input.close();
    }
}

