package magacin;

public class Artikal {
	protected String naziv;
	protected int sifra;
	protected String opis;
	protected int kolicina;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null)
			throw new NullPointerException("Naziv ne sme biti null");
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra < 0)
			throw new IllegalArgumentException("Sifra ne sme biti manja od nule");
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis == null)
			throw new NullPointerException("Opis ne sme biti null");
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina < 0)
			throw new IllegalArgumentException("Kolicina ne sme biti manja od nule");
		this.kolicina = kolicina;
	}
	
	
}


