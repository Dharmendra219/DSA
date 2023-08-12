package classes_and_objects;

public class ComplexUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComplexNumber c1 = new ComplexNumber(2, 3);
		c1.print();
		
		c1.setReal(5);
		int r = c1.getReal();
		System.out.println("real part: "+r);
		
		c1.print();
		
		c1.setImaginary(4);
		int img = c1.getImaginary();
		System.out.println("Imaginary part: "+img);
		
		c1.print();
		
		ComplexNumber c2 = new ComplexNumber(7, 8);
		c1.add(c2);
		c1.print();
		c2.print();
		
		ComplexNumber c3 = new ComplexNumber(4, 6);
		c3.multiply(c2);
		c3.print();
		c2.print();
		
	    ComplexNumber c4 = ComplexNumber.add(c1, c3);
		c4.print();
		c1.print();
		c2.print();
		

	}

}
