import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Scanner_name = new Scanner(System.in);
        int x = Scanner_name.nextInt();
        System.out.println(+ x);

        int arr[];
        arr = new int[x];

        int max = 100, min = -100;
        int range = max-min+1;

        for (int i = 0; i < x; i++){
            arr[i] = (int)(Math.random()*range)+min;
            System.out.print(arr[i] + " ");
        }
    }
}
