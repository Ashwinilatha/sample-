class Function
{
public static void main(String []args)	
{
	
Std2 s1=new Std2(101);
Std2 s2=new Std2(102);




s1.setData("deepika",23,657847684l);
s2.setData("deepak",21);

s1.display();
s2.display();

int a=s1.add(6,9);
int b=s2.add(8,7);
s1.add(a,b);

}
}