class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        char[] arr = s.toCharArray(); 
        
        for(int i = 1; i<n; i++){
            if(arr[i-1] == 'b' && arr[i] == 'a' ){
                return false;
            }
        }

        return true;
    }
}