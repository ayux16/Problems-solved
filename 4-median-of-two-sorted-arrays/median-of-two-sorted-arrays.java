class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int merged[]= merge(nums1,nums2);
       int n=merged.length;
       if(n%2==0){
            return (merged[n/2-1] +merged[n/2])/2.00000;
       }
       else{
        return merged[n/2];
       }
    }
    
    public int[] merge(int[] num1,int[] num2){
        int n=num1.length;
        int m=num2.length;
        int merged[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(num1[i]<num2[j]){
                merged[k]=num1[i];
                i++;
                k++;
            }
            else{
                merged[k]=num2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            merged[k]=num1[i];
                i++;
                k++;
        }
        while(j<m){
            merged[k]=num2[j];
                j++;
                k++;
        }
        return merged;
    }
}