class Solution {
    public int missingNumber(int[] arr) {
         int sum=0;
        int n=arr.length;
       for(int s:arr){
           sum+=s;
       }
        return (n*(n+1))/2-sum;
    }
}
/*
if number is exclusive then
int missingNum(int arr[]) {
        // code here
        long sum = 0L;
        int n = arr.length + 1;           // for range 1..n
        for(int s : arr) {
            sum += s;
        }
        long expected = ((long) n * (n + 1)) / 2L;
        return (int) (expected - sum);
    }


    otherwise use above approach
*/