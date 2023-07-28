package ex8;

public class SendEx {

	public static void main(String[] args) {
//[ 김찬영  2023-06-26 오후 02:48:12 ]		
//       int[] a = {1,2,3};
		// 다형성 배열로 선언하여 출력
		// 슈퍼클래스(상위클래스)로 선언해서 저장이 가능하다.
		MessageSend[] msg = { new FaxSend("02-1234-1234","031-1234-1234","팩스로 전달합니다."), 
							  new EmailSend("aaa@naver.com","bbb@google.com","메일로 전달합니다."),
							  new SmsSend("010-1234-1234","010-2345-1234","문자로 전달합니다.")
							};
		// 각 배열의 해당하는 해당 메소드(다시말해서 해당 생성된 클래스의 메소드 실행 된다.)
		for(int i=0; i<msg.length; i++) {
			msg[i].sendMsg();
		}
		System.out.println("=================");
		//해당 배열의 객체를 하나씩 꺼내서 대표인 상위 클래스로 받으면 각자 자신의 클래스의 메소드로 실행된다.
		for(MessageSend s : msg){
		// for ( int i : int배열 ) {} 이거랑 같은거다. 
			s.sendMsg();
		}
	}

}
