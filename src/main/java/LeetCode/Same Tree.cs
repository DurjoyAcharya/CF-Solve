using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practice
{
    public class TreeNode
    {
      public int val;
      public TreeNode left;
      public TreeNode right;
      public TreeNode(int val = 0, TreeNode left = null, TreeNode right = null)
        {
            this.val = val;
            this.left = left;
            this.right = right;
          }
        }    
    internal class Grey_Code
    {
        public bool IsSameTree(TreeNode node,TreeNode node2)
        {
            if(node==null || node2==null )
                return node==node2;  
            if(node.val!=node2.val)
                return false;
            return IsSameTree(node.left,node2.left) && IsSameTree(node.right,node2.right);
        }
        static void Main(string[] args)
        {
            var node=new TreeNode(10,new TreeNode(20,null,null),new TreeNode(30,null,null));
            var node2 = new TreeNode(10, new TreeNode(20, null, null), new TreeNode(30, null, null));
            Console.WriteLine(new Grey_Code().IsSameTree(node, node2));

        }
    }
}
