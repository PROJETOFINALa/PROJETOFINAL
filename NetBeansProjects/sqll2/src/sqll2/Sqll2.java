/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqll2;

/**
 *
 * @author damas
 */
public class Sqll2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p01 = new Pessoa();
        p01.setNome("Fulano");
        p01.setEndereco("Rua ABC, 123");
        p01.setTelefone(999999999);
        System.out.println(p01.exibir());
        p01.setNome("Fulana de Tal");
        System.out.println(p01.exibir());
        
        PessoaFisica pf01 = new PessoaFisica();
        pf01.setCpf("12345678910");
        pf01.setNome("Beltrano");
        System.out.println(pf01.exibirPf());
    }
    
}
===============================
package mod_poo_pessoas;

/** * @author thiers */
public class Pessoa {
    //definição de atributos
    private String nome;
    private String endereco;
    private int telefone;
    
    //Metodo Construtor de Inicialização
    public Pessoa(){
        nome = "";
        endereco = "";
        telefone = 0;
    }

    /**     * @return the nome     */
    public String getNome() {
        return nome;
    }

    /**     * @param nome the nome to set     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**     * @return the endereco     */
    public String getEndereco() {
        return endereco;
    }

    }
      private String cpf;
    private String rg;
    
    //metodo construtor de inicialização
    public PessoaFisica (){
        super();
        cpf="";
        rg="";
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }
public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**     * @return the rg     */
    public String getRg() {
        return rg;
    }

    /**     * @param rg the rg to set     */
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    //Metodo para retornar String com valores PF
    public String exibirPf(){
        return "Nome: " + this.getNome()
                +"\nEndereço: " + this.getEndereco()
                +"\nTelefone: " + this.getTelefone()
                +"\nCPF: " + this.getCpf()
                +"\nRG: " + this.getRg();
    }

}
