package ov;


public class Paal
{
    private double instaptarief = 10.0;


    public void showOptions()
    {
        System.out.println("=============================================");
        System.out.println("||| Selecterd een van de volgende opties: |||");
        System.out.println("=============================================");
        System.out.println("|||                                       |||");
        System.out.println("|||        1. saldo toevoegen             |||");
        System.out.println("|||        2. Saldo Bekijken              |||");
        System.out.println("|||        3. Inchecken                   |||");
        System.out.println("|||        4. Uitchecken                  |||");
        System.out.println("|||        5. EXIT                        |||");
        System.out.println("|||                                       |||");
        System.out.println("=============================================");
        System.out.println("=============================================");
        return;
    }

    public void incheken(Kaart kaart)
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
        else if (kaart.getSaldo() < 10)
        {
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

    public void uitchecken(Kaart kaart)

    {
        if (!kaart.getIngechecked())
        {
            System.out.println("u bent al uitgecheked :|, gebruik onze vervoermiddelen nooit meer aub! ");
        }
        else
        {
            double saldo = kaart.getSaldo();
            double bedrag = kaart.getBedrag();
            saldo = saldo + instaptarief - bedrag;

            System.out.println("Fijne dag verder, hoop u nooit meer te zien ;)");
            kaart.setIngechecked(false);
            kaart.setSaldo(saldo);
            double bekijk = kaart.getSaldo();
            int nummer = kaart.getNummer();
            System.out.println("\nWelcome again!");
            System.out.println("\nreiskosten: € " + bedrag);
            System.out.println("\nKaart-Nummer: " + nummer);
            System.out.println("huidig saldo: € " + bekijk + "\n");

        }
    }

//    public void readKaart(kaart kaart, double saldo, boolean ingechecked, String nummer, boolean geldig)
//    {
//        kaart.setSaldo(saldo);
//        kaart.setIngechecked(ingechecked);
//        kaart.setKaartnummer(nummer);
//        kaart.setGelding(geldig);
//        return;
//    }

//    public void readKaart(Kaart kaart, double saldo, String nummer, boolean ingechecked, boolean geldig)
//    {
//        System.out.println("kaart_saldo?!");
//        kaart.setSaldo(saldo);
//        System.out.println("kaart_is_ingecheked?!");
//        kaart.setIngechecked(ingechecked);
//        System.out.println("kaart_nummer?");
//        kaart.setKaartnummer(nummer);
//        System.out.println("kaart_is_geldig?");
//        kaart.setGelding(geldig);
//
//
//    }

}



