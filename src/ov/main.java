package ov;

import java.util.Scanner;


public class main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        kaart kaart01 = new kaart();
        paal paal01 = new paal();
        int keuze = 0;


        while (keuze != 4)


        {
            System.out.println("Selecterd een van de volgende opties:");
            System.out.println("1. saldo toevoegen");
            System.out.println("2. Inchecken");
            System.out.println("3. Uitchecken");
            System.out.println("4. EXIT");
            keuze = input.nextInt();





            switch (keuze)
            {
                case 1:
                    System.out.println("hoeveel euro wilt u toevegen");
                    kaart01.addSaldo(input.nextDouble());
                    break;
                case 2:
                    kaart01.inchecked();
                    break;
                case 3:

                    kaart01.uitchecken();
                    break;

                case 4:
                    break;


            }
        }





    }
}

