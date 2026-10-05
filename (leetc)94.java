class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        inorder(root, ans);

        return ans;
    }

    public void inorder(TreeNode root, List<Integer> ans) {

        if (root == null) {
            return;
        }

        // Left
        inorder(root.left, ans);

        // Root
        ans.add(root.val);

        // Right
        inorder(root.right, ans);
    }
}
