package quina;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Random aleatori = new Random();
		int [][] nButlletes = new int[9][3];
		int r;
		boolean repatit;
		for (int i=0; i<9; i++) {
			for (int x=0;x<3;x++) {
				do {
					repatit = false;
					r = aleatori.nextInt(11);
					if (r==10) {
						nButlletes[i][x] = -1;
					}else{
						nButlletes[i][x] = r +(i*10);
						for(int j=x-1;j>=0;j--){
							if (nButlletes[i][x] == nButlletes[i][j]){
								repatit = true;
							}
						}
					}
				}while (repatit ==true);
			}
		}
		for (int x=0;x<3;x++) {
			for (int i=0; i<9; i++) {
				if (nButlletes[i][x] == -1) {
					System.out.print ("   | ");
				}else{
					System.out.print (nButlletes[i][x]+" | ");
				}
			}
			System.out.println();
		}
	}

}