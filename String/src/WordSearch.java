
public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = {
	            {'A', 'B', 'C', 'D'},
	            {'E', 'F', 'G', 'H'},
	            {'I', 'J', 'K', 'L'}
	        };

	        String word = "AC";

	        WordSearch1 solution = new WordSearch1();
	        int[][] result = solution.searchWord(grid, word);

	        for (int[] coords : result) {
	            System.out.println("Row: " + coords[0] + ", Col: " + coords[1]);
	        }

	}

}
class WordSearch1
{
 
    int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
 
    // This function searches in all
    // 8-direction from point
    // (row, col) in grid[][]
    boolean search2D(char[][] grid, int row, int col, String word,int R,int C)
    {
        // If first character of word
        // doesn't match with
        // given starting point in grid.
        if (grid[row][col] != word.charAt(0))
            return false;
 
        int len = word.length();
 
        // Search word in all 8 directions
        // starting from (row, col)
        for (int dir = 0; dir < 8; dir++) {
            // Initialize starting point
            // for current direction
            int k, rd = row + x[dir], cd = col + y[dir];
 
            // First character is already checked,
            // match remaining characters
            for (k = 1; k < len; k++) {
                // If out of bound break
                if (rd >= R || rd < 0 || cd >= C || cd < 0)
                    break;
 
                // If not matched, break
                if (grid[rd][cd] != word.charAt(k))
                    break;
 
                // Moving in particular direction
                rd += x[dir];
                cd += y[dir];
            }
 
            // If all character matched,
            // then value of must
            // be equal to length of word
            if (k == len)
                return true;
        }
        return false;
    }
    public int[][] searchWord(char[][] grid, String word)
    {
        
        // Code here
            int R = grid.length;
            int C = grid[0].length;
            int[][] ans = new int[R * C][2]; // Adjusted dimensions
            int k = 0;
            
            for (int row = 0; row < R; row++) {
                for (int col = 0; col < C; col++) {
                    if (grid[row][col] == word.charAt(0) && search2D(grid, row, col, word, R, C)) {
                        ans[k][0] = row;
                        ans[k][1] = col;
                        k++;
                    }
                }
            }
        
            // Create a new array with the correct size to store the valid occurrences
            int[][] validOccurrences = new int[k][2];
            System.arraycopy(ans, 0, validOccurrences, 0, k);
        
            return validOccurrences;

    }
}