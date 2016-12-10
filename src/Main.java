import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Integer> stream = new ArrayList<Integer>();

        for(int i=0;i<20;i++){

                stream.add(i+1);
        }


        int j=2;
        int k=1;
        //need to update the termination condition
        List<Integer> newStream= new ArrayList<Integer>();
        while(k<20){
            if((k-1)<stream.size() && k%j != 0){//Every 3rd element should be true
                newStream.add(k);
            }
            k++;
        }

        for(int i:newStream)
        {
            System.out.println(i);
        }

    }
}
