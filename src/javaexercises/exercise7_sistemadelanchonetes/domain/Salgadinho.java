package javaexercises.exercise7_sistemadelanchonetes.domain;

public class Salgadinho extends Item {
    private TipoSalgadinho tipoSalgadinho;
    private String massaSalgadinho;
    private String recheioSalgadinho;


    public Salgadinho(String recheioSalgadinho, String massaSalgadinho, TipoSalgadinho tipoSalgadinho) {
        this.recheioSalgadinho = recheioSalgadinho;
        this.massaSalgadinho = massaSalgadinho;
        this.tipoSalgadinho = tipoSalgadinho;
    }

    public Salgadinho(String recheioSalgadinho, String massaSalgadinho, TipoSalgadinho tipoSalgadinho, double precoVenda, double peso, String dataValidade) {
        super(precoVenda, peso, dataValidade);
        this.recheioSalgadinho = recheioSalgadinho;
        this.massaSalgadinho = massaSalgadinho;
        this.tipoSalgadinho = tipoSalgadinho;
    }

    public String tipoFritura(){
        return tipoSalgadinho.getFritura();
    }

    public TipoSalgadinho getTipoSalgadinho() {
        return tipoSalgadinho;
    }

    public void setTipoSalgadinho(TipoSalgadinho tipoSalgadinho) {
        this.tipoSalgadinho = tipoSalgadinho;
    }

    public String getMassaSalgadinho() {
        return massaSalgadinho;
    }

    public void setMassaSalgadinho(String massaSalgadinho) {
        this.massaSalgadinho = massaSalgadinho;
    }

    public String getRecheioSalgadinho() {
        return recheioSalgadinho;
    }

    public void setRecheioSalgadinho(String recheioSalgadinho) {
        this.recheioSalgadinho = recheioSalgadinho;
    }
}
