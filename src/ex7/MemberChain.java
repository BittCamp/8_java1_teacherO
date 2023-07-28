package ex7;

public class MemberChain {
	//[ 김찬영  2023-06-22 오전 10:53:26 ]
	// 이런건 이렇게 쓰는거구나 왜 만드는구나 를 알면됨.
	// 절차지향 생각하면 안됨.필요한거 갖다 끼우는 거다 라고만 생각하면됨. 왜저렇게 만들어지지 라고 생각할필요없음.
   String firstName;
   String country;
   int age;
   public MemberChain() {
	   this("홍길순");
   }
   public MemberChain(String mName) {
	   this(mName,20);
   }
   public MemberChain(String mName, int mAge) {
	   this(mName,mAge, "대한민국");
   }
   public MemberChain(String mName, int mAge , String mCountry ) {
	   firstName = mName;
	   age = mAge;
	   country = mCountry;
   }
   void printInfo() {
	   System.out.println("이름 : " + firstName);
	   System.out.println("국적 : " + country);
	   System.out.println("나이 : " + age);
   }
   
   //모든 클래스는 toString 을 상속받았기때문에 사용할수있다. 
   //Object 클래스의 toString을 오버라이딩 했음.
   public String toString(){
	   return firstName + "::"+ country+ "::"+  age;
   }
}
