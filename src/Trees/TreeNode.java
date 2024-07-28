package Trees;

import java.util.Arrays;


public class TreeNode <T>{

    private T data;
    private TreeNode[] children = new TreeNode<>[0];

    public TreeNode(T data, TreeNode<T>[] children){
        this.data = data;
        this.children = children;

    }

    public  TreeNode(T data){
        this.data = data;
        this.children = new TreeNode[0];
            }



    public TreeNode<T> addChild(T data){
        TreeNode<T>treeNode = new TreeNode<>(data);
        int length = this.children.length;
        if(length > 0){
            this.children[length -1] = treeNode;

        }else{
            this.children[0] = treeNode;
        }
        return treeNode;

    }


    public void removeTreeNodeChild(TreeNode<T> treeNodeChild){
        int initialChildrenLength = treeNodeChild.children.length;
        this.children = Arrays.stream(this.children).filter((child)-> child.data.equals(treeNodeChild.data))
                .toArray(TreeNode[]::new);

        if(initialChildrenLength ==this.children.length){
            Arrays.stream(this.children).forEach(child-> removeTreeNodeChild(treeNodeChild));
        }

    }

    public void print() {
        print(0);
    }

    public void print(int level){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0; i< level; i++){
            stringBuilder.append("--");

        }
        System.out.println(stringBuilder.toString() + this.data);
        Arrays.stream(this.children).forEach(child -> child.print(level + 1));
    }

}
