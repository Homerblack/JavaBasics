package src.JavaPractise.leetCode;

import java.nio.charset.Charset;

public class MainProgram {
    
    public static void main(String[] args) {

        MainInterfaces mainInterfaces = new MainInterfaces();

        String some = "キユーピー エルドレッシング　和風たまねぎ";


         int byteLength = some.getBytes(Charset.forName("Windows-31J")).length;

        System.out.println(byteLength);
        



        RemoveDuplicatesfromSortedArrays removeDuplicatesfromSortedArrays = new RemoveDuplicatesfromSortedArrays();

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

       


        System.out.println(mainInterfaces.star);
        System.out.println(mainInterfaces.message);
        System.out.println(mainInterfaces.star);

       

        int [] nums = {1,3,5,6};
        int target = 2;



        System.out.println( searchInsertPosition.searchInsert(nums, target));
        

       //// System.out.println( removeDuplicatesfromSortedArrays.removeDublicate(nums));

        System.out.println(mainInterfaces.star);


    }

}
