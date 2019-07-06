package indi.dpdemo.principle.singletonresponsibility;

/**
 * 方案二
 * @author winer
 *
 */
public class SingleResponsibility2 {
	
	
	public static void main(String[] args) {
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("摩托");
		roadVehicle.run("汽车");
		
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("飞机");
	}

}

// 方案2 的分析
//1.遵守单一职责原则
//2.但是这样的改动很大，即将类分解，同时修改客户端
//3.改进：直接修改Vehicle 类，改动的代码会比较少=>方案3

class RoadVehicle{
	
	public void run(String vehicle) {
		System.out.println(vehicle+"公路运行。。。");
	}
	
}

class AirVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"空中飞行。。。");
	}
}

class WaterVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle + "水上航行。。。");
	}
}
