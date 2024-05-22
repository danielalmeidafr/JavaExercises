package javaexercises.exercise7_sistemadelanchonetes.domain;

public class Lanche extends Item {
    private String tipoPao;
    private String recheioLanche;
    private String molhoLanche;

    public Lanche(String tipoPao, String recheioLanche, String molhoLanche) {
        this.tipoPao = tipoPao;
        this.recheioLanche = recheioLanche;
        this.molhoLanche = molhoLanche;
    }

    public Lanche(String tipoPao, String recheioLanche, String molhoLanche, double precoVenda, double peso, String dataValidade) {
        super(precoVenda, peso, dataValidade);
        this.tipoPao = tipoPao;
        this.recheioLanche = recheioLanche;
        this.molhoLanche = molhoLanche;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public String getRecheioLanche() {
        return recheioLanche;
    }

    public void setRecheioLanche(String recheioLanche) {
        this.recheioLanche = recheioLanche;
    }

    public String getMolhoLanche() {
        return molhoLanche;
    }

    public void setMolhoLanche(String molhoLanche) {
        this.molhoLanche = molhoLanche;
    }
}
