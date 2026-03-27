package ov;

public class Laadpaal
{
    public void addSaldo(Kaart kaart, double saldo)
    {
        double saldoOud = kaart.getSaldo();
        saldoOud = saldoOud + saldo;

        kaart.setSaldo(saldoOud);

    }

}
