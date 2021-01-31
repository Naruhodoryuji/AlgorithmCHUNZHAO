class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> stack = new Stack<Node>();
        stack.add(root);
        while (! stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--) 
                stack.add(root.children.get(i));
        }
        return list;
    }
}