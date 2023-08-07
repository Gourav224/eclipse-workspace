
public class TreeDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree s=new CreateTree();
		TreeNode root=null;
		int[] a= {7,8,5,6,9,4,1,2};
		for(int i=0;i<8;i++) {
			root=s.createBst(root,a[ i]);
		}
		System.out.println(root.data);
		s.inorder(root);
		System.out.println(s.hot(root));
		

	}

}
class TreeNode{
	int data;
	TreeNode left,right;
	TreeNode(){}
	TreeNode(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
class CreateTree{
	TreeNode createBst(TreeNode root,int data){
		if(root==null) {
			root=new TreeNode(data);
			return root;
		}
		else if(root.data>data) {
			root.left=createBst(root.left, data);
		}
		else {
			root.right=createBst(root.right, data);
		}
		return root;
	}
	void inorder(TreeNode root) {
		if(root==null) {
			return ;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	int hot(TreeNode root) {
		if(root==null) {
			return 0;
		}
		return Math.max(hot(root.right),hot(root.left))+1;
	}
}