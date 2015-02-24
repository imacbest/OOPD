package oopd.LottoApp;

import java.util.ArrayList;
import java.util.Random;

public class Glazenbol {

	ArrayList <Lottobal> ballen = new ArrayList<Lottobal>(); 
		
	public void verzamelAlleBallen() {
		for(int i = 0;i<44;i++) {
			this.ballen.add(i+1, null);
		}
	}
	
	public Lottobal schepBal() {
		Random r = new Random();
		int random = r.nextInt(ballen.size());
		return ballen.get(random);
		
	}

}
