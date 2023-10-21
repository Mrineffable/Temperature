import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float temperature, fahrenheit,cel;
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celsius");
        System.out.println("Enter the choice");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Temperature in celsius");
                cel=sc.nextFloat();
                fahrenheit=(cel*9/5)+32;
                System.out.println(cel+"°Celsius = "+fahrenheit+"°Fahrenheit");
                break;
            case 2:
                System.out.println("Enter Temperature in fahrenheit");
                fahrenheit=sc.nextFloat();
                cel=(fahrenheit-32)*5/9;
                System.out.println(fahrenheit+"°Fahrenheit = "+cel+"°Celsius");
                break;
            default:
                System.out.println("Invalid choice ");
                break;
        }
    }

}
