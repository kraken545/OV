package ov;

public class Vervoer_type
{
    private double tariefBus = 1.25;
    private double tariefTrein = 1.75;
    private double tariefFiets = 0.75;
    String[] stations = {"Arnhem", "Amsterdam", "Eindhoven", "Den Haag", "Utrecht"};
    int[] km = {13, 10, 14, 15, 17};
    String destination;
    private boolean x = false;


    public void showStations(Kaart kaart)
    {
        if (kaart.getSaldo() < 10)
        {
            System.out.println("Niet genoeg saldo om te reizen!!!");
            return;
        }
        else
        {

            if (!kaart.getIngechecked())

            {
                setX(true);

                System.out.println("\n ==== Your'e Current Location is Nijmegen! ==== \n");
                int x = 0;
                while (x < stations.length)
                {
                    int a = x + 1;
                    System.out.println(a + ". " + stations[x]);

                    x++;
                }
                System.out.println("\n== Waar moet je heen!? ==\n");
            }
            else

            {
                System.out.println("u bent al ingecheked :|");
                return;
            }
            return;
        }
    }

    public void getchoose(int stationeind)
    {
        if (!getX())
        {
            switch (stationeind)
            {
                case 1:
                    this.destination = stations[0];
                    break;

                case 2:
                    this.destination = stations[1];
                    break;

                case 3:
                    this.destination = stations[2];
                    break;
                case 4:
                    this.destination = stations[3];
                    break;
                case 5:
                    this.destination = stations[4];
                    break;

            }
        }
        else
        {
            return;
        }
    }


    public void getStation(Kaart kaart)
    {
        int keuze = kaart.getDestination();

        switch (keuze)
        {
            case 0:
                reken(kaart, 0);
                break;

            case 1:

                reken(kaart, 1);
                break;

            case 2:

                reken(kaart, 2);
                break;


            case 3:

                reken(kaart, 3);
                break;


            case 4:
                reken(kaart, 4);
                break;
        }

    }

    public void reken(Kaart kaart, int x)
    {
        double kilometers = this.km[x];
        double tarif = this.tariefFiets;
        double bedragte = kilometers * tarif;
        kaart.setBedrag(bedragte);
    }


    public double getBus()
    {
        return this.tariefBus;
    }

    public double getFiets()
    {
        return this.tariefFiets;
    }

    public double getTrein()
    {
        return this.tariefTrein;
    }

    public boolean getX()
    {
        return this.x;
    }

    public void setX(boolean x)
    {
        this.x = x;
    }

}

