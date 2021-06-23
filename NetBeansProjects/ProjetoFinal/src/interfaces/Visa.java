package interfaces;

public class Visa implements iBandeiraCartao{
    private int setor;
    
    public int getSetor() {
       return setor;
    }
    public void setSetor(int setor) {
        this.setor= setor;
        }
    
    public String verificarBandeira (int setor) {
    if (setor == 4)
        return "Bandeira Confere VISA";
    else
        return "===Bandeira Inválida Para VISA===";
    }
}