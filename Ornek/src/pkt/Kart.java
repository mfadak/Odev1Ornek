package pkt;

/**
 * Banka kartını temsil eden sınıf
 * @author MFA
 *
 */
public class Kart implements IKart {
	private Hesap hesap;
	private String sifre;
	
	public Kart(Hesap hesap, String sifre) {
		/*
		 * 
		 */
		this.hesap = hesap;
		this.sifre = sifre;
	}

	/**
	 * @param sifre Kart şifresi
	 * @return Giriş başarılı mı?
	 */
	@Override
	public boolean girisKontrol(String sifre) {
		return this.sifre == sifre;
	}

	@Override
	public IHesap getHesap() {
		return hesap;
	}
}
