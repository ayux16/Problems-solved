class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=merge(nums1,nums2);
        int n=ans.length;
        if(n%2==0){
            return (ans[n/2-1]+ans[n/2])/2.0;
        }
        else{
            return ans[n/2];
        }
    }
    public int[] merge(int nums1[],int nums2[]){
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0,k=0;
        int ans[]=new int[n+m];
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                i++;
                k++;
            }
            else{
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        return ans;
    }
}