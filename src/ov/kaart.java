package ov;

public class kaart
{
    private double saldo = 10.0;
    private boolean geldig = true;
    private String nummer = "724659826735";
    private boolean ingechecked = false;


    public void addSaldo(double saldo)
    {
        System.out.println("oude saldo: "+ this.saldo);
        saldo = this.saldo + saldo;
        System.out.println("nieuwe saldo: "+ saldo);

    }



    public String getNummer()
    {
        return nummer;
    }

    public void nietMeerGeldig()
    {
        this.geldig = false;
    }

    public boolean getGeldig()
    {
        return geldig;
    }

    public void inchecked()
    {
        this.ingechecked = true;
        System.out.println("Welcome je bent ingecheckd");
    }

    public void uitchecken()
    {
        System.out.println("Fijne dag verder, hoop u nooit meer te zien ;)");
        this.ingechecked = false;
    }
}