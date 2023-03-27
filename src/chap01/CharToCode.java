package chap01; //package name

public class CharToCode { //class start

	public static void main(String[] args) { //main start
		char ch = 'A';     // char ch = 65;
		int intCode='B';
		System.out.printf("%c=%d\n",ch,intCode);  // %가 2개일경우 뒤의 내용도 2개
		
		char characteC ='a';
		int charCode = (int)characteC;
		System.out.printf("%c=%d\n", characteC, charCode);
		
		

	} //main end

} //class end
