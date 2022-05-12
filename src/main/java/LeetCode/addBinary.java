package LeetCode;


public class addBinary {

    public static String addBinarys(String a, String b) {
        if (a == null && b == null) return "";
        int num1 = a.length() - 1;
        int num2 = b.length() - 1;
        StringBuilder build = new StringBuilder();
        int cry = 0;
        while (num1 >= 0 || num2 >= 0)
        {
            int ans=cry;
            if (num1>=0)
            {
                ans+=a.charAt(num1)-'0';
                num1--;
            }
            if (num2>=0)
            {
                ans+=b.charAt(num2)-'0';
                num2--;
            }
            cry= ans >> 1;
            ans=ans & 1;

            build.append(ans==0 ? '0':'1');

        }
        if (cry>0)
        {
            build.append('1');
        }
        return build.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(addBinarys("11","1"));
    }
}
