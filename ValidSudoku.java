class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet = new HashSet();
        Set<Character> colSet = new HashSet();
        for(int i = 0 ; i<9;i++){
            for(int j = 0;j<9;j++){
                if(rowSet.contains(board[i][j]) || colSet.contains(board[j][i])){
                    System.out.println(rowSet);
                    System.out.println(colSet);
                    return false;
                }else{
                    rowSet.add(board[i][j]);
                    colSet.add(board[j][i]);
                }
                rowSet.remove('.');
                colSet.remove('.');
            }
            rowSet.clear();
            colSet.clear();
        }
    
        for(int i=0;i<9;i+=3){
	        for(int j=0;j<9;j+=3){
	            if(!checker(i,j,board)){
                    return false;
                } 
	        }
	    }
    return true;
    }

    	public static boolean checker(int row , int col,char[][] board){
        Set <Character> squareSet = new HashSet();
	    for(int i = row;i<row+3;i++){
            for(int j = col;j<col+3;j++){
                if(squareSet.contains(board[i][j])){
                    return false;
                }else{
                    squareSet.add(board[i][j]);
                }
                squareSet.remove('.');
            }
        }
        return true;
	}

}


