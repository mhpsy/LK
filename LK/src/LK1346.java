public class LK1346 {
}

class Solution1346 {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        int num = 0;
        for(int i = 0 ;i<len ;i++){
            num = arr[i]*2;
            for(int j = 0;j<len;j++){
                if(i!=j&&num == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
