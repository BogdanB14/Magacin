package specifikacijamagacin;


import magacin.Artikal;

public interface InterfejsMagacin {

	public void dodajArtikal(Artikal a);
	public void izbaciArtikal();
	public Artikal vratiArtikal(int sifra);
}
