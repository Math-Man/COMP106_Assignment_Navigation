package main;
//I was planing on using this instead of I/O but I thought I/O would be better
public enum Locations {

	Istanbul( 157 , 73 ),
	Edirne (50 , 53),
	Izmir (50 , 231),
	Antalya (216 , 323),
	Ankara (317 , 139),
	Sinop (427 , 25),
	Trabzon (653 , 78),
	Kars (806 , 82),
	Van (829 , 215),
	Mardin (690 , 296),
	Hatay (470 , 360),
	Konya (270 , 265),
	Zonguldak (293 , 50),
	Samsun (509 , 65),
	Artvin (760 , 43),
	Hakkari (845 , 257),
	Sanliurfa (615 , 307),
	Adana (439 , 333),
	Mugla (123 , 311),
	Canakkale (32 , 122),
	Kirklareli (91 , 28),
	Bursa (135 , 122),
	Balikesir (72 , 153),
	Afyon (195 , 210),
	Corum (414 , 96),
	Kayseri (460 , 198),
	Malatya (598 , 208),
	Erzurum (735 , 115),
	Mus (785 , 166),
	Agri (825 , 166);
	
	private final int x;
	private final int y;
	
	
	Locations (int x , int y)
	{
		String t = "";
		char[] c = t.toCharArray();
		if (c[0] == ' ') {}
		
		this.x = x;
		this.y = y;
		
		
	}
	
	public int getX() {return this.x;}
	
	public int getY() {return this.y;}
	
	
	
}
