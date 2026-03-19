package ov;
import java.util.Scanner;
public class paal
{
    private double instaptarief = 10.0;
    Scanner input = new Scanner(System.in);

public void showOptions(){
    System.out.println("=============================================");
    System.out.println("||| Selecterd een van de volgende opties: |||");
    System.out.println("=============================================");
    System.out.println("|||                                       |||");
    System.out.println("|||        1. saldo toevoegen             |||");
    System.out.println("|||        2. Saldo Bekijken              |||");
    System.out.println("|||        3. Inchecken                   |||" );
    System.out.println("|||        4. Uitchecken                  |||");
    System.out.println("|||        5. EXIT                        |||");
    System.out.println("|||                                       |||");
    System.out.println("=============================================");
    System.out.println("=============================================");
    return;
}
    public void incheken(kaart kaart)
    {
        double saldo = kaart.getSaldo();

        if (kaart.getGeldig() == false)
        {
            System.out.println("Je pas is niet geldig!");
            return;
        }
        else if (kaart.getIngechecked() == true)
        {
            System.out.println("Je bent al ingechecked!");
            return;
        }
        else
        {
            saldo = saldo - this.instaptarief;
            kaart.setIngechecked(true);
            System.out.println("Welcome je bent ingecheckd");
            kaart.setSaldo(saldo);
        }
    }

    public void uitchecken(kaart kaart)

    {
        if(kaart.getIngechecked() == false)
        {
            System.out.println("u bent al uitgecheked :|, gebruik onze vervoermiddelen nooit meer aub! ");
        }else
        {
            double saldo = kaart.getSaldo();

            saldo = saldo + instaptarief;
            System.out.println("Fijne dag verder, hoop u nooit meer te zien ;)");
            kaart.setIngechecked(false);
            kaart.setSaldo(saldo);

        }
    }
    public void readKaart(kaart kaart, double saldo, boolean ingechecked, String nummer, boolean geldig){
        kaart.setSaldo(saldo);
        kaart.setIngechecked(ingechecked);
        kaart.setKaartnummer(nummer);
        kaart.setGelding(geldig);
return;
    }

}



