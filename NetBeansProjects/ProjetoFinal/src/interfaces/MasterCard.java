package interfaces;

public class MasterCard implements iBandeiraCartao{
    private int setor;
    
    public int getSetor() {
       return setor;
    }
    public void setSetor(int setor) {
        this.setor= setor;
        }
    
    public String verificarBandeira (int setor) {
  if (setor == 51 ||  setor == 52 || setor == 53 || setor == 54 || setor == 55)
            return "====Bandeira Invalida Para Mastercard===";
        else 
            return "Bandeira Confere Para Mastercard";
    }
    }
    
    

