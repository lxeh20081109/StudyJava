package Study;

public class Java_Study_If {
	public static void main(String[] args){
		double height = Double.parseDouble(args[0]);
		double weight = Double.parseDouble(args[1]);
		
		height = height /100;
		double bim = weight /height/height;
		if(bim < 18.5){
			System.out.print("やせ");
		}else if(bim < 25){
			System.out.print("基準");
		}else if(bim < 30){
			System.out.print("肥満");
		}else{
			System.out.print("高度肥満");
		}
	}
}
