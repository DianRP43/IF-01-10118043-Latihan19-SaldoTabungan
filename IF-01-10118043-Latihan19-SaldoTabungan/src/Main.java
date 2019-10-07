/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
/**
 *
 * @author user
 */
public class Main {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setCurrencySymbol("Rp. ");
        simbol.setGroupingSeparator('.');
        
        DecimalFormat pembulatan = (DecimalFormat)DecimalFormat.getCurrencyInstance();
        pembulatan.setDecimalFormatSymbols(simbol);
        pembulatan.setMaximumFractionDigits(0);
        
        double saldo;
        int i;
        i = 1;
        saldo = 2875000;
        do{
            System.out.println("Saldo di Bulan ke-"+i+" "+pembulatan.format(saldo));
            i++;
            saldo = saldo + (saldo * 0.15);
        }while (i <= 6);
        
    }
   
}
