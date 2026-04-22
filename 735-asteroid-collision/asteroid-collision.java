class Solution {
    public int[] asteroidCollision(int[] ast) {
        ArrayDeque<Integer> al=new ArrayDeque<>();
        
        for(int cur: ast){
            boolean isDestroyed=false;
            while(!al.isEmpty() && al.peekLast()>0 && cur<0){

                if(al.peekLast()< -cur){
                    al.removeLast();
                }
                else if(al.peekLast()== -cur){
                    al.removeLast();
                    isDestroyed=true;
                    break;
                }
                else{
                    isDestroyed=true;
                    break;
                }
            }
            if(isDestroyed!=true){
                al.addLast(cur);
            }
        }
        return al.stream().mapToInt(Integer :: intValue).toArray();
    }
}