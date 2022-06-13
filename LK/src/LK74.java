public class LK74 {
    public static void main(String[] args) {

        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(new Solution74().searchMatrix(arr, 3));
    }

}


//这种红蓝分区的方法没有弄出来 有点不对劲（明天在想）
class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int l = -1;
        int r = matrix.length * matrix[0].length;
        int length = matrix[0].length;
        int mid = 0;
        while (l < r) {
            mid = (l + r) / 2;
            if (matrix[mid / length][mid % length] < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return matrix[l / length][l % length] == target;
    }
}



class Solution7411 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int l = 0;
        int r = matrix.length*matrix[0].length-1;
        int inLength = matrix[0].length;
        int mid = 0;
        while(l<r){
            mid = (l+r)/2;
            if(matrix[mid/inLength][mid%inLength]<target){
                l=mid+1;
            }else{
                //因为else执行的条件是>=所以不用-1
                r=mid;
            }
        }
        //return matrix[l/inLength][l%inLength]==target;
        return matrix[r/inLength][r%inLength]==target;
    }
}