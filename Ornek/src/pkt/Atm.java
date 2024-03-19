package pkt;

/**
 * 
 * @author MFA
 *
 */
public class Atm {
	/**
	 * <p>
	 *   Atm'den para çekme işlemi
	 * </p>
	 * @param kart ATM'ye verilen kart
	 * @param sifre Kart şifresi
	 * @param miktar Çekilecek para miktarı
	 * @return Para çekme işleminin başarılımı geçtiğini döndürür.
	 */
	public boolean paraCek(IKart kart,String sifre, double miktar) {
		if(!kart.girisKontrol(sifre)) return false;
		return kart.getHesap().paraCek(miktar);
	}
	
	public boolean paraYatir(IKart kart,String sifre, double miktar) {
		// Şifre kontrolü
		if(!kart.girisKontrol(sifre)) return false;
		return kart.getHesap().paraYatir(miktar);
	}
}
