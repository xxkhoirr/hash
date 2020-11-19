package praktikum4;

import java.util.List;
import java.util.ArrayList;
//kelompok :
//1. Khoirunnisa
//2. M Nibrassuddin A Z
//3. M Reza Abidin
//4. M Bin Idrus (tidak aktif)

public class tugas_hash {
	static	final int ukuran = 100;
	static String[] tabel = new String[ukuran];
	static boolean[] cek = new boolean[ukuran];
	static List data= new ArrayList<String>(); 
	
	static void quadraticInsert(String value) {
		int value2 = convert(value);
		for(int i=0; i < tabel.length; i++) {
			int position = hash(value2 + i*i);
			if(!cek[position]) {
				tabel[position] = value;
				cek[position] = true;
				return;
			}
		}
	}
	
	static int convert (String a) {
		int jum=0;
		char[] karakter = a.toCharArray();
        for(int i = 0; i < karakter.length ;i++) {
        	jum=jum+karakter[i];
        }
        return jum;
	}
	
	static int hash(int string) {
		return string % tabel.length;
	}
	
	static void insert(String string) {
		int position = hash(convert(string));
		tabel[position]= string;
	}
		
	public static void main(String[] args) {
		insert("Reza");
		insert("Nibras");
		insert("Nisa");
		insert("Khoir");
		insert("reza");
		insert("nibras");
		insert("Udin");
		insert("nisa");
		insert("NIsa");
		
			for(int i=0; i< tabel.length ; i++) {
				System.out.println("Posisi ke-" + i + " Berisi DATA: " + tabel[i]);
			}		
		}
	}


