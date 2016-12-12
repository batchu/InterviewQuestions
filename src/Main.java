import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Integer> stream = new ArrayList<Integer>();
        List<Integer> newStream = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {

            stream.add(i + 1);
        }


//j is which jth element to be removed for each loop. For first pass, 2nd elements are removed. For second pass, 3rd elements are removed
        for (int j = 2, k = 0; j < 8; j++) {
            k = 0;
            while (k < 20) {
                if ((k - 1) < stream.size() && k % j != 0) {//Every 3rd element should be true
                    newStream.add(stream.get(k - 1));
                }
                k++;

            }
            for (int i : stream) {
                System.out.print(i + " ");
            }
            System.out.println();
            stream = newStream;
            newStream = new ArrayList<Integer>();
        }
    }
}
