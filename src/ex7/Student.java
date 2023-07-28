package ex7;

public class Student {
	 //[ 김찬영  2023-06-20 오후 03:28:20 ]
	
	 // 맴버변수 
	 int id;
	 String name;
	 // 생성자 두개선언
	 // 이렇게 생긴거 가져와 쓴다 는 정도만 알고있어라.
	 Student(){
		 System.out.println("기본 생성자 Student() 호출");
		 // String ss = new String("안녕"); // 이렇게도 사용가능. 생성자를 호출하라는 명령
		 
	 }
	 Student(int pram1, String pram2){
		 System.out.println("일반 생성자 Student(...) 호출");
		 id = pram1;
		 name = pram2;
	 }
	 void insertRecord(int parm1, String parm2) {
		 id = parm1;
		 name = parm2;
	 }
	 void printInfo() {
		 System.out.println("아이디: " + id);
		 System.out.println("이름: " + name);
	 }
}
