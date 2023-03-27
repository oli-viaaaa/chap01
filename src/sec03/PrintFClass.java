package sec03; //package name


public class PrintFClass { //class start

	public static void main(String[] args) {
		// printf 문에 사용하는 타입
		// String type :%s
		System.out.printf("이름  %s","홍길동"); // 이름 : 홍길동 // %가 위치한 곳에 무언가를 넣겠다, S= String
		// decimal : %d
		System.out.printf("나이 %d 세",28); // 나이 :28세 // %가 위치한 곳에 무언가를 넣겠다
		
		// 순서 정하기
		System.out.println("");// 한줄 띄움
		System.out.printf("이름 : %1$s, 나이 : %2$d 세, 결혼유무 : %3$s","홍길동",28,"미혼");
		//1$ = 순서를 지정 1,2,3,4...
		
		// 정수 숫자 자리수
		System.out.println("");// 한줄 띄움
		System.out.printf("%d",123456);
		
		System.out.println("");// 한줄 띄움
		System.out.printf("%6d",12); // 전체 자리수 의미 6자리인데 오른쪽에 12를 쓰고 나머지는 빈칸으로 두겠다
		
		// 실수 자릿수
		System.out.println("");// 한줄 띄움
		System.out.printf("%d",1234567890);
		System.out.println("");// 한줄 띄움
		System.out.printf("%10.2f",1234.56); // 총 10자리, 소숫점 2자리, 마침표 1개
			// %f 소수점 입력시 f사용, 10자리 할당, 소수점은 2자리까지 유지하겠다(소수점 포함 10자리)
		
		System.out.println("");// 한줄 띄움
		double area = 3.14159*10*10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f", 10, area);
		
		

	}

}
