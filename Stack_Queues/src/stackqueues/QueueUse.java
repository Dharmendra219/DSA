package stackqueues;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		
		for(int i = 0; i < 5; i++) {
			queue.enqueue(i);
		}
       while(!queue.isEmpty()) {
    	   try {
    	   queue.dequeue();
    	   }
    	   catch(Exception e) {
    		   
    	   }
       }
	}

}
