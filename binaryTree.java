
public class binaryTree {
	
	@SuppressWarnings("rawtypes")
	treeNode Head =null;

	public binaryTree() {
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes"})
	public void addNode(treeNode curr) {
		
		if (Head==null ||(Head.right == null) || (Head.left == null)) 
		{
			String header = "Y";
			if (Head==null)Head =curr;
			else fixTree(Head, curr,header);
		}
		else {
			 
			if(((Integer)curr.ref>(Integer)Head.ref)) {
				treeNode rite = Head.right;
				fixNode(rite, curr);
			}
			else if (((Integer)curr.ref<(Integer)Head.ref) ) {
				Head.left=curr;
			}
			else {
				treeNode left = Head.left;
				fixNode(left, curr);
			}
			
		}
		
	}
	// Main Core logic to maintain tree always full and filled
	@SuppressWarnings({ "rawtypes", "unchecked" } )
	public void fixTree(treeNode head,treeNode currVal,String header) {  
		treeNode temp;
		
		if ( ( (Integer) head.ref < (Integer) currVal.ref) && (head.right != null)  ) { // Condition 1
			
			if( ((Integer)currVal.ref > (Integer)head.right.ref) ) { // Sub condition
				temp = head;
				head = head.right;
				head.right = currVal;
				head.left =temp;
				if(header.equals("Y")) Head=head;
			}
			else {
				temp = head;
				head = currVal;
				head.right = temp.right;
				head.left = temp;
				if(header.equals("Y")) Head=head;
			}
		}
		// Condition 2
		else if( ( (Integer)currVal.ref < (Integer) head.ref) && (head.right==null) && ((Integer)currVal.ref) > (Integer)head.left.ref ) {
			
			temp = head;
			head = currVal;
			head.left = temp.left;
			head.right = temp;
			if(header.equals("Y")) Head=head;
		}
		// Condition 3
		else if( ( (Integer)currVal.ref > (Integer) head.ref) && (head.left==null) && ((Integer)currVal.ref) < (Integer)head.right.ref ) {
			
			temp = head;
			head = currVal;
			head.left = temp.left;
			head.right = temp;
			if(header.equals("Y")) Head=head;
		}
		// Condition 4
		else if ( ( (Integer) head.ref > (Integer) currVal.ref) && (head.left != null)  ) { // Condition 4
			
			if((Integer) currVal.ref < (Integer) head.left.ref) {
				temp = head;
				head = temp.left;
				head.left = currVal;
				head.right =temp;
				if(header.equals("Y")) Head=head;
			}
			else {
				
				temp = head;
				head = currVal;
				head.left = temp.left;
				head.right = temp;
				if(header.equals("Y")) Head=head;
			}
			
		}
		// Condition 5
		
		else if( ((Integer)head.ref<(Integer)currVal.ref) && (head.right == null) ) {
			head.right = currVal;
		}
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" } )
	public void fixNode(treeNode riteleft, treeNode currVal) {
		String header = "N";
			if ((Integer)riteleft.ref<(Integer)currVal.ref) {
				if(riteleft.right == null) {	fixTree(riteleft,currVal,header);}			
				else { fixNode(riteleft.right,currVal);}
			}
			else {
				if(riteleft.left == null) {riteleft.left = currVal;}
				else { fixNode(riteleft.left,currVal);}
			}
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		
		binaryTree bt = new binaryTree();
		
		treeNode elem1 = new treeNode<Integer>(8);
		treeNode elem2 = new treeNode<Integer>(10);
		treeNode elem3 = new treeNode<Integer>(35);
		treeNode elem4 = new treeNode<Integer>(40);
		
		treeNode elem6 = new treeNode<Integer>(19);
		treeNode elem5 = new treeNode<Integer>(22);
		
		treeNode elem7 = new treeNode<Integer>(11);
		
		treeNode elem8 = new treeNode<Integer>(7);
		treeNode elem9 = new treeNode<Integer>(5);
		treeNode elem10 = new treeNode<Integer>(4);
		
		//System.out.println(elem1);
		
		bt.addNode(elem1);
		bt.addNode(elem2);
		bt.addNode(elem3);
		bt.addNode(elem4);
		bt.addNode(elem5);
	}
}
