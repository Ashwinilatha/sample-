class Split
{
public static void main(String[] args)
{
String text="java is a fun programming language";

//split String form space
 
String[] a=text.split(" ");
for(String x:a)
{
System.out.println(x);
}
}
}