package Study;


class AbEngineer extends AbShain{
		public void work(){
			System.out.println(name + "プログラム作ります！");
		}
}
class AbSales extends AbShain{
	public void work(){
		System.out.println(name + "仕事とってきま！");
	}
}
abstract class AbShain{
	String name;
	abstract void work();
}

public class Java_Study_Polymorphism_with_Interface {
		public static void main(String[] args){
			AbShain shain1 = new AbSales();
			shain1.name ="田中";
			shain1.work();
			
			AbShain shain2 = new AbEngineer();
			shain2.name ="吉田";
			shain2.work();
		}
}
/*
 * 田中仕事とってきま！
 *吉田プログラム作ります！
 * 
 */ 
