class Main {
  public static void main(String[] args) {
    System.out.println(countAndSay(10));
  }

    public static String countAndSay(int n) {
      if (n <= 1) {
          return String.valueOf(n);
      }
      String ans = "1";
      
      for (int i = 1; i < n; ++i) {
              ans = count(ans);
          }

      return ans;
  }
  
  
  private static String count(String s) {
      StringBuilder sb = new StringBuilder();
      int count = 1;
      char ch = s.charAt(0);
      
      for (int i = 1; i < s.length(); ++i) {
          if (s.charAt(i) == ch) {
              count++;
          } else {
              sb.append(count);
              sb.append(ch);
              ch = s.charAt(i);
              count = 1;
          }
      }
      sb.append(count);
      sb.append(ch);
      
      return sb.toString();
  }
}