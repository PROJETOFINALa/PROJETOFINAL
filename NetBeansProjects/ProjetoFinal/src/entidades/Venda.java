package entidades;

import enumerados.StatusVenda;
import enumerados.TipoPagamento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class Venda {
    private Integer numero;
    private Date data;        
    private StatusVenda statusVenda;
    private TipoPagamento tipoPagamento;
    
       private SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy hh:mm");
       private List<ItemVenda> itens = new ArrayList<>();        
       
       public Venda(){
       }
       
       public Venda(Integer numero, Date data,StatusVenda statusVenda, TipoPagamento tipoPagamento){
           super();
           this.numero         = numero;
           this.data           = data;
           this.statusVenda    = statusVenda;
           this.tipoPagamento  = tipoPagamento;
           this.itens          = itens;
            }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusVenda getStatusVenda() {
        return statusVenda;
    }
      public void setStatusVenda(StatusVenda statusVenda) {
        this.statusVenda = statusVenda;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

        public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
   
    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
    public void adicionarItem(ItemVenda item){
        itens.add(item);
        }
    public void removerItem(ItemVenda item){
        itens.add(item);
        }
    public double total(){
        double soma = 0.0;
        for (ItemVenda item : itens){
            soma += item.subTotal();
            }
    return soma;
    }
       public String toString(){
           StringBuilder sc = new StringBuilder();
           sc.append("Data do Pedido: ");
           sc.append(sdf.format(data)+"\n");
           sc.append("Status Do Pedido: ");
           sc.append(statusVenda + "\n");
           sc.append("TipoPagamento ");
           sc.append(tipoPagamento + "\n");
           sc.append("============================");
           sc.append("ITENS DA VENDA\n");
           sc.append("============================");
           sc.append("");
           for (ItemVenda item : itens) {
               sc.append(item+"\n");
               }
           sc.append("============================\n");
           sc.append("Total da Venda----------: R$:");
           sc.append(String.format("%.2f",total()));
           return sc.toString();
           
       }
}
