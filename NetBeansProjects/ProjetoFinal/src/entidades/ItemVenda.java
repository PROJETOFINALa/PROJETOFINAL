package entidades;

class ItemVenda {
    private int numero;
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public ItemVenda(int numero, String nome, int quantidade, double precoUnitario) {
        this.numero = numero;
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public double subTotal (){
        return quantidade * precoUnitario;
               
           
    }
      public String tostring(){
          return numero+" "+nome+" R$ "+
                  String.format("%.2f", precoUnitario)+
                  " x "+quantidade+" = R$"+ String.format("%.2f", subTotal());
          }      
}
