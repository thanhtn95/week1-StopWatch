import java.util.Random;

public class SelectionSortTest {
    public static void main(String[] args) {
        int[] arr = getArr();
        StopWatch sw = new StopWatch();
        sw.start();
        selectionSort(arr);
        sw.end();
        System.out.println("ElapsedTime: " + sw.getElapsedTime() + " milliseconds");
    }

    private static int[] getArr() {
        int[] arr = new int[100000];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(1000);
        }
        return arr;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }
}
