package stackqueues;

public class StackUseLL {

   public static void main(String[] args) throws StackFullException, StackEmptyException {
			
			StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
			for(int i = 1; i <= 20; i++) {
				stack.push(i);
			}
			
			while(!stack.isEmpty()) {
				try {
				  System.out.println(stack.pop());	
				}
				catch(StackEmptyException e){
					System.out.print("Stack is Empty");
				}
		
			}
		}
}
