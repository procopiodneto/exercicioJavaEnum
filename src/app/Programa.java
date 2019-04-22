package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.Produto;
import entidades.SepararItem;
import entidades.enums.EstadoPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in) ;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
		
		System.out.println("Entre com a informação do cliente:") ;
		System.out.print("Nome: ");
		String nome = sc.nextLine() ;
		System.out.print("Email: ") ;
		String email = sc.nextLine() ;
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataNasc = sdf.parse(sc.next()) ;
		Cliente cliente = new Cliente(nome, email, dataNasc) ;
		
		System.out.println("Entre com a informação do pedido:") ;
		System.out.print("Estado: ") ;
		EstadoPedido estado = EstadoPedido.valueOf(sc.next()) ;
		System.out.print("Quantos itens nesse pedido?") ;
		int n = sc.nextInt() ;
		Pedido pedido = new Pedido(new Date(), estado, cliente) ;
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Entre com a informação do item #" + i + ":");
			System.out.print("Nome do produto: ") ;
			sc.nextLine() ;
			String nomeP = sc.nextLine() ;
			System.out.print("Preço do produto: ") ;
			double preco = sc.nextDouble() ;
			System.out.print("Quantidade: ") ;
			int quantidade = sc.nextInt() ;
			Produto produto = new Produto(nomeP, preco) ;
			SepararItem item = new SepararItem(quantidade, preco, produto) ;
			pedido.adcItem(item) ;
		}
		
		System.out.println() ;
		System.out.println("Sumário do pedido:") ;
		System.out.println(pedido) ;
		
		sc.close() ;
		
	}

}
