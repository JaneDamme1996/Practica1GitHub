/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PracticaGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double suma=0;
        double temperaturas[]=new double[7];
        int dia;
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        
        System.out.println("Anota temperatura de la semana:");
        
        for(int i=0;i<temperaturas.length;i++){
            System.out.println("Día "+(i+1)+":");
            temperaturas[i]=sc.nextDouble();
            suma=suma+temperaturas[i];            
        }
        
        System.out.println("La tempertaura media ha sido:"+ suma/7);
        
        do{
            System.out.println("Anota día del que quieras saber la temperatura:");
            dia= sc.nextInt();            
        } while(dia<1 || dia>7);
        
        System.out.println("La temperatura fue de "+temperaturas[dia-1]);
        
    }
    
}
