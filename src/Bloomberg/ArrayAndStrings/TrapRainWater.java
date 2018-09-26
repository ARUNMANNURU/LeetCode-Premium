/**
 * 
 */
package Bloomberg.ArrayAndStrings;

/**
 * @author ArunMannuru
 *
 */
/*
 * Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

Example:

Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
 */
public class TrapRainWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
	public static int trap(int[] height) {
        if (height.length == 0) 
        	return 0;
        int left = 0;
        int right = height.length - 1;
        int area = 0, leftHeight = height[0], rightHeight = height[height.length - 1];
        while (left < right){
            if (height[left] < height[right]){
                left++;
                leftHeight = Math.max(leftHeight, height[left]);
                area += leftHeight - height[left];
            }
            else{
                right--;
                rightHeight = Math.max(rightHeight, height[right]);
                area += rightHeight - height[right];
            }
        }
        return area;
    }
}
