/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Contato {

    private String nomeCompleto = "";
    private Telefone telefone = null;
    private String email = "";
    private Endereco endereco = null;

    public Contato() {
    }
    public Contato(String nomeCompleto, Telefone telefone, String email, Endereco endereco) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    public String getNomeCompleto() {
            return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public Telefone getTelefone() {
        return telefone;
    }
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
            return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Contato{" + "nomeCompleto=" + nomeCompleto + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco.toString() + '}';
    }
}
    


