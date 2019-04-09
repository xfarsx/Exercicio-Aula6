package br.com.digitalhouse;

public class Cliente {
    private String sobrenome;
    private Integer numCli, rg, cpf;

    public Cliente (Integer novoNumCli, String novoSobrenome, Integer novoRg, Integer novoCpf){
        numCli = novoNumCli;
        sobrenome = novoSobrenome;
        rg = novoRg;
        cpf = novoCpf;
    }
    public void setNumCli (Integer novoNumCli){
        numCli = novoNumCli;
    }
    public Integer getNumCli (){
        return numCli;
    }
    public void setSobrenome (String novoSobrenome){
        sobrenome = novoSobrenome;
    }
    public String getSobrenome (){
        return sobrenome;
    }
    public void setRg (Integer novoRg){
        rg = novoRg;
    }
    public Integer getRg (){
        return rg;
    }
    public void setCpf (Integer novoCpf){
        cpf = novoCpf;
    }
    public Integer getCpf (){
        return cpf;
    }
}
