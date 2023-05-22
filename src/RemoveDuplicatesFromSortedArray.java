public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(majorityElement3(new int[]{1, 5, 5, 5, 2, 5, 3, 3}));
    }

    public static int majorityElement3(int[] nums) {
        int count = 0,ret=0;

        for(int n : nums){
            if(count==0){
                ret=n;
            }
            if(n!=ret){
                count--;
            }
            else{
                count++;
            }
        }
        return ret;

    }
}
