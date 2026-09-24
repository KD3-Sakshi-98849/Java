
enum TrafficLight{
	RED(60),
	GREEN(45),
	YELLOW(5);
	private int duration;
	TrafficLight (int duration){
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for(TrafficLight light:TrafficLight.values()) {
	 System.out.println(light +":"+light.getDuration()+"second");
 }
	}

}
