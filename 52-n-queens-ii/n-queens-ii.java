class Solution {
    int count=0;
    public int totalNQueens(int n) {
        ArrayList<List<String>> al = new ArrayList<>();
        char[][] queen = new char[n][n];
        for(int i=0;i<queen.length;i++){
            Arrays.fill(queen[i],'.');// filling each row and col as '.';
        }
        solveUntil(queen,al,0);
        return count;
    }
    public boolean isValid(char[][]queen , int row, int col){
        for(int i=col-1;i>=0;i--){
            if(queen[row][i]=='Q') return false;
        }
        for(int i = row-1,j=col-1;i>=0&&j>=0;j--,i--){
            if(queen[i][j]=='Q') return false;
        }
        for(int i=row+1,j=col-1;i<queen.length&&j>=0;i++,j--){
            if(queen[i][j]=='Q') return false;
        }
        return true;
    }
    public void solveUntil(char[][] queen ,ArrayList<List<String>>al,int index){
        if(index == queen.length){
            ArrayList<String> temp = new ArrayList<>();
            for(int i=0;i<queen.length;i++){
                StringBuilder sb  = new StringBuilder();
                for(int j=0;j<queen.length;j++){
                    sb.append(queen[i][j]);
                }
                temp.add(sb.toString());
            }
            al.add(temp);
            count++;
            return;
        }
        for(int i=0;i<queen.length;i++){
            if(isValid(queen,i,index)){
                queen[i][index] = 'Q';
                solveUntil(queen,al,index+1);
                queen[i][index]='.';
            }
        }
    }
}