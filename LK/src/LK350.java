import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LK350 {
}
class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i1 = nums1.length;
        int i2 = nums2.length;
        int low = 0;
        int high = 0;
        while(low<i1&&high<i2){
            if(nums1[low]<nums2[high]){
                low++;
            }else if(nums1[low]>nums2[high]){
                high++;
            }else{
                list.add(nums1[low]);
                low++;
                high++;
            }
        }
        int[] ans = new int [list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;

    }
}
