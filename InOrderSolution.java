/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
    Integer lastLeftValue = null;
    Integer lastRightValue = null;
    ArrayList<Integer> results = new ArrayList<Integer>();
      

    boolean checkBST(Node root) {
        
        traverseInOrder(root);
        
        Integer previousVal = Integer.MIN_VALUE;
        
        //traverse through tree in order, must be in order from smallest to largest
        for(Integer val : results){
            if(val > previousVal){
                previousVal = val;
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }

    void traverseInOrder(Node root){
        //in order DFS
        if(root == null){
            return;
        }
        
        traverseInOrder(root.left);
        results.add(root.data);
        traverseInOrder(root.right);
    
    }

