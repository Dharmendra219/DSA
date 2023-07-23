package stackqueues;

class QNode<T>{
	T data;
	QNode<T> next;
	QNode(T data){
		this.data = data;
		next = null;
	}
}

public class QueueUsingLL<T> {
    private QNode<T> front;
    private QNode<T> rear;
    int size;
    public QueueUsingLL() {
    	front = null;
    	rear = null;
    	size = 0;
    }
    
    int size() {
    	return size; 
    }
    
    boolean isEmpty() {
    	return size==0;
    }
    
    T front() throws QueueEmptyException{
    	if(size == 0)throw new QueueEmptyException();
    	return front.data;	
    }
    
    T rear() throws QueueEmptyException {
    	if(size == 0) throw new QueueEmptyException();
    	return rear.data;
    }
    void enqueue(T element) {
    	QNode<T> newNode = new QNode<T>(element);
    	if(rear == null) {
    		front = newNode;
    		rear = newNode;
    	}
    	else {
    		rear.next = newNode;
    		rear = newNode;
    	}
    	size++;
    }
    
    T dequeue() throws QueueEmptyException {
    	
    	if(size == 0) {
    		throw new QueueEmptyException();
    	}
    	T temp = front.data;
    	front = front.next;
    	if(size == 1) {
    		rear = null;
    	}
        size--;
    	return temp;
    }
}
