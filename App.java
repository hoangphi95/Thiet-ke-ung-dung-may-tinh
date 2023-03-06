package calculated;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Math math=new Math();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào phép toán ");
        String dc=sc.nextLine();

        System.out.println("Nhập vào giá trị a= ");
        double a=sc.nextDouble();
        System.out.println("Nhập vào giá trị b= ");
        double b=sc.nextDouble();
        switch (dc){
            case"+":
                math.getSum(a,b);
                System.out.println(math.getSum(a,b));
                break;
            case "-":
                math.getMinus(a,b);
                System.out.println(math.getMinus(a,b));
                break;
            case "x":
                math.getProduct(a,b);
                System.out.println(math.getProduct(a,b));
                break;
            case "/":
                if(b==0){
                    System.out.println("Nhập giá trị b khác");
                }else {
                    math.getDual(a, b);
                    System.out.println(math.getDual(a, b));
                    break;
                }
        }
    }
}
