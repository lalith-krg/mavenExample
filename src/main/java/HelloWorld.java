import java.util.Scanner;

public class HelloWorld {

    public int factorial(int n){
        int ans=1;
        for(int i=1; i<=n; i++){
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        HelloWorld obj = new HelloWorld();
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(obj.factorial(n));
    }
}
