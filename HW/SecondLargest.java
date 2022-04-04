import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] nums = {23, 45, 100, 1, 3, 90, 24, 12, 101};
        for(int i=0;i<2;i++) minHeap.add(nums[i]);

        for(int i=2;i<nums.length;i++){
            if(minHeap.peek()>nums[i]){
                continue;
            }else{
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        System.out.println(minHeap.peek());
    }




}





