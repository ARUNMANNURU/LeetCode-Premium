/**
 * 
 */
package Amazon;

/**
 * @author ArunMannuru
 *
 */
/*
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * You may assume that the version strings are non-empty and contain only digits and the . character.The .
 * character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three",
 *  it is the fifth second-level revision of the second first-level revision.
 *  Here is an example of version numbers ordering:
 *  0.1 < 1.1 < 1.2 < 13.37
 *
 */
public class VersionComparision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version1 = "1.0";
		String version2 = "1.5";
		System.out.println(compareVersion(version1,version2));
	}
	 public static int compareVersion(String version1, String version2) {
		 
		 String[] ver1 = version1.split("\\.");
		 String[] ver2 = version2.split("\\.");
		 int verOneLength = ver1.length;
		 int verTwoLength = ver2.length;
		 int i = 0, j = 0;
		 while(i < verOneLength && j < verOneLength){
			 if(Integer.parseInt(ver1[i]) > Integer.parseInt(ver2[j])){
				 return 1;
			 }else if(Integer.parseInt(ver1[i]) < Integer.parseInt(ver2[j])){
				 return -1;
			 }
			 i++;
			 j++;
		 }
		 while(i < verOneLength){
			 if(Integer.parseInt(ver1[i]) > 0){
				 return 1;
			 }
			 i++;
		 }
		 while(j < verTwoLength){
			 if(Integer.parseInt(ver2[j]) > 0){
				 return 1;
			 }
			 j++;
		 }
		 
		 return 0;
	 }
}
