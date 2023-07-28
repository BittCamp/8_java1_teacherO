package sec02.lamda;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {
	//[ 김찬영  2023-07-10 오후 05:28:47 ]
	public static void main(String[] args) {
		// c -> !c.isGasoline()는 test() 메소드의 구현체
		List<Car> dieselCars = findCars(Car.cars , c-> !c.isGasoline());
		System.out.println("디이젤 자동차 = "+ dieselCars);
		
		List<Car> oldCars = findCars(Car.cars , c-> c.getAge()> 10);
		System.out.println("오래된 자동차 = "+ oldCars);
		
		List<Car> oldDieselCars = 
				findCars(Car.cars , c-> c.getAge() > 10&&!c.isGasoline());
		System.out.println("오래된 디이젤 자동차 = "+ oldDieselCars);
		
		System.out.println("디이젤 자동차 = ");
		printCars(dieselCars, c-> System.out.printf("%s(%d)" ,
				c.getModel() ,c.getAge()));
		System.out.println("\n오래된 자동차 = ");
		printCars(oldCars, c-> System.out.printf("%s(%d,%d) ", 
				c.getModel(), c.getAge(),c.getMileage()));
	}
	
	// 메인 메소드에서 사용하는 메소드로 static이 붙어있음. 
	public static List<Car> findCars(List<Car> all , CarPredicate cp) { // 메소드 선언
		List<Car> result = new ArrayList<>();
		for(Car car : all) {
			// 구현체 에서 보낸 c-> !c.isGasoline()를 사용함 , 2번째는 c-> c.getAge()> 10 테스트
			if(cp.test(car)) 
				result.add(car);
		}
		return result;
	}
	public static void printCars(List<Car> all, CarConsumer cc) { // 메소드 선언
		for(Car car : all) {
			cc.apply(car);
		}
	}
}
