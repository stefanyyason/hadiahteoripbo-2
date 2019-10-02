import java.util.Scanner;
public class nilaiRata2tugas{
	public static void main(String[] args){
		Scanner input= new Scanner (System.in);
		String nama,nilaihuruf;
		int nilaitugas1,nilaitugas2,nilaitugas3,nilaimid,nilaifinal;
		double totalrataratatugas,totalnilaiakhir;
		System.out.println();
		System.out.print("Nama          : ");
		nama=input.nextLine();
		System.out.print("Nilai Tugas 1 : ");
		nilaitugas1=input.nextInt();
		System.out.print("Nilai Tugas 2 : ");
		nilaitugas2=input.nextInt();
		System.out.print("Nilai Tugas 3 : ");
		nilaitugas3=input.nextInt();
		System.out.print("Nilai Mid     : ");
		nilaimid=input.nextInt();
		System.out.print("Nilai Final   : ");
		nilaifinal=input.nextInt();
		
		System.out.println();
		totalrataratatugas=(nilaitugas1+nilaitugas2+nilaitugas3)/3;
		System.out.println("Total Rata-rata Tugas: "+totalrataratatugas);
		System.out.println();
		totalnilaiakhir=(totalrataratatugas*30/100)+(nilaimid*30/100)+(nilaifinal*40/100);
		System.out.println("Total Nilai Akhir: "+totalnilaiakhir);
		System.out.println();
		
		if(totalnilaiakhir>=80){
			nilaihuruf="A";
		}
		else if(totalnilaiakhir>=60){
			nilaihuruf="B";
		}
		else if(totalnilaiakhir>=50){
			nilaihuruf="C";
		}
		else if(totalnilaiakhir>=40){
			nilaihuruf="D";
		}
		else{
			nilaihuruf="E";
		}
		System.out.println("Nilai Huruf: "+nilaihuruf);
		System.out.println();
	}
}