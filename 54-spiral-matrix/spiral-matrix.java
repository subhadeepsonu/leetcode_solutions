class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        int right = col-1;
        int left = 0;
        int up = 0;
        int down = row -1;
        while(count<row*col){
            for(int i = left;i<=right &&count<row*col;i++){
                arr.add(matrix[up][i]);
                count++;
            }
            System.out.println(arr);
            up++;
            for(int i = up; i <=down &&count<row*col ;i++ ){
                arr.add(matrix[i][right]);
                count++;
            }
            System.out.println(arr);
            right--;
            for(int i = right ;i>=left &&count<row*col;i--){
                arr.add(matrix[down][i]);
                count++;
            }
            System.out.println(arr);
            down--;
            for(int i = down ; i>=up &&count<row*col;i--){
                arr.add(matrix[i][left]);
                count++;
            }
            System.out.println(arr);
            left++;            
        }
        return arr;
    }
}