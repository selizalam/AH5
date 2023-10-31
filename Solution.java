import java.util.*;
class Solution {
    public static char mostFrequentChar(String s) {
      HashMap<Character, Integer> mp = new HashMap<>();
      int len = s.length();
      char ans = 0;
      int count = 0;

      for(int i = 0; i < len; i++){
        char c = s.charAt(i);
        mp.put(c, mp.getOrDefault(c, 0) + 1);
        if(count < mp.get(c)){
          ans = c;
          count = mp.get(c);
        }
      }
      // Solution word = new Solution();
      // char c;
      // for(int i = 0; i < s.length(); i++){
      //   if()
      // }
      return ans;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("mississippi"));
    }

  }
