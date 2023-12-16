/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1netbeans;

import java.util.Scanner;

/**
 *
 * 
 */
public class Pertemuan1LatihanNetbeans {

    /**
     * @param args the command line arguments
     */
        // 
     public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        
        String nim,nama,grade;
        double uts, uas, rata;
        
        System.out.println("Data : ");
        System.out.println("NIM : "); nim=input.next();
        System.out.println("Nama : ");nama=input.next();
        System.out.println("Nilai UTS : ");uts=input.nextDouble();
        System.out.println("Nilai UAS : ");uas=input.nextDouble();
        
        rata=(uts+uas)/2;
        
if (rata <50)
grade="E";
else if (rata <60)
grade="D";
else if (rata <70)
grade="B";
else
grade="A";

System.out.println("=======================================================================");
System.out.println("NIM\tNama\tUts\tUas\tN.Rata\tGrade");
System.out.println("=======================================================================");
System.out.println(nim+ "\t" +nama+"\t" + uts + "\t" + uas + "\t" + rata + "\t" + grade);

System.out.println("");
System.out.println("");
    }
}

