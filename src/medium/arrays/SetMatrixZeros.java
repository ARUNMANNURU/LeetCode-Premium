/**
 * 
 */
package medium.arrays;

/**
 * @author ArunMannuru
 *
 */
public class SetMatrixZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixZero = {
							  {1,0,4},
							  {0,1,2}
							 };
		int row = matrixZero.length;
		int col = matrixZero[0].length;
		int[][] mat = matrixZero(matrixZero,row,col);
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(mat[i][j]+" ");
			}
		}
	}
	public static int[][] matrixZero(int[][] matrixZero,int row,int col){
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(matrixZero[i][j] == 0){
					nullifyMatrix(matrixZero,i,j);
				}
			}
		}
		return matrixZero;
	}
	public static int[][] nullifyMatrix(int[][] matrixZero,int row,int col){
		for(int i = 0 ; i < row; i++){
			matrixZero[row][i] = 0;
		}
		for(int j = 0; j < col; j++){
			matrixZero[j][col] = 0;
		}
		return matrixZero;
	}
}
