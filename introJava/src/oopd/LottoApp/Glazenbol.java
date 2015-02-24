package oopd.LottoApp;

import java.util.ArrayList;

public class Glazenbol {

	ArrayList <Lottobal> ballen = new ArrayList<Lottobal>(); 
		
	public void verzamelAlleBallen() {
		for(int i = 0;i<44;i++) {
			this.ballen.add(i+1, null);
		}
	}
	
	public void schepBal() {
		
	}

}
