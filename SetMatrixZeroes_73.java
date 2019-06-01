class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for(int i = 0; i < rows.length; i++){
            rows[i] = false;
        }
        for(int i = 0; i < cols.length; i++){
            cols[i] = false;
        }
        
        for(int i = 0; i < matrix.length; i++){
            
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j]==0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            if(rows[i]){
                for(int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }    
        }
        for(int i = 0; i < matrix[0].length; i++){
            if(cols[i]){
                for(int j = 0; j < matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}