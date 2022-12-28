package java8;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer>
{
    //int i=0;
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		if(t%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Predicate<Integer> p=new PredicateDemo();
		System.out.println(p.test(29));
	}
	

}
