import java.io.*;
public class nilaiRata2tugasbuffer{
	public static void main(String[] args) throws IOException{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		String nama, alamat;
		char nilaihuruf;
		int nilaitugas1,nilaitugas2,nilaitugas3,nilaimid,nilaifinal, nilai;
		double totalrataratatugas, totalnilaiakhir;
		
		
		System.out.println("inputan Bufferd Reader");
		System.out.println();
		System.out.print("Nama          : ");
		nama=br.readLine();
		System.out.print("Nilai Tugas 1 : ");
		nilaitugas1=Integer.parseInt(br.readLine());
		System.out.print("Nilai Tugas 2 : ");
		nilaitugas2=Integer.parseInt(br.readLine());
		System.out.print("Nilai Tugas 3 : ");
		nilaitugas3=Integer.parseInt(br.readLine());
		System.out.print("Nilai Mid     : ");
		nilaimid=Integer.parseInt(br.readLine());
		System.out.print("Nilai Final   : ");
		nilaifinal=Integer.parseInt(br.readLine());
	
		
		
		System.out.println();
		totalrataratatugas=(nilaitugas1+nilaitugas2+nilaitugas3)/3;
		System.out.println("Total Rata-rata Tugas: "+totalrataratatugas);
		totalnilaiakhir=(totalrataratatugas*30/100)+(nilaimid*30/100)+(nilaifinal*40/100);
		System.out.println("Total Nilai Akhir: "+totalnilaiakhir);

		
		if(totalnilaiakhir>=80){
			nilaihuruf='A';
		}
		else if(totalnilaiakhir>=60){
			nilaihuruf='B';
		}
		else if(totalnilaiakhir>=50){
			nilaihuruf='C';
		}
		else if(totalnilaiakhir>=40){
			nilaihuruf='D';
		}
		else{
			nilaihuruf='E';
		}
		System.out.println("Nilai Huruf: "+nilaihuruf);
		System.out.println();
	}
}