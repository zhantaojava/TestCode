package suanfa;

public  class  TreeNode  
{  
    TreeNode left;  
    TreeNode right;  
    int val;  
    TreeNode(int val){  
        this.val=val;  
    }  
    //返回二叉树的深度  
    static int getDepth(TreeNode root){  
        if(root==null){  
            return 0;  
        }  
        int left=getDepth(root.left);  
        int right=getDepth(root.right);  
        
        if(left>right){
        	return left+1;
        }
        else return right+1;
    }  
  
    static void scanNodes(TreeNode root){  
        if(root==null){  
            return;  
        }  
        //System.out.println(root.val); //先序遍历  
        scanNodes(root.left);  
        //System.out.println(root.val); //中序遍历  
        scanNodes(root.right);  
        System.out.println(root.val); //后序遍历  
    }  
  
    public static void main(String[] args)   
    {  
        TreeNode root=new TreeNode(1);  
        TreeNode left1=new TreeNode(2);  
        TreeNode left2=new TreeNode(3);  
        TreeNode right1=new TreeNode(4);  
        //创建一棵树  
        root.left=left1;  
        left1.right=left2;  
        root.right=right1;  
        scanNodes(root);  
        System.out.println("树的深度是："+getDepth(root));  
          
    }  
}  