
public class ExcelColumn_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class ExcelColumn {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnName = new StringBuilder();
 
        while (columnNumber > 0) {
            // Find remainder
            int rem = columnNumber % 26;
 
            // If remainder is 0, then a
            // 'Z' must be there in output
            if (rem == 0) {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            }
            else // If remainder is non-zero
            {
                columnName.append((char)((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }
 
        return columnName.reverse().toString();
    }
}
