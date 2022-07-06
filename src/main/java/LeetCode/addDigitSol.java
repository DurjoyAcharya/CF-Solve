package LeetCode;
//https://leetcode.com/problems/add-digits
public class addDigitSol {
//    public static int addDigits(int num) {
//      int ans=0;
//      int ans_2=0;
//      int ans_3=0;
//      while (num!=0)
//      {
//          int remainder=num%10;
//          num/=10;
//          ans+=remainder;
//      }
//
//      if (ans>=10)
//      {
//          while (ans!=0)
//          {
//              int remainder=ans%10;
//              ans/=10;
//              ans_2+=remainder;
//          }
//          if(ans_2>=10)
//          {
//              while (ans_2!=0)
//              {
//                  int rem=ans_2%10;
//                  ans_2/=10;
//                  ans_3+=rem;
//              }
//              return ans_3;
//          }
//
//        return ans_2;
//      }
//        return ans;
//    }
    public static int addDigits(int num)
    {
        int tmp = 0;
        while(num > 9){
            while(num > 9){
                tmp += num%10;
                num /= 10;
            }
            num += tmp;
            tmp = 0;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(addDigits(195));
    }
}
