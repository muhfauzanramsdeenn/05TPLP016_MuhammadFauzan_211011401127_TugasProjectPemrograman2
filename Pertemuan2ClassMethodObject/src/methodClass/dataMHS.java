/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodClass;
import java.util.Scanner;
import methodClass.MHS;
public class dataMHS {
    private static double nilakhir;
    private static String grade;
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);
        MHS[] mhs = new MHS [0];
        int jml, x, pil;
        double nuts, nuas;
        
        do {
        System.out.println("PILIH MENU");
        System.out.println("=======================");
        System.out.println("1. Input Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Keluar Program");
        System.out.println("========================");
        
        System.out.println("Pilih Menu ?");
        pil = input.nextInt();
        System.out.println("");
        
        switch(pil){
            
            case 1:
            System.out.print("Jumlah Data: ");
            jml = input.nextInt();
            mhs=new MHS [jml];
            for  (x=0;x<jml;x++){
                mhs[x]=new MHS();
                System.out.println("Data : "+ (x+1));
                System.out.println("NIM  :"); mhs[x]. setNim(input.next());
                System.out.println("Nama :"); mhs[x]. setNama(input.next());
                System.out.println("Nilai UTS :"); nuts=input.nextFloat();
                System.out.println("Nilai UAS :"); nuas=input.nextFloat();

                mhs [x]. setUts((float) nuts);

                mhs [x]. setUas((float) nuas);
                
            }
        break;
        
            case 2:
                System.out.print("Tampil Data");
                x=0;
                while (x<mhs.length){
                    System.out.println("Data  :"+x+1);
                    System.out.println("NIM"  + mhs[x].getNim()); 
                    System.out.println("Nama"); mhs[x]. getNama();
                    System.out.println("Nilai UTS :" + mhs[x].getUts());
                    System.out.println("Nilai UAS :" + mhs[x].getUas());
                             System.out.println("Nilai NilAkhir :" + mhs[x].getNilAkhir());
                                      System.out.println("Nilai Grade :" + mhs[x].getGrade());
                    x++;
                }
        break;
        
            case 3:
        System.out.print("Selesai");
        break;
        }
        }while (pil!=3);
    }
}

