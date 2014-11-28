package ekapakkaus;

/**
 * T‰m‰n luokan tarkoitus on tehd‰ kaikki A-luokan asiat.
 * @author Jaska
 */
public class ALuokka {

	
	public void ekaMetodi() {
		//yhden rivin kommentti
		
		/*
		  T‰m‰ on monirivinen
		  kommentti, joka alkaa
		  ja loppuu tiettyihin merkkeihin
		 */
	}
	
	/**
	 * T‰m‰ metodi perkaa kalat ja t‰ytt‰‰ veroilmoituksen.
	 */
	public void tokaMetodi() {
		//t‰h‰n koodataan toteutus
	}
	
	/**
	 * Laskee parametreina annetut luvut yhteen
	 * ja palauttaa lopputuloksen kutsujalleen.
	 * 
	 * @param eka ensimm‰inen yhteen laskettavista numeroista
	 * @param toka toinen yhteen laskettavista numeroista
	 * @return ekan ja tokan summan
	 * @throws Exception mik‰li joku heitt‰‰ kivell‰ samaan aikaan ikkunaan
	 */
	public int kolmasMetodi(int eka, int toka) throws Exception {
		return eka+toka;
	}
	
}
