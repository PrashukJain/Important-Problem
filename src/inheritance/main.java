package inheritance;
class teacher{
	String  name;
	int age;
	int d=10;
	int d1=100;
	public void fun() {
		System.out.println(" fun with teacher");
	}
}
 class student extends teacher {
int marks;
int d=20;
int d2=200;
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("fun with student");
	}
}
public class main{
	public static void main(String args[]) {
//		Case 1
		teacher obj=new teacher();
		obj.fun();
//		Case 2
		teacher obj2=new student();
		obj2.fun();
		System.out.println(obj2.d);//10
		System.out.println(((student)obj2).d);
		((teacher) obj2).fun();
//	case3 
		student obj3=new student();
		obj3.fun();
		System.out.println(obj3.d);
		
	}
}
