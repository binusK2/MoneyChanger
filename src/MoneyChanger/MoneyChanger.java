package MoneyChanger;
import java.util.Scanner;

import java.text.DecimalFormat;


// Class Main MoneyChanger
public class MoneyChanger {
    
    //deklarasi variable dengan tipe data String, Int, Double
    public void hitung (String mataUang, int kurs){
        double rupiah;
        double exchange;
        
        
        Scanner input = new Scanner (System.in);
        DecimalFormat digit = new DecimalFormat ("0.00");
        //Exception Handling
        //pengecekan input harus berupa angka
        try{
            System.out.printf("Masukan Nominal Rupiah yang akan ditukar :Rp ");
            rupiah = (double)input.nextLong();
            exchange = (float) (rupiah/kurs);
            System.out.println("Dengan Rp. "+(int)rupiah+" Anda akan mendapatkan "+digit.format(exchange)+" "+mataUang);
        } catch (Exception e){
            System.out.println("Nominal Rupiah harus angka !!!");
        }
    }
    
    public static void main(String[] args) {
        String curr, choice ;
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("Money Changer - Foreigner Money");
        System.out.println("===============================\n");
        do{
            System.out.printf("Masukan Valuta Asing [USD/EURO/POUNDS] : ");
            curr = input.nextLine();
            
            MoneyChanger obj = new MoneyChanger ();
            
            //Switch Case
            switch (curr){
                
                    //input berupa string 'USD'
                    case "USD" :
                        obj.hitung ("USD", 12000);
                        break;
                    //input berupa string 'EURO'
                    case "EURO" :
                        obj.hitung ("EURO", 15000);
                        break;
                    //Input berupa string 'POUNDS'
                    case "POUNDS" :
                        obj.hitung ("POUNDS", 17500);
                        break;
                    default :
                    	
                    	System.out.printf("Masukan Nominal Rupiah yang akan ditukar : ");
                      	//long rupiah = input.nextLong();
                    	//Scanner scan = new Scanner(System.in);
                        
                        //Output apabila mata uang yang dimasukan salah
                        System.out.println("Mata Uang yang anda masukan salah, silahkan coba kembali !");
                        break;
            }
            
            //proses pengulangan program
            input.nextLine();
            System.out.printf("Anda ingin mengulang [Y/N] : ");
            choice = input.nextLine();
            
          //keluar dari pengulangan
        } while (!"N".equals(choice));
    }
}