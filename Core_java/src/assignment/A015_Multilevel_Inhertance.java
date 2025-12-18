package assignment;

class Vehicle {
   public void drive() {
        System.out.println("Vehicle is driving.");
    }
}

// Level 2 (Child of Vehicle)
class Car extends Vehicle {
   public void gear() {
        System.out.println("Car has gears.");
    }
}


class SportsCar extends Car {
   public  void speed() {
        System.out.println("SportsCar is fast.");
    }
}

public class A015_Multilevel_Inhertance {
	public static void main(String[] args) {
		
	 SportsCar obj=new SportsCar();
	 
	 obj.drive();
	 obj.gear();
	 obj.speed();
	}

}
