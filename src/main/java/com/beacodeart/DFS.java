package com.beacodeart;

public class DFS {
    
    public static boolean depthFirstSearch(TreeNode node, int value){
        
        if (node.value==value){
            return true;
        }
        
        if (node.left == null && node.right == null){
            return false;
        }
        
        if (node.left != null){
            if (node.right != null){
                return depthFirstSearch(node.left, value) || depthFirstSearch(node.right, value);
            } else return depthFirstSearch(node.left, value);
            
        }
        
        if (node.right!=null){
            return depthFirstSearch(node.right, value);
        }
        
        return false;
    }

}
