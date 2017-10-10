public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        result.add(tmp); // add empty set
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            int n =  result.size();
            for(int j=0; j<n; j++){
                // NOTE: must create a new tmp object, and add element to it.
                tmp = new ArrayList<Integer>(result.get(j));
                tmp.add(nums[i]);
                result.add(new ArrayList<Integer>(tmp));
            }   		
        }
        return result;
    } 
}
