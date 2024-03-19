package pkt;

import java.util.UUID;

/**
 * Banka hesabını temsil eden sınıf
 * @author MFA
 *
 */
public class Hesap implements IHesap {
	private String no;
	private double bakiye;
	
	public Hesap()
	{
		this.no = UUID.randomUUID().toString(); // Rastgele bir Id belirleniyor...
		// Hesap açılışı bakiye sıfır.
		bakiye = 0;
	}
	
	@Override
	public String getNo() {
		return no;
	}

	@Override
	public boolean paraCek(double miktar) {
		/*
		 * Ön miktar kontrol ediliyor.
		 */
		if(miktar <= 0 || miktar > bakiye) return false;
		bakiye -= miktar;
		return true;
	}

	@Override
	public boolean paraYatir(double miktar) {
		if(miktar <= 0) return false; // miktar kontrolü
		bakiye += miktar;
		return true;
	}

	@Override
	public double getBakiye() {
		return bakiye;
	}
	
	@Override
	public String toString() {
		return "Hesap No: " + no + "\nBakiye: " + bakiye;
	}

}
