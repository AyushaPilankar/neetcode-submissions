class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n/2;i++){
            for(int j=n-1-i;j>i;j--){
                
                    char temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                    
                    break;
                
            }
        }
    }
}