package entidades;

public abstract class Funcionario {
    int matricula;
    String nome;
    double salario;

       public int getMatricula() {
        return matricula;
    }
      public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
        public String getNome() {
        return nome;
    }
        public void setNome(String nome) {
        this.nome = nome;
    }
        public double getSalario() {
        return salario;
    }
      public void setSalario(double salario) {
        this.salario = salario;
    }
}
