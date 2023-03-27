package sec04;

import java.io.IOException;

public class Read02char { //class start

	public static void main(String[] args) throws IOException {//main start
		int i = System.in.read(); // 정수 int 형으로 1바이트를 읽어온다(한글깨짐).
		char c = (char)i;
		// 숫자가 아니라 'a' 이렇게 문자로 바로 비교가 됨
		if(c>='a'&&c<='z') {//유니코드로 형변환 후 비교 // if_1 start
			System.out.println(i);
			System.out.println("입력된 문자는 영어 소문자입니다.");
		} //if_1 end
		if(c>='A'&& c<='Z') { //if_2 start
			System.out.println(i);
			System.out.println("입력된 문자는 영어 대문자입니다.");
		} //if_2 end
		if(c>='0'&& c<='9') {//if_3 start
			System.out.println(i);
			System.out.println("입력된 문자는 숫자입니다.");
		}//if_3end
		
	}// main end

} //class end
