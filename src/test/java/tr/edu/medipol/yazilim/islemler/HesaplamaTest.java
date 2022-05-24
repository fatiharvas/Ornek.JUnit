package tr.edu.medipol.yazilim.islemler;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	private Hesaplama testEdilenSinif = new Hesaplama();
	
	@Test
	public void testTopla() {

		int sayi1 = 40;
		int sayi2 = 20;
		int beklenenSonuc = 60;
		
		int sonuc = testEdilenSinif.topla(sayi1, sayi2);
				
		assertEquals(beklenenSonuc, sonuc);
		
	}

	@Test 
	public void testCikar() {
		
		int sayi1 = 40;
		int sayi2 = 20;
		int beklenenSonuc = 20;
		
		int sonuc = testEdilenSinif.cikar(sayi1, sayi2);
		
		assertEquals(beklenenSonuc, sonuc);
	}
	
	@Test
	public void testCarp() {
		
		int sayi1 = 40;
		int sayi2 = 20;
		int beklenenSonuc = 800;
		
		int sonuc = testEdilenSinif.carp(sayi1, sayi2);
		
		assertEquals(beklenenSonuc, sonuc);
		
	}
	
	@Test
	public void testBol() {
		
		int sayi1 = 40;
		int sayi2 = 20;
		int beklenenSonuc = 2;
		
		int sonuc = testEdilenSinif.bol(sayi1, sayi2);
		
		assertEquals(beklenenSonuc, sonuc);
		
	}
	
}
