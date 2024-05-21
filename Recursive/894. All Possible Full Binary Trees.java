import java.util.ArrayList;
import java.util.List;
import java.util.List;
/*

解題的基本思路：
********************************
*如果 n 為偶數，則無法構造滿足條件的滿二叉樹，直接返回空列表。
如果 n 為 1，則構造只有一個節點的滿二叉樹，根節點的值為 0。
對於節點數為 n，我們遍歷所有可能的左子樹和右子樹的節點數，其中左子樹的節點數為 i，右子樹的節點數為 n - 1 - i（減去根節點的一個節點）。
對於每一種分配的節點數，我們遞迴地生成左子樹和右子樹，並將它們與根節點組合成新的滿二叉樹。
將生成的所有滿二叉樹添加到結果列表中。

*/ 
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<TreeNode> result = solution.allPossibleFBT(5);

        System.out.println("所有可能的滿二叉樹：");
        for (TreeNode root : result) {
            printTree(root, 0);
            System.out.println();
        }
    }

    // 輔助方法：以遞迴方式打印樹的結構
    private static void printTree(TreeNode root, int level) {
        if (root == null) return;
        printTree(root.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }
        System.out.println(root.val);
        printTree(root.left, level + 1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> result = new ArrayList<>();
        // 如果節點數為偶數，無法構造滿足條件的滿二叉樹，直接返回空列表
        if (n % 2 == 0) {
            return result;
        }
        // 如果節點數為 1，構造只有一個節點的滿二叉樹
        if (n == 1) {
            result.add(new TreeNode(0));
            return result;
        }
        // 遍歷所有可能的左子樹和右子樹的節點數
        for (int i = 1; i < n; i += 2) {
            // 遞迴生成左子樹和右子樹
            List<TreeNode> leftTrees = allPossibleFBT(i);
            List<TreeNode> rightTrees = allPossibleFBT(n - 1 - i);
            // 將左子樹和右子樹組合成新的滿二叉樹
            for (TreeNode leftTree : leftTrees) {
                for (TreeNode rightTree : rightTrees) {
                    TreeNode root = new TreeNode(0);
                    root.left = leftTree;
                    root.right = rightTree;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
