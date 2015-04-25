package helloWorld;

public class panPanDoor extends Door implements Alarm{

	@Override
	public void alarm() {
		System.out.println("有坏人闯进来了……");
		
	}

	@Override
	public void open() {
		System.out.println("门开了");
		
	}

	@Override
	public void close() {
		System.out.println("门关了");
		
	}
	public static void main(String[] args){
		Door door = new panPanDoor();
		((panPanDoor)door).alarm();
		((panPanDoor)door).open();
		((panPanDoor)door).close();
	}

}
