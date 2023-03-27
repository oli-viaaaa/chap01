package sec04; //package name

import java.io.IOException;

/*
 * keyCord를 반복적으로 입력 받는 예제
 * @author 505-t
 */

public class Read03Continue { //class start

	public static void main(String[] args) throws IOException{ //main start	
		//int keyCord ;
				//while(true) { //while(반복문) start
					//keyCord =System.in.read();
					//System.out.println("keyCode:"+keyCord);
					//if(keyCord==113) {//if start // q - 113이면
						//break; //keyCode가 113과 동일한 경우 실행(q 입력하면 멈춤)
					 //} //if end
				//} // while end
		int keyCord;
		char c;
		while(true) {//계속해서 키를 입력 받는다.
			System.out.println("==================================");
			System.out.println("영어 알파벳과 숫자를 입력하세요.");
			
			//System.in.read(); 반환값이 int type
			keyCord= System.in.read(); // 실제고 입력된 key
			c = (char)keyCord; // 강제 형변환(문자로 변환)
			System.in.read(); // 두번째로 입력되는 [CR]에 대응하는 13, 의미없는 숫자
			System.in.read(); // 세번째로 입력되는 [LF]에 대응하는 10, 의미없는 숫자
			
			if(c>='0'&&c<='9') {// 아스키코드 중에서 0~9 사이의 키가 눌렸는지 체크
				System.out.printf("key- %c 매핑문자 %d 입니다.\n", c, keyCord);
			}//if end
			else if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {//영문자
				System.out.printf("key- %c 매핑문자 %d 입니다.\n", c, keyCord);
			}//else if end
		
		}//while end
	} //main end

} // class end
