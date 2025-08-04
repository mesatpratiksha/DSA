public class linear{
    public static void main(String[] args){
        int []  nums={2,4,5,89,63,12};
        int target=2;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    };

    static int linearSearch(int [] nums,int target){
        if (nums.length == 0){
            return -1;
        }

        for(int index=0;index< nums.length ;index++){
            int element=nums[index];
            if(element==target){
                
                System.out.println("element present at index");
                return index;
                
            }
        }
        System.out.println("element does not exist");
        return -1;

    }
}