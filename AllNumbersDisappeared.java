import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllNumbersDisappeared {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearingNums(arr));
    }
    static List<Integer> findDisappearingNums(int[] arr){
        List<Integer> li  = new ArrayList<>();
        int i=0;
        while (i<arr.length) {
            int correct = arr[i]-1; // When the question is array ranges from [1,n] then it is equal to arr[i]-1
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int index =0;index<arr.length;index++){
            if(arr[index]!=index+1){
                li.add(index+1);
            }
        }
        return li;
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
