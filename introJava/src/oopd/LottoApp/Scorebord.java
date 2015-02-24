package oopd.LottoApp;

import java.util.ArrayList;
import java.util.Arrays;

public class Scorebord {
	private ArrayList<Lottobal> ballen = new ArrayList<Lottobal>();
	private Lottobal lottobal;
	private Lottobal bonusBal;
	
	public Scorebord(){
		
	}
	
	public void maakLeeg(){
		this.ballen.clear();		
	}
	
	public void plaatsBal(Lottobal bal){
		this.ballen.add(bal);
	}
	
	public void plaatsBonusBal(Lottobal bal){
		this.bonusBal = bal;
	}
	
	public void sorteerBallen() {
		for (int i = ballen.size(); i > 0; i--) {
			for (int j = 0; j < i-1; j++) { 
	            if (ballen.get(j).getNummer() > ballen.get(j+1).getNummer()) {
	            	Lottobal bal = ballen.get(j);
	                ballen.set(j, ballen.get(j + 1));
	            	ballen.set(j + 1, bal);
	            }
	        }
		}
	}
	
	public void printScorebord(){
		//System.out.println("Ballen: " + Arrays.toString(ballen.toArray()));
		System.out.println("Getrokken ballen: ");
		for(Lottobal x : ballen){
			System.out.print(x + " ");
		}
		System.out.println("\nBonusbal: " + this.bonusBal);
	}
}
