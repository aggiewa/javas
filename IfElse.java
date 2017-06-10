import java.util.Scanner;
class IfElse{
	public static void main(String[]args){
	int marksObtained,passingMarks;
	
	passingMarks=40;
	Scanner stdio=new Scanner(System.in);
	System.out.println("input marks obtained\n");
	marksObtained=stdio.nextInt();
	
	if(marksObtained>=passingMarks){System.out.println("pass");}
	else{System.out.println("fail");}
}
}
	
	
		