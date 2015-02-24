package oopd.LottoApp;

import java.util.ArrayList;
import java.util.Random;

public class Glazenbol {

	ArrayList <Lottobal> ballen = new ArrayList<Lottobal>(); 
		
	public void verzamelAlleBallen() {
		for(int i = 1;i<46;i++) {
			this.ballen.add(new Lottobal(i));
		}
	}
	
	public Lottobal schepBal() {
		Random r = new Random();
		int random = r.nextInt(ballen.size());
		return ballen.remove(random);
		
	}

}
