package houseconstruction;

public class Generatecost {
	public double Cost(String name,double Sqrfoot)
	{
		GetPlanFactory planFactory = new GetPlanFactory();
		Plan p = planFactory.getPlan(name);  
		p.getRate();
		double d=p.calculateBill(Sqrfoot);
		return d;
	}


}
