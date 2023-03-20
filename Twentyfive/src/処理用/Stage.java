package 処理用;

public class Stage extends User {
	
	private int hp;
	private int mp;
	private int atk;
	private int sp;
	private int def;
	

	public Stage(String name) {
		super(name);
		this.hp = User.getRandom(1000);
		this.mp = User.getRandom(1000);
		this.atk = User.getRandom(1000);
		this.sp = User.getRandom(1000);
		this.def = User.getRandom(1000);
		// TODO Auto-generated constructor stub
	}
	

	public int getHP() {
		System.out.println("HP：" + hp);
		return hp;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public int getMP() {
		System.out.println("MP：" + mp);
		return hp;
	}
	
	public void setMP(int mp) {
		this.mp = mp;
	}
	
	public int getATK() {
		System.out.println("攻撃力：" + atk);
		return atk;
	}
	
	public void setATK(int atk) {
		this.atk = hp;
	}
	
	public int getSP() {
		System.out.println("素早さ：" + sp);
		return sp;
	}
	
	public void setSP(int sp) {
		this.sp = sp;
	}
	
	public int getDEF() {
		System.out.println("防御力：" + def);
		return def;
	}
	
	public void setDEF(int def) {
		this.def = def;
	}
	
	public void overWrite() {
		System.out.println("こんにちは" + name + "さん");
		System.out.println("ステータス");
		getHP();
		getMP();
		getATK();
		getSP();
		getDEF();
	}

}
