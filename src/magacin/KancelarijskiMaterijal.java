package magacin;

public class KancelarijskiMaterijal extends Artikal{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KancelarijskiMaterijal other = (KancelarijskiMaterijal) obj;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "KancelarijskiMaterijal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina="
				+ kolicina + "]";
	}
	
	
}
