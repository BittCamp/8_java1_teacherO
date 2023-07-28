package ex7;

public class Employee { //[ 김찬영  2023-06-22 오전 10:08:31 ]
	int empno;
	String ename;
	String job;
	int cont; // 정규직1 계약직2 프리랜서
	String salType; // 호봉제 , 연봉제 , 계약제
	
	public Employee(){ // 디폴트 생성자 생성
	}
	public Employee(int empno,String ename,String job){
	// 이상태론 갈색으로 나옴. 그래서 this.변수 = 값. 넣어줘야함. 그래야 쓸수있음.
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}
	public Employee(int empno,String ename,String job,int cont) {
		// 이렇게 써줘도 되지만 앞서서 이미 써줬다 . 그래서!!!
		//this.empno = empno;
		//this.ename = ename;
		//this.job = job;	
		// 이미 써준 생성자를 호출해줌.!
		this(empno,ename,job); // 내부의 다른 생성자 호출
		this.cont =cont;
	}
	
	// 이렇게 죽죽 써줘서 프로그램 길이가 짧아지고 , 유지보수가 쉬워진다.
	public Employee(int empno,String ename,
			String job,int cont , String salType) {
		this(empno,ename,job,cont);
		this.salType = salType;
	}
	
}
