package waiguan;
//外观模式
public class Client {
	public static void main(String args[]) {
		Switch s = new Switch();
		s.on();
		System.out.println(".................");
		s.off();
	}
}
