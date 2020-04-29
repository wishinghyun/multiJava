package workbook;

//p78
public class Test07 {
	public static void main(String[] args) {
		Car[] car = new Car[2];
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 70, 35, 0);
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		System.out.println("---------------------------------------------------------------------------------");
		for (int i = 0; i < car.length; i++) {
			car[i].setOil(25);
			car[i].go(80);
			System.out.println(car[i].getName() + "\t" + car[i].getEngine() + "\t"+
						car[i].getOilTank() + "\t" + car[i].getOilSize() + "\t" + 
						car[i].getDistance() + "\t" + ((Temp)car[i]).getTempGage());
		}
				
	}
}
