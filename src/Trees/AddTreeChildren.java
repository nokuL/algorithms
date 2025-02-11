/*
package Trees;

import Trees.TreeNode;

public class AddTreeChildren<T> {

    public TreeNode<T> addFirstLevelChildren(TreeNode<T> treeNode, T[] items) {
        for (T item : items) {
            treeNode.addChild(item);
        }
        return treeNode;
    }

    public TreeNode<T> addSecondLevelChildren(TreeNode<T> treeNode, T[][] items, T parentData) {
        for (T[] level2Items : items) {
            TreeNode<T> childNode = new TreeNode<>(parentData); // Create a new child node
            for (T item : level2Items) {
                childNode.addChild(item);
            }
            treeNode.addChild(childNode);
        }
        return treeNode;
    }

    public TreeNode<T> addThirdLevelChildren(TreeNode<T> treeNode, T[][][] items, T firstParentData, T secondParentData) {
        for (T[][] level3Items : items) {
            TreeNode<T> childNode = new TreeNode<>(firstParentData); // Create a new child node for second level
            for (T[] level2Items : level3Items) {
                TreeNode<T> grandChildNode = new TreeNode<>(secondParentData); // Create a new child node for third level
                for (T item : level2Items) {
                    grandChildNode.addChild(item);
                }
                childNode.addChild(grandChildNode);
            }
            treeNode.addChild(childNode);
        }
        return treeNode;
    }
}*/
