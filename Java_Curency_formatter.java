import java.util.*;
import java.text.*;

public class Java_Curency_formatter {

    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        double payment = sca.nextDouble();
        sca.close();

        //
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String french = NumberFormat.getCurrencyInstance(Locale.FRENCH).format(payment);


        System.out.println("Us: " + us);
        System.out.println("India: " + india);
        System.out.println("china: " + china);
        System.out.println("French: " + french);
    }
    }
    