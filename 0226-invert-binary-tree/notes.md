# Solution 1: Recursion
To invert the tree, means we need to invert the left and right subtree of each node in the tree. For each left and right subnode, they themselves need to be inverted as well. Therefore, the most intuitive approach is to use **recursion**.

Considering the **three essential components** of recursion:
1. **Base case** *(the condition under which the recursion stops)*, or the case when the recursion ends: if the node is null, then we should return null.
2. **Recursive case** *(how the problem is broken down into smaller subproblems)*, or what exactly happens in each single node: the left and right subtree should be inverted. So we can use the simplest way, introducing a temp node.
3. **Progress Toward the Base Case** *(how to call the recursion)*, or what should be returned after recursion: the root should be maintained and returned at the end of the recursion.

# Solution 2: BFS
Every recursion problem can be also solved by using stack or queue to iteration.

The advantage of this solution is that nodes and be processed layer by layer, and **each node in each layer can be manually stopped, making it more convinient for debugging in acutal production and preventing stack overflow issues**.

In this problem, since the number of nodes is limited to 100, stack overflow issues generally don't occur, so it's okay to use recursion.

However, if the number of nodes is larger, it's better to use an explicit stack or queue for node iteration.


```java
public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()) {
        TreeNode node = queue.poll();

        // invert left and right subtree
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
    }
    return root;
}
```
We can use a queue to store the nodes that waits to be processed.

Start from the root node, each node is popped out to invert its subnodes, each subnode is added to the queue and waits to be processed. Iterates this process until there is no node in the queue.