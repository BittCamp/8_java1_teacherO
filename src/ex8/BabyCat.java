package ex8;

public class BabyCat extends ParentCat {//[ 김찬영  2023-06-22 오후 12:39:07 ]
   // Parent  클래스가 가진 eat 이랑 breed 값 다 가지고 있다.
   // new class 에서 browse누르면 슈퍼클래스 쓸수있다.
   public String color = "초콜릿색";
   void meow() {
	   System.out.println("야옹하고 울다.");
   }
}
