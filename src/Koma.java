
public class Koma {

	private String state;
	private int x;
	private int y;
	
	// 引数が与えられているコンストラクター
	public Koma(int x, int y) {
		this.state = "E";
		this.x = x;
		this.y = y;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int[] getPosition() {
		int[] pos = {this.x, this.y};
		return pos;
	}
	
}
