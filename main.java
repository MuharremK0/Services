package ToMidterm2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		File f1 = new File("servisler.txt");
		Scanner scan1 = new Scanner(f1);
		File f2 = new File("devam.txt");
		FileWriter fw1 = new FileWriter(f2);
		File f3 = new File("iptaller.txt");
		FileWriter fw2 = new FileWriter(f3);
		int count1 = 0;
		int count2 = 0;
		while (scan1.hasNext()) {
			String plaka = scan1.next();
			double koltuk = scan1.nextInt();
			double yolcu = scan1.nextInt();
			DecimalFormat df = new DecimalFormat("#.##");
			String formatliSayi = df.format(yolcu/koltuk);
			if ((yolcu / koltuk) > (1.0 / 2)) {
				fw1.write(plaka + " " + formatliSayi +"\n");
				count1++;
			} else {
				fw2.write(plaka + " " + formatliSayi + "\n");
				count2++;
			}
		}
		fw1.write("Toplam "+count1+" araç");
		fw2.write("Toplam "+count2+" araç");
		scan1.close();
		fw1.close();
		fw2.close();

	}

}
