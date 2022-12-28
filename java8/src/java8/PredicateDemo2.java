package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=(t)->
		{
			
			if(t%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		};
		System.out.println(p.test(11));
		
		List<Integer> list=Arrays.asList(12,32,12,34,56,34);
		Predicate<Integer> p1=(x)->x>20;
		Predicate<Integer> p2=(x)->x<50;
		Predicate<String>  p3=Predicate.isEqual("neha");
		list.stream().filter(p1. and( p2)).collect(Collectors.toList()).forEach(System.out::println);
		list.stream().filter(p1. or( p2)).collect(Collectors.toList()).forEach(System.out::println);
	    System.out.println(p3.test("neha"));
	}
	

}
