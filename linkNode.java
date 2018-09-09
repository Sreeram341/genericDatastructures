
public class linkNode <T> { 
	
	public T ref;
	public linkNode<?> nxtrprev;

	public linkNode(T ref) { // to make constructor to work with same type of data type to be passed with class created type..
		
		this.ref =ref;
		this.nxtrprev =null;
	}
	
	@Override 
	public String toString() {
		return ref.toString();
	}
}
