// class Solution {
//     public boolean isGood(int[] nums)
//     {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++)
//         {
//           if(nums[i]==i && nums[nums.length]==nums[nums.length-1])
//           {
//               return true;
//           }
//         }
//         return false;
//     }
// }
public class Solution {
  public boolean isGood(int[] nums) 
  {
    final int kMax = 200;
    final int n = nums.length - 1;
    int[] count = new int[kMax + 1];

    for (final int num : nums)
      ++count[num];

    return (n == 0 || Arrays.stream(count, 1, n).allMatch(c -> c == 1)) && count[n] == 2;
  }
}
