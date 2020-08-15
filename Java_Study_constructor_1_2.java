package Study;

public class Java_Study_constructor_1_2 {
	public static void main(String[] args){
		Java_Study_constructor_1 p = new Java_Study_constructor_1();
		
		System.out.println("引数(String,int)");
		p.show("ニーハオ",1);
		
		System.out.println("引数(String)");
		p.show("なますで");
		
		System.out.println("引数(int)");
		p.show(2);
	}
}
/*
引数(String,int)
ニーハオ

引数(String)
なますで

引数(int)
hello
hello

*/