package br.com.fiap.rwsautonomousvehiclefleet.dto;

public class UserDTO {

    private String name;
    private String cpf;

    public UserDTO() {
    }

    public UserDTO(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
