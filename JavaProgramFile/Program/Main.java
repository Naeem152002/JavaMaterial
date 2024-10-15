// Swapping object references

import java.io.*;
class Demo {

	// Swapping Method
	int Swap(Demo A, Demo B)
	{
		Demo temp = A;
		A = B;
		B = temp;
		return 0;
	}
}
class Main {
	public static void main(String[] args)
	{
		Demo C = new Demo();

		Demo D = new Demo();

		// Passing C and reference variables
		// to Swap method
		C.Swap(C, D);
	}
}
