package stackqueues;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub

		StackUsingArray stack = new StackUsingArray();
		for(int i = 1; i <= 20; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			try {
			  System.out.println(stack.pop());	
			}
			catch(StackEmptyException e){
				
			}
	
		}
	}
}
