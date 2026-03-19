package ov;

public class ladpaal
{
    public void addSaldo(kaart kaart, double saldo)
    {
        double saldoOud = kaart.getSaldo();
        saldoOud = saldoOud + saldo;

        kaart.setSaldo(saldoOud);

    }

}
