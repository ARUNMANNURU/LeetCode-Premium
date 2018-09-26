/**
 * 
 */
package easy.sortingsearching;

/**
 * @author ArunMannuru
 *
 */
/*
 * Merge Sorted Array
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. 
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * 
 */
public class MergeSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrOne = {1,3,5};
		int[] arrTwo = {2,4,6};
		int m = arrOne.length;
		int n = arrTwo.length;
		int[] arr = merge(arrOne,m,arrTwo,n);
		for(int x : arr){
			System.out.println(x);
		}
	}
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        while(n>0){ 
        	nums1[m+n-1] = (m==0||nums2[n-1] > nums1[m-1]) ? nums2[--n] : nums1[--m];
        }
        return nums1;
    }
}
