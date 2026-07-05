class Solution {
    List<String> ans;
    String[] phone = {"","","abc", "def", "ghi",
                            "jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        rec(digits,0,sb);
        return ans;
    }
    public void rec(String digits,int index,StringBuilder sb){
        if(index==digits.length()){
            ans.add(sb.toString());
            return;
        }
        int x=digits.charAt(index);
        String word=phone[x-'0'];
        for(int i=0;i<word.length();i++){
            sb.append(word.charAt(i));
            rec(digits,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}