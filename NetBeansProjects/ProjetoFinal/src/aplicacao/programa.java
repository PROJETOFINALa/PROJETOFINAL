package aplicacao;

import entidades.Gerente;
import entidades.Venda;
import entidades.caixa;
import enumerados.StatusVenda;
import enumerados.TipoPagamento;
import interfaces.MasterCard;
import interfaces.Visa;
import static java.rmi.server.LogStream.log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class programa {

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static SimpleDateFormat sdfh = new SimpleDateFormat("dd/MM/yyyy 'as' HH:mm:ss");
    static Scanner sc;
    static int matricula = 1;
    static String nome = "";
    static double salario = 0.0;
    static double proventos = 0.0;
    static double desconto = 0.0;
    static double comissao = 0.0;
    static String Log = "";

    public static void main(String[] args) throws ParseException {
        sc = new Scanner(System.in);
        double descontos = 0;
        int op = 0;
            menu();
            System.out.println("INFORMAR A OPÇÃO DESEJADA");
            op = sc.nextInt();
            if (op < 1 || op > 6) {
                System.out.println("OPÇÃO INVALIDA");
            }
        do {
            if (op == 1) {
                log("=== ACESSOU A OPÇÃO Nº1 (REALIZAR VENDA)");
                StatusVenda statusVenda = StatusVenda.vaLueOF("INICIANDO");
                log("ESTADO == iNICIANDO VENDA");
                int numeroVend = 0;
                System.out.println("NÚMERO DA VENDA:   ");
                int numeroVenda = sc.nextInt();
                System.out.println("========================");
                System.out.println("DATA DA VENDA:   ");
                Date data = sdfh.parse(sc.next());

                TipoPagamento tipoPagamento;
                System.out.println("TIPO DE PAGAMENTO (1)DINHEIRO; (2)VISTA; (3)CREDITO; (4)DEBITO; (5)CHEQUE");
                int tipo = sc.nextInt();
            
                while (true) {
                    if (tipo == 1) {
                        tipoPagamento = TipoPagamento.valueOf("DINHEIRO");
                        break;
                    } else if (tipo == 2) {
                        tipoPagamento = TipoPagamento.valueOf("VISTA");
                        break;
                    } else if (tipo == 3) {
                        tipoPagamento = TipoPagamento.valueOf("CREDITO");
                        break;
                    } else if (tipo == 4) {
                        tipoPagamento = TipoPagamento.valueOf("DEBITO");
                        break;
                    } else if (tipo == 5) {
                        tipoPagamento = TipoPagamento.valueOf("CHEQUE");
                        break;
                    } else {
                        System.out.println("OPÇÃO INVALIDA");
                        continue;
                    }
                }
            
                log("informou tipo de pagamento " + tipoPagamento);
                Venda venda = new Venda(numeroVenda, data, statusVenda, tipoPagamento);

                System.out.print("INFORME OS ITENS (-1 FINALIZA)");
                int numeroItem = 1;
                while (true) {
                    System.out.println("\nPRODUTO NÚMERO:  " + numeroItem);
                    System.out.println("===================================");
                    System.out.print("QUANTIDADE: ");
                    int quantidade = sc.nextInt();
                    if (quantidade == -1) {
                        break;
                    }

                    System.out.print("PREÇO UNITÁRIO:");
                    double precoUnitario = sc.nextDouble();
                    System.out.println("-------------------------------------");
                    System.out.println("NOME DO PRODUTO:  ");
                    String nome = sc.next();

                    ItemVenda iv = new ItemVenda(numeroItem, nome, quantidade, precoUnitario);
                    venda.adicionarItem(iv);

                    statusVenda = StatusVenda.vaLueOF("PROCESSANDO");
                    venda.setStatusVenda(statusVenda);
                    log("ESTADO---PROCESSANDO VENDA");

                    numeroItem++; //CONTADOR
                }
                System.out.println("");
                System.out.println("========================");
                System.out.println("DADOS DA VENDA");
                System.out.println("========================");
                statusVenda = StatusVenda.valueOf("IMPRIMINDO");
                venda.setStatusVenda(statusVenda);
                log("ESTADO--- IMPRIMINDO A VENDA");
                System.out.println(venda.toString());
                statusVenda = StatusVenda.vaLueOF("Finalizando");
                log("ESTADO -- FINALIZANDO A VENDA");
                venda.setStatusVenda(statusVenda);
            }
            if (op == 2) {
                log("---ACESSOU A OPÇÃO DE Nº2(MOSTRAR SALÁRIO DOS FUNCIONÁRIOS");
                System.out.println("MATRICULA DA OPERADORA DE CAIXA:");
                matricula = sc.nextInt();
                System.out.println("INFORME O NOME DA OPERADORA DE CAIXA:");
                nome = sc.next();
                System.out.println("INFORME O SALÁRIO BASE DA OPERADORA:");
                salario = sc.nextDouble();
                caixa cx = new caixa(matricula, nome, salario);

                System.out.println("INFORME O VALOR DOS PROVENTOS DO CAIXA:");
                proventos = sc.nextDouble();
                System.out.println("INFORME O VALOR DOS DESCONTOS DO CAIXA:");
                descontos = sc.nextDouble();

                System.out.println(cx.toString());
                //System.out.println("SALÁRIO FINAL: %.2f", cx.calcularSalario(proventos, desconto));
                System.out.println("\n-------------------------------------");
                log("MOSTROU DADOS DO SALÁRIO DO CAIXA" + nome);

                          //GERENTE
                //Gerente ge = new gerente(matricula, nome, salario);
                System.out.println("INFORME A MATRICULA DO GERENTE:");
                matricula = sc.nextInt();
                System.out.println("INFORME O NOME DO GERENTE:");
                nome = sc.next();
                System.out.println("INFORME O SALÁRIO BASE DO GERENTE:");
                salario = sc.nextDouble();
                Gerente ge = new Gerente(matricula, nome, salario);

                System.out.println("INFORME O VALOR DOS PROVENTOS PARA O GERENTE:");
                proventos = sc.nextDouble();
                System.out.println("INFORME O VALOR DOS DESCONTOS PARA O GERENTE:");
                descontos = sc.nextDouble();
                System.out.println("INFORME O VALOR DA COMISSÃO PARA O GERENTE");
                comissao = sc.nextDouble();
            }
            if (op == 3) {
                log("---ACESSOU A OPÇÃO DE Nº3 (VERIFICAR BANDEIRA DO CARTÃO)");
                while (true) {
                    char opcao;
                    System.out.println("INFORME O TIPO DE CARTÃO:");
                    System.out.println("(V) VISA/ (M) MASTERCARD/ (F) FINALIZAR;");
                    opcao = sc.next().toLowerCase().charAt(0);
                    if (opcao == 'v') {
                        Visa vi = new Visa();
                        System.out.println("IFORME O SETOR PARA O CARTÃO VISA");
                        vi.setSetor(sc.nextInt());
                        System.out.println(vi.verificarBandeira(vi.getSetor()));
                        log("VERIFICOU CARTÃO VISA");
                    } else if (opcao == 'm') {
                        MasterCard ma = new MasterCard();
                        System.out.println("INFORME O SETOR PARA O CARTÃO MASTERCARD");
                        ma.setSetor(sc.nextInt());
                        System.out.println(ma.verificarBandeira(ma.getSetor()));
                        log("VERIFICOU CARTÃO MASTERCARD");
                    } else {
                        break;
                    }
                }
            }
            if (op == 4) {
                log("---ACESSOU A OPÇÃO DE Nº4(INFORMAÇÕES SOBRE O PROGRAMA");
                sobre();
            }
            while (op != 5);{
                System.out.println("*****PROGRAMA FINALIZADO*****");
                log("fINALIZOU PROGRAMA.");
                        sc.close();
            System.out.println("\n\n\n+log");
        }
        
        



   

    private static void menu() {
        String menu = "\nMENU DE OPÇÕES\n" + "\n1 - Realizar Venda, EMITIR CUPOM FISCAL "
                + "\n2- MOSTRAR SALÁRIOS DOS FUNCIONÁRIOS" + "\n3 VERIFICAR BANDEIRA DO CARTÃO"
                + "\n4 - SOBRE O PROGRAMA" + "\n5 - SAIR";
        System.out.println(menu);

    }

    private static void sobre() {
        System.out.println("");
        System.out.println("+========================================+");
        System.out.println("|           SOBRE O PROGRAMA             |");
        System.out.println("+========================================+");
        System.out.println("|           BYTA BUG LTDA                |");
        System.out.println("| CLIENTE: SUPERMERCADOS BIG             |");
        System.out.println("| VERSÃO 1.0                             |");
        System.out.println("| GERENTE DE PROJETOS: DAMASO SILVA      |");
        System.out.println("| ANALISTA DE SISTEMAS: ABRAÃO VIEIRA    |");
        System.out.println("|PROGRAMADORES: LUCAS LODI, ARTHUR OTERO |");
        System.out.println("| LUCAS CEOLIN, MARCELO WILLIAN          |");
        System.out.println("|                                        |");
        System.out.println("+========================================+");
        System.out.println("|CONTATO: (31)989873498                  |");
        System.out.println("|   WWW.BYTABUGLTDA.COM.BR               |");
        System.out.println("+-=======================================+");
    }
