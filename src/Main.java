import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập vào một số nguyên");
        int n = Integer.parseInt(scanner.nextLine());

        String select;
        System.out.println("bạn có muốn tiếp tục nhập không(Y/N)");
        select= scanner.nextLine();

        int sum;
        sum =+ n;
        while (select.equalsIgnoreCase("Y")) {
            System.out.println("nhập vào một số nguyên");
            n = Integer.parseInt(scanner.nextLine());
            System.out.println("bạn có muốn tiếp tục nhập không(Y/N)");
            select= scanner.nextLine();
            sum+=n;
        }
        System.out.println("Tổng các số bạn vừa nhập vào = "+sum);
    }
}
