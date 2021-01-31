class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> stack = new Stack<Node>();
        stack.add(root);
        while (! stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            for (Node n : root.children) {
                stack.add(n);
            }
        }
        Collections.reverse(list);
        return list;
    }
}