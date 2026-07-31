class Solution {
    public int[] shuffle(int[] nums, int n) {
      int []first=Arrays.copyOfRange(nums, 0,n);
      int[]second=Arrays.copyOfRange(nums,n,nums.length);
      int arr[]=new int[nums.length];
      int j=0;
      for(int i=0;i<n;i++){
    arr[j++]=first[i];
    arr[j++]=second[i];
      }  
      return arr;
    }
}