package veiculos;

import veiculos.models.Desmotorizado;
import veiculos.models.motorizeds.Combustao;

public class Main {
    public static void main(String[] args) {
        Combustao carro = new Combustao();

        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setAno(2021);
        carro.setCor("Azul");
        carro.setPotencia(150);
        carro.setCombustivel("Gasolina");

        carro.energizar();
        carro.ligar();
        carro.acelerar();
        carro.desligar();

        Desmotorizado bicicleta = new Desmotorizado();

        bicicleta.setMarca("Caloi");
        bicicleta.setModelo("10");
        bicicleta.setAno(2005);
        bicicleta.setCor("Preto");
        bicicleta.setInstavel(true);

        bicicleta.acelerar();
    }
}
