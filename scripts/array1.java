package scripts;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahBatas;
        
        System.out.print("input amount subject :");
        line=in.nextInt();
        int [] dataArray = new int[line];
        int [] nilaiUas = new int [line];
        //do loop for input 
        for(int i =0 ; i < nilaiUas.length ; i++){   
            System.out.print("Masukan nilai uas ke "+i+"=");
            nilaiUas[i]=in.nextInt();
        }
        // do loop for showing data
        for(int i =0 ; i < nilaiUas.length; i++){
            if(nilaiUas[i] >= 70){
            System.out.println("mahasiswa ke "+i +"dengan nilai "+nilaiUas[i]+" graduated!");  
            }else{
            System.out.println("mahasiswa ke "+i+" dengan nilai "+nilaiUas[i]+" not pass!");
            }
        }   
    }
}
