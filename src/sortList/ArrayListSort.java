package sortList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSort {


    public static void main(String[] args){

        List<Integer> firstList = Arrays.asList(1,2,4,7);
        List<Integer> secondList =Arrays.asList(1,3,4,5,6);

        List<Integer> sortList = new ArrayListSort().sortAndMergeList(firstList,secondList);

        sortList.forEach(integer -> System.out.print(integer));
    }



    public List sortAndMergeList(List<Integer> firstList, List<Integer> secondList){

        List<Integer> sortList = new ArrayList<>();
        int i=0 , j=0 , k =0 ;
        while(i < firstList.size() && j < secondList.size() ){
            if(firstList.get(i) <= secondList.get(j)){
                sortList.add(firstList.get(i));
                i++;
            }else{
                sortList.add(secondList.get(j));
                j++;
            }

            k++;
        }

        while(i < firstList.size()){
            sortList.add(firstList.get(i));
            i++;
            k++;
        }
        while(j <secondList.size()){
            sortList.add(secondList.get(j));
            j++;
            k++;
        }
        return sortList;
    }


}
