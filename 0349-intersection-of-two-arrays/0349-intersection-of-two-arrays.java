class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int i = 0; i< nums1.length; i++){
            set1.add(nums1[i]);
        }

        for(int j = 0; j< nums2.length; j++ ){
            if(set1.contains(nums2[j])){
                result.add(nums2[j]);
            }
        }

        int[] ans = new int [result.size()];

        int i = 0;
        for(int num : result){
            ans[i++] = num;
        }

    return ans;

    }
}