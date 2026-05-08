package ov;

public class Kaart
{
    private double saldo;
    private boolean geldig;
    private int nummer;
    private boolean ingechecked;
    private static int laatste = 4890;
    private static int staart= 4584;
    private double bedrag;
    private int destination;

    public Kaart()
    {
        staart++;
        laatste++;
        saldo = 0;
        geldig = true;
        nummer = staart*100000 + laatste;

    }


    public double getSaldo()
    {


        return saldo;

    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }


    public int getNummer()
    {

        return nummer;
    }

    public void setKaartnummer(int nummer)
    {
        this.nummer = nummer;
    }

    public boolean getGeldig()
    {

        return geldig;
    }

    public void setGelding(boolean x)
    {
        this.geldig = x;
    }

    public boolean getIngechecked()
    {

        return this.ingechecked;
    }

    public void setIngechecked(boolean status)
    {
        this.ingechecked = status;
    }

    public double getBedrag()
    {
        return this.bedrag;
    }
    public void setBedrag(double bedrag)
    {
        this.bedrag = bedrag;
    }
    public int getDestination()
    {
        return this.destination;
    }
    public void setDestination(int destination)
    {
        this.destination = destination;
    }
}




