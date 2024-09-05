package edu.kh.oop.practice.model.vo;

public class Hero {
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;	
	
	public Hero() {}
	
	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		
		System.out.println("============캐릭터 생성============");
		
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.println(this.job + "직업으로 '" + this.nickname + "'님이 생성되었습니다");
		System.out.println("현재 레벨 : " + this.level);
		System.out.println("현재 hp : " + this.hp);
		System.out.println("현재 mp : " + this.mp);
		System.out.println("현재 경험치 : " + this.exp);
	}
	
	public void attack(double exp) {
		
		this.exp += exp;
		
		System.out.printf("'%s'은/는 공격을 했다!!! 현재 경험치 : %.1f\n",
				nickname, (double)((level-1)*300)+ this.exp );
		
		if(exp >= 300) {
			this.level++;
			this.exp -= 300;
			System.out.println("레벨이 올랐습니다!! 현재 레벨 : " + level);
		}
	}
	
	public void dash() {
		if(mp < 10 ) {
			System.out.println("[마력 부족]더 이상 대시 할 수 없어요~!");
			return;
		}
		mp -= 10;
		
		System.out.printf("'%s'의 엄청 빠른 대시!!! 남은 마력 : %d\n", nickname, mp);
	}
	
	
	
	@Override
	public String toString() {
		return "======'" + nickname + "'님의 정보======" + 
				"\n-현재 레벨 : " + level + "\n"
				+ "-현재 hp : " + hp + "\n"
				+ "-현재 mp : " + mp + "\n"
				+ "-현재 exp : " + (((level-1) * 300) + exp);
	}
	
	public String getNickName() {
		return nickname;
	}

	public void vision() {
		System.out.println("============='"+ nickname + "' 시점================");
	}
	
}
