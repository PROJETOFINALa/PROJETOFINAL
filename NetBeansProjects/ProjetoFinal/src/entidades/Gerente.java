package entidades;

public class Gerente extends Funcionario {
        public Gerente(){
        }
        
public Gerente (int matricula, String nome, double salario){
    this.matricula = matricula;
    this.nome = nome;
    this.salario = salario;
}        
public double calcularSlario (double proventos, double comissao, double descontos){
    return (salario + proventos + comissao - descontos);
}
@Override //usado para o metodo tostring
public String toString(){
    StringBuilder sc = new StringBuilder();
    sc.append("=====================");
    sc.append("DADOS PARA O GERENTE");
    sc.append("=====================");
    sc.append("MATRICULA:  "+matricula+"\n");
    sc.append("NOME; "+nome+"\n");
    sc.append("SALARIO BASE: "+String.format("%.2f",salario));
    return sc.toString();
}
}

