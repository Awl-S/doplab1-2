public class Main {

    public static void main(String[] args) {

        int x = 20;
        int arr[];
        arr = new int[x];

        int max = 1, min = -1;
        int range = max-min+1;

        for (int i = 0; i < x; i++){
            arr[i] = (int)(Math.random()*range)+min;
            System.out.print(arr[i] + " ");
        }
    }

}
