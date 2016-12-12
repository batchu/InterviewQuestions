import java.util.*;

/**
 * Created by me on 12/11/2016.
 */
public class FindIfSumisPresentIfTwoAddedInArray {

    public static void main(String[] args){


        final  HashMap<Integer, ArrayList<Integer>> ifSumisPresentIfTwoAddedInArray = findIfSumisPresentIfTwoAddedInArray(new int[] {1,3,4,6,10,16,7});
    printSolution(ifSumisPresentIfTwoAddedInArray);

    }

    public static  HashMap<Integer, ArrayList<Integer>> findIfSumisPresentIfTwoAddedInArray(int[] array){

        HashMap<Integer, Integer> eleMap = new HashMap<>();

        for(int i=0; i<array.length;i++){
            eleMap.put(i,array[i]);
        }
        HashMap<Integer, ArrayList<Integer>> solution = new HashMap<>();

        for(int i=0;i<array.length;i++){

            for(int j=i;j<array.length;j++)
            {
                if(eleMap.containsValue(array[i]+array[j])){
                    solution.put(array[i]+array[j], new ArrayList<Integer>(Arrays.asList(array[i], array[j])) );
                }

            }
        }
        return solution;
    }

    public static void printSolution( HashMap<Integer, ArrayList<Integer>> solution){
        Iterator it = solution.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }
}
