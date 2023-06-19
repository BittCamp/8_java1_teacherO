package ex4;

public class Continue01 {
	public static void main(String[] args) {
		for(int i = 1; i <=4; i++) {
			for(int j = 1; j <=3 ; j++) { // i = 1,2,3,4
				if(i==3 && j ==2 ) { /// j = 1,2,3
					continue; // 컨티뉴를 포함하는 for 문으로 돌아간다.
				}
				System.out.println(i + "*" + j);
			}
		}
	}
}
