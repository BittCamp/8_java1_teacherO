package ex9;
//[ 김찬영  2023-06-27 오후 03:26:37 ]
public class Baby implements Papa, Mama {

	@Override // <== 어노테이션
	public void genderMother() {
		System.out.println("나는 어머니입니다.");

	}

	@Override
	public void genderFather() {
		System.out.println("나는 아버지입니다.");

	}
	
	public void printInfo() {
		System.out.println("나는 아기입니다.");
	}
}
