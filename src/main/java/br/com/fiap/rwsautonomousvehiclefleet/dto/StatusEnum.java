package br.com.fiap.rwsautonomousvehiclefleet.dto;

public enum StatusEnum {

    EM_ANALISE(1),
    CANCELADO(2),
    EM_CURSO(3),
    FINALIZADO(4);

    private final int status;

    StatusEnum(int status){
        this.status = status;
    }

    public int getValor(){
        return status;
    }
}
