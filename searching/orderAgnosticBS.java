public class orderAgnosticBS {
    public static void main(String[] args){
        int[] arr={2,5,15,20,59,68,79,90,101};
        int target=15;
        int ans=binary(arr,target);
        System.out.println(ans);
    }

    static int binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    
}
