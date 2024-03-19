package pkt;

/**
 * 
 * @author MFA
 * Hesap ve Kart örneklerini detaylı test eden sınıf.
 * Para çekme ve para yatırma işlemleri de test ediliyor.
 */
public class Program {
	public static void main(String[] args) {
		Hesap bankaHesabi = new Hesap(); //Yeni hesap nesnesi
		Kart bankaKarti = new Kart(bankaHesabi, "123456");
		Hesap baskaHesap = new Hesap();
		MasterKart masterKart = new MasterKart(baskaHesap, "777777");
		
		Atm atm = new Atm(); // yeni atm nesnesi
		
		/*
		 * Para yatırma denemesi
		 */
		if(atm.paraYatir(bankaKarti, "123456", 500)) System.out.println("Başarılı");
		else System.out.println("Hata");
		
		if(atm.paraYatir(masterKart, "777777", 750)) System.out.println("Başarılı");
		else System.out.println("Hata");
		
		System.out.println(); // Ekrana fazladan boşluk
		System.out.println(bankaHesabi); // Banka hesabını ekranda göster
		System.out.println();
		System.out.println(baskaHesap); // Banka hesabını ekranda göster
		
	}
}
