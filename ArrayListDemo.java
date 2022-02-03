import java.util.ArrayList;
import java.util.List;


public class ArrayListDemo
{

public static void main(String []args)
{
	ArrayList	al = new ArrayList();
	al.add(10);
	al.add(50);
    al.add(61);
    al.add(6);
	
	//string
	al.add("krishna");
	
	//character
	al.add('b');
	
	//boolean
	al.add(true);
	
	//using index
	//al.add(5,"vishnu");
	
	 //using add method : num add or not checking boolean return type. 
	//System.out.println(al.add(70));
	//System.out.println(al.size());
	
	/* System.out.println(al);
	
	System.out.println(al.contains("krishna"));
		//System.out.println(al.contains("nivetha"));
		
	//position of elememnts
	System.out.println(al.get(2));
	System.out.println(al.get(0));
	
	//position of removing element 
	System.out.println(al.remove(5));
	System.out.println(al);
	//using set
	al.set(4," janani");
	System.out.println(al);
	
	// element position indexOf
	System.out.println(al.indexOf(true)); */
	
	System.out.println( al);
	
	
	ArrayList al2=new ArrayList();
	al2.addAll(al);
	System.out.println("al2 list is"+ al2);
	
	ArrayList al3=new ArrayList();
	al3.add("software");
	al3.add("IT");
	al3.add("IIT");
	al3.add("engineering");
	al3.add("IT");
	
	System.out.println(al3.indexOf("IT"));
	System.out.println(al3.lastI=ndexOf("IT"));
	System.out.println("al3 list is"+ al3);
	
	al3.addAll(2,al);//using addAll method
	System.out.println("al3 afteraddition is"+ al3);
	al3.removeAll(al);// using removeAll method
	System.out.println( "al3 After removeAll()is"+ al3);
	
	List al4 = al3.subList(1,3);//using subList 
    System.out.println("al4 list is"+ al4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

	


 

  
