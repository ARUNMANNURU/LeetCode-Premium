/**
 * 
 */
package easy.arrays;

/**
 * @author ArunMannuru
 *
 */
/*
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * A partially filled sudoku which is valid.
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 * 
 */
public class ValidSudoko {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{1,2,3,4,5,6,7,8,9},
						  {1,2,3,4,5,6,7,8,9},
						  {1,2,3,4,5,6,7,8,9},
						  {1,2,3,4,5,6,7,8,9},
						  {1,3,4,2,5,6,7,8,9},
						  {1,2,3,4,5,6,7,8,9},
						  {1,2,3,4,5,6,7,8,9},
						  {1,2,3,4,5,6,7,8,9},
						  {1,3,4,2,5,6,7,8,9}
				 		 };
		System.out.println(isValid(board));
	}
	public static boolean isValid(char[][] board){
		// Fist edge case
		if(board == null || board[0].length != 9 || board.length != 9)
			return false;
		
		// Row wise 9 rows.
		// Row traversing 
		for(int i = 0; i < 9; i++){
			// maintain the occurences of values
			boolean[] values = new boolean[9];
			// Column traversing
			for(int j = 0; j < 9; j++){
				// Check if the cell is empty
				if(board[i][j] != '.' ){
					// flip if the number occurs already.
					if(values[(int)board[i][j]-'1']){
						return false;
					}
					values[(int)board[i][j]-'1'] = true;
				}
			}
		}
		
		// Column wise 9 column
		// Column traversing
		for(int j = 0; j < 9; j++){
			// Maintain the occurances of values
			boolean[] values = new boolean[9];
			for(int i = 0; i < 9; i++){
				// check if cell is empty
				if(board[i][j] != '.'){
					// flip if the number occurs already.
					if(values[board[i][j]-'1']){
						return false;
					}
					values[board[i][j]-'1'] = true;
				}
			}
		}
		
		// Check each 3*3 matrix
		for(int block = 0; block < 9; block++){
			boolean[] values = new boolean[9];
			for(int i = block/3*3; i < block/3*3+3; i++){
				for(int j = block%3*3; j < block%3*3+3; j++){
					if(board[i][j]!= '.'){
						if(values[(int)(board[i][j]-'1')]){
							return false;
						}
						values[(int)(board[i][j]-'1')] = true;
					}
				}
			}
		}
		
		return true;
		
	}
}
