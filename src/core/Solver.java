package core;

public class Solver {
	public double posMethod(int a, int b, int c) {
		
		int minusB=-(b);
		
		double sqrB=Math.pow(b, 2);
		int ac4=4*(a*c);
		double preSq=sqrB-ac4;
		double sqrt=Math.sqrt(preSq);
		double a2=2*a;
		double res=(minusB+sqrt)/a2;
		
		return res;
	}
	
	public double negMethod(int a, int b, int c) {
		int minusB=-(b);
		
		double sqrB=Math.pow(b, 2);
		int ac4=4*(a*c);
		double preSq=sqrB-ac4;
		double sqrt=Math.sqrt(preSq);
		double a2=2*a;
		double res=(minusB-sqrt)/a2;
		
		return res;
	}
}
