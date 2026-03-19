package ov;

public class kaart
{
    private double saldo;
    private boolean geldig;
    private String nummer;
    private boolean ingechecked;


//    paal paal01 = new paal();

    public double getSaldo()
    {

        saldo = this.saldo;
        return saldo;

    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }


    public String getNummer()
    {
        String kaartnummer = this.nummer;
        return kaartnummer;
    }

    public void setKaartnummer(String x)
    {
        this.nummer = x;
    }

    public boolean getGeldig()
    {
        geldig = this.geldig;
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




