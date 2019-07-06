package indi.dpdemo.principle.singletonresponsibility;
/**
 * 方案三
 * @author winer
 *
 */
public class SingleResponsibility3 {

	public static void main(String[] args) {
		Vehicle2 vehicle2 =  new Vehicle2();
		vehicle2.runRoad("汽车");
		vehicle2.runAir("飞机");
		vehicle2.runWater("快艇");
	}
	
}

// 方式3
//1. 这种修改方法没有对原来的类做大的修改只是增加方法
//2. 这里虽然没有在类这个级别上遵循单一职责原则，但是在方法级别上，仍是遵守单一职责得
class Vehicle2 {
	
	public void runRoad(String vehicle) {
		// 处理
		System.out.println(vehicle + "在 公路上 运行。。。");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle + "在 空中 运行。。。");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle + "在 水上 运行。。。");
	}

}