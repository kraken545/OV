package ov;

import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Paal verwerkt = new Paal();
        Kaart kaart01 = new Kaart();
        Laadpaal laadpaal = new Laadpaal();
        Vervoer_type vervoer = new Vervoer_type();


        int keuze = 0;


//      verwerkt.readKaart(kaart01, input.nextDouble(), input.next(), input.nextBoolean(), input.nextBoolean());


        while (keuze != 5)

        {

            verwerkt.showOptions();
            keuze = input.nextInt();


            switch (keuze)
            {
                case 1:
                    System.out.println("hoeveel euro wilt u toevegen");
                    laadpaal.addSaldo(kaart01, input.nextDouble());
                    break;

                case 2:
                    System.out.println("huidig saldo: €" + kaart01.getSaldo());

                    break;


                case 3:
                    vervoer.showStations();
                    vervoer.getchoose(input.nextInt());
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

