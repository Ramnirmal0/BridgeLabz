
public class SnakeNLaddar {
	public static void main(String[] args) {
		int apos=0;
		int bpos=0;
//		 flag 0 : not play , flag 1: play enable
		int aflag=0;
		int bflag=0;
		int apos_temp;
		int bpos_temp;
		int dieRolls=0;
		
		System.out.println("Snake and Laddar Simulation Game\n\n");
		while(true) {
			dieRolls++;
//			logic for player 1
			int dieA=(int)Math.floor(Math.random()*10)%6 + 1;
			if(aflag==1) {
				int lsvalueA=(int)Math.floor(Math.random()*10)%2 +1;
//				 lsvalue 1 : ladder , lsvalue 2: snake
				switch(lsvalueA) {
					case 1 : {
						apos_temp=apos;
						apos+=dieA;
						if(apos>100) {
							apos=apos_temp;
							System.out.println("\nPlayer A need to get Die value "+(100-apos)+" to win\n");
							break;
						}
						System.out.println("\n Player A Rolled ! Die Value : "+dieA +"\n Player A Climbed Laddar with +"+dieA+"\n Current Player A Position : "+apos+"\n");
						break;
					}
					case 2:{
						apos-=dieA;
						if(apos<=0) {
							apos=0;
							aflag=0;
							System.out.println("\nOh ! Player A is Knocked Out . Need Die value 1 to get inside Game\n");
							break;
						}
						System.out.println("\n Player A Rolled ! Die Value : "+dieA +"\n Player A bitten by snake with -"+dieA+"\n Current Player A Position : "+apos+"\n");
						break;
					}
				}
				
			}
			if(aflag==0 && dieA==1) {
				aflag=1;
				apos=1;
				System.out.println("\nPlayer A is entered into Game!! \n Current Player A position : "+apos+"\n");
			}
			if(apos>=100) {
				System.out.println("\n Game Over !\n\n Player A wins with "+dieRolls+ " Die Rolls\n");
				return;
			}
			
//			logic for player 2
			int dieB=(int)Math.floor(Math.random()*10)%6 + 1;
			if(bflag==1) {
				int lsvalueB=(int)Math.floor(Math.random()*10)%2 +1;
//				 lsvalue 1 : ladder , lsvalue 2: snake
				switch(lsvalueB) {
					case 1 : {
						bpos_temp=bpos;
						bpos+=dieB;
						if(bpos>100) {
							bpos=bpos_temp;
							System.out.println("\nPlayer B need to get Die value "+(100-bpos)+" to win\n");
							break;
						}
						System.out.println("\n Player B Rolled ! Die Value : "+dieB +"\n Player B Climbed Laddar with +"+dieB+"\n Current Player B Position : "+bpos+"\n");
						break;
					}
					case 2:{
						bpos-=dieB;
						if(bpos<=0) {
							bpos=0;
							bflag=0;
							System.out.println("\nOh ! Player B is Knocked Out . Need Die value 1 to get inside Game\n");
							break;
						}
						System.out.println("\n Player B Rolled ! Die Value : "+dieB +"\n Player B bitten by snake with -"+dieB+"\n Current Player B Position : "+bpos+"\n");
						break;
					}
				}
				
			}
			if(bflag==0 && dieB==1) {
				bflag=1;
				bpos=1;
				System.out.println("\nPlayer B is entered into Game!! \n Current Player B position : "+bpos+"\n");
			}
			if(bpos>=100) {
				System.out.println("\n Game Over !\n\n Player B wins with "+dieRolls+ " Die Rolls");
				return;
			}
	
		}

		
	}

}
