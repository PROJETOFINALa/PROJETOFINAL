package entidades;

public class caixa extends Funcionario {
    public caixa(int matricula, String nome, double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        }
    public double calcularSalario(double proventos, double descontos) {
        return (salario + proventos - descontos);
         }
    public String toString(){
        StringBuilder sc = new StringBuilder();
        sc.append("==================");
        sc.append("DADOS PARA O CAIXA");
        sc.append("==================");
        sc.append("MATRICULA: "+matricula+"\n");
        sc.append("NOME; "+nome+"\n");
        sc.append("SALARIO BASE; "+String.format("%2.f",salario));
        return sc.toString();
                     
                
    }
    
            
    
}
