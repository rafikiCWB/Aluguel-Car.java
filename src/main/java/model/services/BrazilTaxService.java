package model.services;

public class BrazilTaxService implements TaxService{
    //utilizado double tipo primitivo pq estou deduzindo que sempre tera um valor aqui; ou seja sempre tera um valor de imposto;
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }

    }
}
