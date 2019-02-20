/**
 * Created by singhgu on 2/8/2019.
 */
public class mergeSortedArray88 {

    public static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n){

        for(int arrIndex = m+n-1, mIndex=m-1, nIndex=n-1; arrIndex>=0 && mIndex>=0 && nIndex>=0 ; arrIndex--){
            if(nums1[mIndex]> nums2[nIndex])
                nums1[arrIndex]=nums1[mIndex--];
            else
                nums1[arrIndex]=nums2[nIndex--];
        }
        return nums1;
    }

    public static void main(String[] args){
        int[] arr = mergeSortedArray(new int[]{0}, 0,new int[]{2} , 1);
        for(int i: arr)
            System.out.print(i);
    }
}
