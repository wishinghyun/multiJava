package workbook;
//60p
public class Otab extends Mobile{
	public Otab() {
		
	}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}
	public int operate(int time) {
		return getBatterySize() - 12 * time;
	}
	public int charge(int time) {
		return getBatterySize() + 8 * time;
	}
	
}
