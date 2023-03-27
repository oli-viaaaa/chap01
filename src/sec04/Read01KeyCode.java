package sec04; //package name

/*
 *  키보드에서 캐릭터(char)를 읽어들이는 예제
 *  import 구문으로 자바 API 사용
 */

import java.io.IOException;

public class Read01KeyCode { //class start
	public static void main(String[] args) throws IOException { //main start
		int keyCode;
		// throws IOException 글자를 읽다가 오류가 생기면 잡아들이겠다
		
		keyCode = System.in.read(); // 키보드 하나 값을 받아들이겠다
		System.out.println("keyCode:"+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode:"+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode:"+keyCode);
		
		

	} //main end

} //class end
