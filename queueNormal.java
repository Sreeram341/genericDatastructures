
public class queueNormal {

	int[] que;
	int head = -1;
	int tail = -1;
	int qsiz = -1;
	
	public queueNormal(int size) {
		que = new int[size];
		for (int i=0;i<size;i++)que[i]=-1;
		if (size >0) {head = 0;tail =0; qsiz=size;}
	}
	
	public void enqueue(int elem) {
		
		if(tail==qsiz) System.out.println("No more elements can be filled into Queue");
		else{
			
			que[tail]=elem;
			tail++;
		}
	}
	
	public void deque() {
		
		if (tail == head && que[tail]==-1 && que[head] ==-1)System.out.println("No more elements present in queue");
		else {
			// Check if there is no more number in queue and do not adjust the array
			// make the tail and head point starting
			if(que[head +1] ==-1){
				que[head] =-1;
				tail=head;
			}
			else{
			// if there are more elements in queue adjust head, resize the variables in Que..	
			// adjust tail 
				adjustQue(head+1);
				tail--;
			}
		}
	}
	
	private void printQue() {
		for(int i=0;i<tail;i++) {System.out.println(que[i]);}
	}
	
	private void adjustQue(int strt) {
		
		int tmpSiz = que.length;
		int [] tmpArr = new int[tmpSiz];
		
		for(int i=0;i<tmpSiz;i++) {
			if(strt+i < tmpSiz)tmpArr[i] = que[strt+i];
		}
		que = tmpArr;
	}
	
	public void getFront() {System.out.println("Head of the queue is "+que[head]);}

	public static void main(String args[]) {
		queueNormal qN = new queueNormal(5);
		
		qN.enqueue(10);
		qN.enqueue(20);
		qN.enqueue(30);
		qN.getFront();
		System.out.println("After deque");
		qN.deque();
		qN.printQue();
		
		System.out.println("=========");
		qN.getFront();
		System.out.println("After deque");
		qN.deque();
		qN.printQue();
		
		System.out.println("=========");
		qN.getFront();	
		System.out.println("After deque");
		qN.deque();
		qN.printQue();		
		
		System.out.println("=========");
		System.out.println("Again trying to deque");
		qN.deque();
	}
}
