package ov;

public class Laadpaal
{
    public void addSaldo(Kaart kaart, double saldo)
    {
        double saldoOud = kaart.getSaldo();
        saldoOud = saldoOud + saldo;

        kaart.setSaldo(saldoOud);

    }

    public void showKaart(Kaart kaart)
    {
        int kaartNummer = kaart.getNummer();
        double kaartSaldo = kaart.getSaldo();
        boolean kaartGeldig = kaart.getGeldig();
        System.out.println("\nWelcome again!");
        System.out.println("\nKaart-Nummer: " + kaartNummer);
        System.out.println("Kaart-Saldo: " + kaartSaldo);
        System.out.println("Kaart-Geldig: " + kaartGeldig +'\n');

    }

}
