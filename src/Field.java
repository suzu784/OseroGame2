import java.util.ArrayList;
import java.util.List;

public class Field {

	private List<Koma> komalist;
	private int ynum = 0;
	private int xnum = 0;
	
	public Field(int xnum, int ynum) {
		this.ynum = ynum;
		this.xnum = xnum;
	}
	
	// 盤面上にすべてのコマを初期化するメソッド
	public void prepare() {
		this.komalist = new ArrayList<>();
		for(int y = 0; y < this.ynum; y++) {
			for(int x = 0; x < this.xnum; x++) {
				Koma koma = new Koma(x, y);
				this.komalist.add(koma);
			}
		}
	}
	
	public Koma getKoma(int y, int x) {
		for(Koma koma : this.komalist) {
			int[] pos = koma.getPosition();
			if (pos[0] == y && pos[1] == x ) {
				return koma;
			}
		}
		return null;
	}
	
	public void putKoma(int x, int y, String state) {
		Koma koma = this.getKoma(x, y);
		koma.setState(state);
	}
	
	// 盤面上の状況を可視化してコマンドラインに出力するメソッド
	public void feature() {
		String[][] board = new String[ynum][xnum];
		for(Koma koma : this.komalist) {
			int[] pos = koma.getPosition();
			String state = koma.getState();
			board[pos[1]][pos[0]] = state;
		}
	}
	
}
