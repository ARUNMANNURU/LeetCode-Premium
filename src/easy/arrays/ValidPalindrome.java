/**
 * 
 */
package easy.arrays;

/**
 * @author ArunMannuru
 *
 */
public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}
	public static boolean isPalindrome(String s){
	
		int size = s.length();
        String lcs = s.toLowerCase();
        int left = 0;
        int right = size - 1;
        while(right >= left) {
            if(lcs.charAt(right) == lcs.charAt(left)) {
                right--;
                left++;
            } else if(!Character.isLetter(lcs.charAt(right))) {
                right--;
            } else if(!Character.isLetter(lcs.charAt(left))) {
                left++;
            } else {
                return false;
            }
        }
        
        return true;
	}
}
