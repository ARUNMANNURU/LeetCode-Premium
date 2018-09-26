/**
 * 
 */
package easy.Math;

/**
 * @author ArunMannuru
 */
 /*
  * Fizz Buzz
  * Write a program that outputs the string representation of numbers from 1 to n.
  * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
  * Example:
  * n = 15,
  * Return:
  * [
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
	]
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		fizzBuzz(n);
	}
	public static void fizzBuzz(int n){
		for(int i = 1; i <= n; i++){
			if(i%3 == 0 && i/3 == 1){
				System.out.println("Fizz");
			}
			if(i%5 == 0 && i/5 == 1){
				System.out.println("Buzz");
			}
			if(i%3 == 0 && i/3 == 1 && i%5 == 0 && i/5 == 1){
				System.out.println("Fizz,Bizz");
			}
			System.out.println(i);
		}
	}
}
