
class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = Arrays.stream(nums)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) ->
                (String.valueOf(b) + a)
                        .compareTo(String.valueOf(a) + b)
        );
        if(arr[0]==0){return "0";}
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
        
    }
}