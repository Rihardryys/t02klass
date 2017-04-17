public class Kuup{
	double a, b;
		
	public Kuup(double küljepikkus, double korgus){
		
		if(küljepikkus<=0){throw new RuntimeException("Sobimatu küljepikkus");}
		if(korgus <=0){throw new RuntimeException("Sobimatu korgus");}
		
		a=küljepikkus;
		b=korgus;
		
	}
	
	public double pindala(){
		
		return a*a;
		
	}
	
	public double ruumala(){
		
		return (a*a)*b;
		
	}
	
	public String toString(){
		return "Põhja pindala on "+
		       pindala()+"m2 ja ruumala "+ruumala()+" m3.";
	}
	
	
}
