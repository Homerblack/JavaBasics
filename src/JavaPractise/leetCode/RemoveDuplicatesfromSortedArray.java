package src.JavaPractise.leetCode;


public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {

        int[] nums1 = { 1,2,3 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        for (int a : merge(nums1,m,nums2,n)){
            System.out.println(a);
        }
       

        System.out.println();

    }

    public  static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newItem = new int[m+n];
        for(int i=0; i<m; i++ ){
            newItem[i] = nums1[i];
        }
        int j = 0;
        for(int i=m; i<m+n; i++){
        newItem[i] =  nums2[j];
        j++;
    }

    int maxNumber;

    for (int i = 0; i < newItem.length-1; i++){
        
        if (newItem[i] > newItem[i+1] ) {
            maxNumber = newItem[i];
            newItem[i] = newItem[i+1];
           newItem[i+1] = maxNumber;
           nums1 = newItem;

    }
}
    return nums1;
}
}
