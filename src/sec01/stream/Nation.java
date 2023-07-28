package sec01.stream;

import java.util.List;
//[ 김찬영  2023-07-12 오전 09:55:08 ]
public class Nation {
	// 생성자부분
	private final String name;
	private final Type type;
	private final double population;
	private final int gdpRank;
	public Nation(String name,Type type , double population, int gdpRank) {
		this.name = name; this.type = type;
		this.population = population; this.gdpRank = gdpRank;
	}
	
	//enum 배열식으로 작성되는 객체 , 여러가지 객체를 나열형으로 생성할 수 있음.
	/* 클래스 처럼 선언하는데 클래스는 아니고 각 내용안에 들어 있는 것은 상수처럼 사용
	  숫자로 인덱스가 인정 숫자를 직접 입력할 수도 있다. 메소드 처럼 쓰기도 함.
	  */
	public enum Type{ LAND, ISLAND }
	public String getName() {return name;}
	public Type getType() {	return type;}
	public boolean isIsland() {return getType() != Type.LAND;}
	public double getPupulation() {return population;}
	public int getGdpRank() {return gdpRank;}
	public String toString() {return name;}
	public static final List <Nation> nations = List.of(
	
			new Nation("ROK", Nation.Type.LAND,51.4,11),
			new Nation("New Zealand" , Type.ISLAND ,4.5,49),
			new Nation("USA",Type.LAND,318.9,1),
			new Nation("China",Type.LAND,1355.7,2),
			new Nation("Philiphine",Type.LAND,107.7,36),
			new Nation("United Kingdom",Type.LAND,63.7,5),
			new Nation("Sri Lanka",Type.LAND,21.9,63),
			new Nation("Morocco",Type.LAND,33.0,60)
			);
	
}
