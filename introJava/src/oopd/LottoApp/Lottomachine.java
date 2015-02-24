package oopd.LottoApp;

public class Lottomachine {
	private Scorebord scorebord;
	private Glazenbol glazenbol;
	
	private static final int AANTAL_BALLEN = 6;
	
	public Lottomachine(){
		this.scorebord = new Scorebord();
		this.glazenbol = new Glazenbol();
	}
	
	public void voerTrekkingUit(){
		this.glazenbol.verzamelAlleBallen();
		this.scorebord.maakLeeg();
		for(int i = 0; i < AANTAL_BALLEN; i++){
			this.scorebord.plaatsBal(this.glazenbol.schepBal());
		}
		this.scorebord.plaatsBonusBal(this.glazenbol.schepBal());
		this.scorebord.sorteerBallen();
		this.scorebord.printScorebord();
		
	}
}
