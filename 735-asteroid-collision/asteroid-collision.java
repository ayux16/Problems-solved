class Solution {
    public int[] asteroidCollision(int[] ast) {
        Deque<Integer> dq=new ArrayDeque<>();
        for(int cur: ast){
                boolean dead=false;
                while(!dq.isEmpty() && dq.peekLast()>0 && cur<0){
                    if(dq.peekLast()< -cur){
                        dq.removeLast();
                    }
                    else if(dq.peekLast()== -cur){
                        dq.removeLast();
                        dead=true;
                        break;
                    }
                    else{
                        dead=true;
                        break;
                    }
                }
               if(dead!=true){
                dq.addLast(cur);
               }
        }
        return dq.stream().mapToInt(Integer :: intValue).toArray();
    }    
}
/*

*/