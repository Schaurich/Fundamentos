
package App;

import Codigo.Banco;
import Codigo.Caixa;
import Codigo.Cliente;


public class Main {

   
    public static void main(String[] args) {
        System.out.println("Criando Banco");
        Banco banco = new Banco();
        System.out.println("Adicionando Caixas");
       banco.addCaixas(9);
        
       banco.cadastrar("Kim",66);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Franco", 21);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Paulo", 65);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Paula", 19);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Joana", 70);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Fernanda", 30);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Afonço", 27);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Bruno", 80);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Camila", 90);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Sandro", 10);
       System.out.println("Adicionando cliente");
       banco.cadastrar("Sandra", 100);
       
       
       
       banco.getClientes();
       
       
       banco.proximoCliente();
        System.out.println("caixa 1");
        System.out.println(" ");
        System.out.println(" ");
       banco.proximoCliente();
       System.out.println("Caixa 2");
        System.out.println(" ");
        System.out.println(" ");
       banco.proximoCliente();
       System.out.println("caixa 3");
        System.out.println(" ");
        System.out.println(" ");
       banco.proximoCliente();
       System.out.println("caixa 4");
        System.out.println(" ");
        System.out.println(" ");
        banco.proximoCliente();
       System.out.println("caixa 5");
        System.out.println(" ");
        System.out.println(" ");
        banco.proximoCliente();
       System.out.println("caixa 6");
        System.out.println(" ");
        System.out.println(" ");
        banco.proximoCliente();
       System.out.println("caixa 7");
        System.out.println(" ");
        System.out.println(" ");
        banco.proximoCliente();
       System.out.println("caixa 1");
        System.out.println(" ");
        System.out.println(" ");
        banco.proximoCliente();
       System.out.println("caixa 2");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("caixa 3");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("caixa 4");
        System.out.println(" ");
        System.out.println(" ");
       banco.getClientes();
       
       
       
    }
    
    }
    
    
    

