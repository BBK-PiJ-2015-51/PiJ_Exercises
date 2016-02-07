public class IntegerTreeNode {

int value;
IntegerTreeNode left;
IntegerTreeNode right;

public IntegerTreeNode(int i) {
	value = i;
	left = null;
	right = null;
}


public void add(int i) {
	if (i > this.value) {
		if (right == null) {
			right = new IntegerTreeNode(i);
		} else {
			right.add(i);
		}
	} else {
		if (left == null) {
			left = new IntegerTreeNode(i);
		} else {
			left.add(i);
		}
	}
}

public boolean contains(int i) {

	if (i == value) {
		return true;
	} else if (i > value) {
		if (right == null) {
			return false;
		} else {
			return right.contains(i);
		}	
	} else {
		if (left == null) {
			return false;
		} else {
			return left.contains(i);
		}
	}
}

public int getMax() {
	if (right == null) {
		return value;
	} else {
		return right.getMax();
	}
}

public int getMin() {
	if (left == null) {
		return value;
	} else {
		return left.getMin();
	}
}


public void toString(IntegerTreeNode r) {
  		if (r == null) {
    		return;
  		} 
  	System.out.print(r.value + ",");
	toString(r.left);
	toString(r.right);
}

public int depth(IntegerTreeNode n, int i) {

    int leftDepth = i;
    int rightDepth = i;
     
    if(n.left != null){
        leftDepth = depth(n.left, i+1);
    }
    if(n.right != null){
        rightDepth = depth(n.right, i+1);
    }
     
    return leftDepth > rightDepth ? leftDepth : rightDepth;
}

}





