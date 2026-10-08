
class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = Arrays.stream(nums)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) ->
                (String.valueOf(b) + a)
                        .compareTo(String.valueOf(a) + b)
        );

        for(int n: arr){
            System.out.print(n+" ");
        }
        StringBuilder sb=new StringBuilder();
        int zeroCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
            }
            sb.append(arr[i]);
        }
        if(zeroCount==arr.length){
            return "0";
        }
        return sb.toString();
        
    }
}