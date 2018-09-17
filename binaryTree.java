
public class binaryTree {
	
	@SuppressWarnings("rawtypes")
	treeNode Head =null;

	public binaryTree() {
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public void addNode(treeNode curr) {
		
		if (Head==null ||(Head.right == null) || (Head.left == null)) 
		{
			String header = "Y";
			if (Head==null)Head =curr;
			else if((Head.right == null) && (Head.left == null)) {
				if(((Integer)curr.ref>(Integer)Head.ref) ) {
					System.out.println("Head right fixed");
					Head.right=curr;
				}
				else {Head.left=curr;}
			}
			else {
				if (Head.right==null)fixTree(Head, Head.left, curr,header);
				fixTree(Head, Head.right, curr,header);
			}
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" } )
	public void fixTree(treeNode head,treeNode riteleft, treeNode currVal,String header) {
		treeNode temp;
		
		if ( ( (Integer) head.ref < (Integer) currVal.ref) && (head.right != null)  ) { // Condition 1
			
			if( ((Integer)currVal.ref < (Integer)head.right.ref) ) { // Sub condition
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
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" } )
	public void fixNode(treeNode riteleft, treeNode currVal) {
			if ((Integer)riteleft.ref<(Integer)currVal.ref) {
				if(riteleft.right == null) {	riteleft.right = currVal;}			
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
