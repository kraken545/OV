package ov;

public class Vervoer_type
{
    private double tariefBus = 5;
    private double tariefTrein = 3;
    private double tariefFiets = 2;
    String[] stations = {"Arnhem", "Amsterdam", "Eindhoven", "Den Haag", "Utrecht"};
    int[] km = {13, 10, 14, 15, 17};
    double bedrag;
    String destination;

    public void showStations()
    {

        System.out.println("\n ==== Your'e Current Location is Nijmegen! ==== \n");
        int x = 0;
        while (x < stations.length)
        {
            int a = x + 1;
            System.out.println(a + ". " + stations[x]);

            x++;
        }
        System.out.println("\n== Waar moet je heen ==!?\n");
    }

    public void getchoose(int stationeind)
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

    public double getStation(String x)
    {


        if (x == stations[0])
        {
            double kilometers = this.km[0];
            double tarif = this.tariefBus;
            double bedragte = kilometers * tarif;
            this.bedrag = bedragte;
            return bedragte;
        }
        else if (x == stations[1])
        {
            double kilometers = this.km[1];
            double tarif = this.tariefFiets;
            double bedragte = kilometers * tarif;
            this.bedrag = bedragte;

        }
        return bedrag;
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


}

