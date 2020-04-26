package waiguan;

public class Switch {
	private Light li[] = new Light[4];
	private Aircondition air;
	private Televition tel;
	private Fan fan;
	
	public Switch() {
		li[0] = new Light("左前方");
		li[1] = new Light("左后方");
		li[2] = new Light("右前方");
		li[3] = new Light("右后方");
		air = new Aircondition();
		tel = new Televition();
		fan = new Fan();
	}
	
	public void on() {
		li[0].on();
		li[1].on();
		li[2].on();
		li[3].on();
		air.on();
		tel.on();
		fan.on();
	}
	
	public void off() {
		li[0].off();
		li[1].off();
		li[2].off();
		li[3].off();
		air.off();
		tel.off();
		fan.off();
	}
}
