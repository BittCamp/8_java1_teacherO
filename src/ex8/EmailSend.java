package ex8;

public class EmailSend extends MessageSend {
	public EmailSend() {};
	public EmailSend(String rev,String sen,String content) {
		super(rev,sen,content);
	}
	// 재정의 Override[ 김찬영  2023-06-26 오후 02:23:11 ]
	public void sendMsg() {
		System.out.println("받는   이메일: " +this.rev);
		System.out.println("보내는  이메일: " +this.sen);
		System.out.println("이메일   내용: " +this.content);
	}
}
