class Solution {
    public void moveZeroes(int[] A) {
        int j=0;
        int n=A.length;
        for(int i=0;i<n;i++){
            if(A[i]!=0){
                // swap(A,i,j);
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                j++;
            }
        }
        for(int i=j;i<n;i++){
            A[i]=0;
        }
    }
}