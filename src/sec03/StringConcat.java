package sec03; //package name

public class StringConcat {//class start

	public static void main(String[] args) {//main start
		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value:"+value);
		
		// 결합연산(왼쪽부터 순서대로) // "" 문자열로 인식
		String str1 = 10 + 2 + "8";
		System.out.println("str1:"+str1); // 128
		
		String str2 = 10+"2"+8;
		System.out.println("str2:"+str2); // 1028
		
		String str3 = "10"+2+8;
		System.out.println("str3:"+str3); // 1028
		
		String str4 = "10"+(2+8); // 괄호먼저 연산
		System.out.println("str4:"+str4); // 1010
		

	}//main end

}//class end
