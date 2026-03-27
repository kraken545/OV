package ov;

public class Kaart
{
    private double saldo;
    private boolean geldig;
    private String nummer;
    private boolean ingechecked;


    public Kaart()
    {
        saldo =0;
        geldig = true;
    }


    public double getSaldo()
    {


        return saldo;

    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }


    public String getNummer()
    {

        return nummer;
    }

    public void setKaartnummer(String nummer)
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
}




