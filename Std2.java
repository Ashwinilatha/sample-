class Std2
{



String name;
int age;
long phn;
int Sid;
                                                                                                                                                                                            Std2(int s)
{
	this.Sid=s;
}

void display()
{
	System.out.println(this.name);
	System.out.println(this.age);
   System.out.println(this.phn);
   System.out.println(this.Sid);
}
void setData( String n,int a,long phn)
{
	this.name=n;
	this.age=a;
	this.phn=phn;
}
void setData( String n,int a)
{
	this.name=n;
	this.age=a;
}
	


int add(int i,int j)
{
int k=i+j;
System.out.println("this output is" + k);
return k;
}
}	



