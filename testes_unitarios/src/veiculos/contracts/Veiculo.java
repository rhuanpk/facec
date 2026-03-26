package veiculos.contracts;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected Integer ano;
    protected String cor;

    public Veiculo() {
        marca = "";
        modelo = "";
        ano = 0;
        cor = "";
    }

    public abstract void acelerar();

    public String getMarca() {
        return marca.trim();
    }

    public void setMarca(String marca) throws IllegalArgumentException {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca do veículo não pode ser vazio!");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo.trim();
    }

    public void setModelo(String modelo) throws IllegalArgumentException {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo do veículo não pode ser vazio!");
        }
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        if (ano == null || ano < 0) {
            throw new IllegalArgumentException("Ano do veículo não pode ser menor que zero!");
        }
        this.ano = ano;
    }

    public String getCor() {
        return cor.trim();
    }

    public void setCor(String cor) throws IllegalArgumentException {
        if (cor == null || cor.isBlank()) {
            throw new IllegalArgumentException("Cor do veículo não pode ser vazio!");
        }
        this.cor = cor;
    }
}
