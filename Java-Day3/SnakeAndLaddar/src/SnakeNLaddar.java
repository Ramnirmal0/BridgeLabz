
public class SnakeNLaddar {
	public static void main(String[] args) {
		int apos=0;
		int bpos=0;
//		 flag 0 : not play , flag 1: play enable
		int aflag=0;
		int bflag=0;
		
		System.out.println("Snake and Laddar Simulation Game\n\n");
		while(true) {
			
//			logic for player 1
			int dieA=(int)Math.floor(Math.random()*10)%6 + 1;
			if(aflag==1) {
				int lsvalueA=(int)Math.floor(Math.random()*10)%2 +1;
//				 lsvalue 1 : ladder , lsvalue 2: snake
				switch(lsvalueA) {
				case 1 : {
					apos+=dieA;
					break;
				}
				case 2:{
					apos-=dieA;
				}
				}
				
			}
			if(aflag==0 && dieA==1) {
				aflag=1;
				apos=1;
			}
		}

		
	}

}
