using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//https://leetcode.com/problems/longest-common-prefix/submissions/
namespace Practice
{

    internal class LongestCommonPrefix
    {
        public string LongestCommonPrefixs(string[] strs)
        {
            var a = strs.Length;
            if (a == 0)
                return null;
            if(a==1)
                return strs[0];
            Array.Sort(strs);
            var end = Math.Min(strs[0].Length, strs[a-1].Length);
            var i = 0;
            while (i < end && strs[0][i] == strs[a - 1][i])
                i++;
            string pre=strs[0].Substring(0,i);
            return pre; ;
        }
    }
}
