import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome in a calculator <3\n Enter first number ");
        double number1=scanner.nextDouble();
        System.out.println("Enter second number");
        double number2=scanner.nextDouble();
        System.out.println("1.sum, 2.subtract 3. multiply 5.divide");
        System.out.println("What opration do you want to perform?");
        int option= scanner.nextInt();
        switch (option){
            case 1:
                System.out.println(number1+number2);;
            break;
            case 2:
                System.out.println(number1-number2);
        break;
            case 3:
                System.out.println(number1*number2);
        break;
            case 4:
                System.out.println(number1/number2);}



    }
}
