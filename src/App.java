import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(b + c <= a){
            System.out.println("Farei hoje!");
        }else{
            System.out.println("Deixa para amanha!");
        }

        sc.close();
    }
}
