class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] columnset = new HashSet[9];
        for(int i=0;i<9;i++){
            columnset[i] = new HashSet<>();
        }

        HashSet<Character>[] boxset = new HashSet[9];
        for(int j=0;j<9;j++){
            boxset[j] = new HashSet<>();
        }

        for(int r=0;r<9;r++){
            HashSet<Character> rowset = new HashSet<>();
            for(int c=0;c<9;c++){
            //row check
            if(board[r][c]=='.'){
                continue;
            }
            else if(rowset.contains(board[r][c])){
                return false;
            }
            else{
                rowset.add(board[r][c]);
            }

            // column check
            if(board[r][c]=='.'){
                continue;
            }
            else if(columnset[c].contains(board[r][c])){
                return false;
            }
            else{
                columnset[c].add(board[r][c]);
            }

            // box check
            if(board[r][c]=='.'){
                continue;
            }
            else if(boxset[(r/3)*3 + (c/3)].contains(board[r][c])){
                return false;
            }
            else{
                boxset[(r/3)*3 + (c/3)].add(board[r][c]);
            }
        }
    }

    return true;
    }
}