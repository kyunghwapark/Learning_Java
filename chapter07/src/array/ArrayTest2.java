package array;

// 배열의 유효한 요소값 출력하기

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5];		// 요소 5개인 배열 생성
		int size = 0;						// 유효한 값이 저장된 배열 요소 개수를 저장할 변수 선언
		
		data[0] = 10.0; size++;				// size = 1
		data[1] = 20.0; size++;				// size = 2
		data[2] = 30.0; size++;				// size = 3
		
		// 유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
		for (int i=0; i<size; i++) {
			System.out.println(data[i]);
		}

	}

}
