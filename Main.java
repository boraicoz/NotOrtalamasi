import java.util.Scanner;


public class Main {
static Scanner input=new Scanner(System.in);
 public static void main(String[] args) {
     System.out.print("Matematik Notunuzu Giriniz:");
     double mat=input.nextDouble();
     System.out.print("Fizik Notunuzu Giriniz:");
     double fiz=input.nextDouble();
     System.out.print("Kimya Notunuzu Giriniz:");
     double kim=input.nextDouble();
     System.out.print("Biyoloji Notunuzu Giriniz:");
     double biy=input.nextDouble();
     System.out.print("Geometri Notunuzu Giriniz:");
     double geo=input.nextDouble();
     double ort=(mat+fiz+kim+biy+geo)/5 ;
     String durum=(ort>60)? "Sinifi Gecti":"Sinifta Kaldi";
     System.out.println("Ortalamaniz:"+ort+"\n"+durum);



    }
}