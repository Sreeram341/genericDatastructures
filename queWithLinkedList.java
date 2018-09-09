
public class queWithLinkedList {

	@SuppressWarnings("rawtypes")
	linkNode head;
	@SuppressWarnings("rawtypes")
	linkNode tail;
	
	@SuppressWarnings("unchecked")
	public void enque(@SuppressWarnings("rawtypes") linkNode elem) {
		
		if (head==null) {head=elem;tail=elem;}
		else if (head.nxtrprev == null) {
			head.nxtrprev=elem;
			tail = elem;
			}
		else {
			@SuppressWarnings("rawtypes")
			linkNode temp;			
			temp = tail;
			tail =elem;
			temp.nxtrprev=tail;
		}
	}

	public void deQue() {
		if (head == null && tail ==null) {
			System.out.println("No more elemts in queue to remove");
		}
		else {
			if(head == tail) {
				head = null; tail =null;  // last element in queue ....
			}
			else {
				@SuppressWarnings("rawtypes")
				linkNode temp;				
				temp = head.nxtrprev;	// if elements are still available to remove...
				head = temp;
			}
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		linkNode ln = new linkNode(10);
		linkNode ln1 = new linkNode(20);
		linkNode ln2 = new linkNode(30);
		linkNode ln3 = new linkNode(40);
		
		queWithLinkedList qwl = new queWithLinkedList();
		
		qwl.enque(ln);
		qwl.enque(ln1);		
		qwl.enque(ln2);
		qwl.enque(ln3);
		qwl.deQue();
		
		qwl.deQue();
		qwl.deQue();
		System.out.println(qwl.head);
	}

}
