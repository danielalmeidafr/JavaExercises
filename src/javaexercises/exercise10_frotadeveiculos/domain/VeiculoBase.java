package javaexercises.exercise10_frotadeveiculos.domain;

public abstract class VeiculoBase implements Veiculo{
    protected String placa;
    protected String marca;
    protected String modelo;
    protected TipoCombustivel tipoCombustivel;

    public VeiculoBase(String placa, String marca, String modelo, TipoCombustivel tipoCombustivel) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

}
