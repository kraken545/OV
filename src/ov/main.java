package ov;

import java.util.Scanner;


public class main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        paal verwerkt = new paal();
        kaart kaart01 = new kaart();
        ladpaal ladpal = new ladpaal();

        double saldo;
        boolean ingechecked;
        String nummer;
        boolean geldig;

        int keuze = 0;

        System.out.println("kaart_saldo?!/n");
        saldo = input.nextDouble();
        System.out.println("kaart_is_ingecheked?!/n");
        ingechecked = input.nextBoolean();
        System.out.println("kaart_nummer?/n");
        nummer = input.next();
        System.out.println("kaart_is_geldig?/n");
        geldig = input.nextBoolean();
        verwerkt.readKaart(kaart01, saldo, ingechecked, nummer, geldig);


        while (keuze != 5)

        {

            verwerkt.showOptions();
            keuze = input.nextInt();


            switch (keuze)
            {
                case 1:
                    System.out.println("hoeveel euro wilt u toevegen");
                    ladpal.addSaldo(kaart01, input.nextDouble());
                    break;

                case 2:
                    System.out.println("huidig saldo: €" + kaart01.getSaldo());

                    break;


                case 3:
                    verwerkt.incheken(kaart01);
                    break;
                case 4:

                    verwerkt.uitchecken(kaart01);
                    break;


                case 5:
                    System.out.println("Fijne dag verder ;)");
                    break;


            }
        }


    }
}

