package Study;

public class Java_Study_constructor_1 {
	String defaultMessage = "hello";
	
	void show(String message, int count){
		for(int i = 0; i < count; i++){
			System.out.println(message);
		}
		System.out.println();
	}
	void show(String message){
		show(message,1);
	}
	void show(int count){
			show(defaultMessage,count);
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