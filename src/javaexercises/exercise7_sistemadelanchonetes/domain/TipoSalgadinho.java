package javaexercises.exercise7_sistemadelanchonetes.domain;

public enum TipoSalgadinho {
    FRITO("Frito"),
    ASSADO("Assado");
    private String fritura;

    TipoSalgadinho(String fritura){
        this.fritura = fritura;
    }

    public String getFritura() {
        return fritura;
    }
}
