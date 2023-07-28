package ex7;

public class Chain { //[ 김찬영  2023-06-22 오전 10:34:22 ]
  Chain(){
   this(10);
   System.out.println("기본생성자 Chain()호출");
  }

  Chain(int x ){
   this(5,6);
   System.out.println("일반 생성자 Chain(int x) 호출");
   System.out.println("x의 값: " + x);
   
  }
  Chain(int x, int y){
   System.out.println("일반 생성자 Chain(int x, int y) 호출");
   System.out.println("x와  Y값 : "+ x +""+ y);
  }
  
}
