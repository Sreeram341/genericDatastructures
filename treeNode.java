
public class treeNode <t> {

	public t ref;
	public treeNode<?> left;
	public treeNode<?> right;
	
	
	public treeNode(t ref) {
		this.ref = ref;
		this.right = null;
		this.left = null;
	}
	
	@Override
	public String toString() {
		return  this.ref.toString();
	}

}
