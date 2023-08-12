package classes_and_objects;

public class ComplexNumber {

	private int real;
	private int imaginary;
	
	public  ComplexNumber(int x, int y) {
		real = x;
		imaginary = y;
	}
	
	public int getReal() {
		return real;
	}
	
	public int getImaginary() {
		return imaginary;
	}
	
	public void setReal(int x) {
		real = x;
	}
	
	public void setImaginary(int y) {
	    imaginary = y;
	}
	
	public void add(ComplexNumber c2) {
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
	}
	
	public void multiply(ComplexNumber c2) {
		int temp = this.real;
		this.real = this.real*c2.real - this.imaginary*c2.imaginary;
		this.imaginary = (temp*c2.imaginary) + (this.imaginary*c2.real);
		
	}
	public void print() {
		if(imaginary>=0) {
		   System.out.println("Complex Number: "+real+" "+"+"+" "+imaginary+"i");
	    }else {
	    	System.out.println("Com;lex Number: "+real+" "+"-"+" "+Math.abs(imaginary)+"i");
	    }
	}
	
	public static  ComplexNumber add(ComplexNumber c1, ComplexNumber c3) {
		int newReal = c1.real+c3.real;
		int newImaginary = c1.imaginary+c3.imaginary;
		ComplexNumber c4 = new ComplexNumber(newReal, newImaginary);
		return c4;
	}

}
