import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Scanner keyboard = new Scanner(System.in);

		
		System.out.println("Enter a color.");
		String color = keyboard.next();
		car1.setcolor(color);
		System.out.println("Color: " + car1.getcolor());
		System.out.println("Enter the horse-power.");
		int horsePower = keyboard.nextInt();
		car1.sethorsePower(horsePower);
		System.out.println("Horse-power: " + car1.gethorsePower());
		System.out.println("Enter the engine size.");
		String engineSize = keyboard.next();
		car1.setengineSize(engineSize);
		System.out.println("Engine-size: " + engineSize + ".");
		
		System.out.println(car1);
		
		
		
		
		Car car2 = new Car();
		keyboard = new Scanner(System.in);

		
		System.out.println("\nEnter a color.");
		color = keyboard.next();
		car2.setcolor(color);
		System.out.println("Color: " + car2.getcolor());
		System.out.println("Enter the horse-power.");
		horsePower = keyboard.nextInt();
		car2.sethorsePower(horsePower);
		System.out.println("Horse-power: " + car2.gethorsePower());
		System.out.println("Enter the engine size.");
		engineSize = keyboard.next();
		car2.setengineSize(engineSize);
		System.out.println("Engine-size: " + engineSize + ".");
		
		System.out.println(car2);
		
		
		
		Car car3 = new Car();
		keyboard = new Scanner(System.in);

		
		System.out.println("\nEnter a color.");
		color = keyboard.next();
		car3.setcolor(color);
		System.out.println("Color: " + car3.getcolor());
		System.out.println("Enter the horse-power.");
		horsePower = keyboard.nextInt();
		car3.sethorsePower(horsePower);
		System.out.println("Horse-power: " + car3.gethorsePower());
		System.out.println("Enter the engine size.");
		engineSize = keyboard.next();
		car3.setengineSize(engineSize);
		System.out.println("Engine-size: " + engineSize + ".");
		
		System.out.println(car3);
	}
}
