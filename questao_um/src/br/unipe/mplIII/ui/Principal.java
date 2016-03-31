package br.unipe.mplIII.ui;
import java.util.ArrayList;
import java.util.List;

import br.unipe.mlpIII.modelo.Inventario;
import br.unipe.mlpIII.modelo.Item;

public class Principal {
	public static void main(String[] args) {
		
		List<Item> listaItens = new ArrayList<>();
		
		listaItens.add(new Item(456, "Arroz"));
		listaItens.add(new Item(123, "Feijão"));
		listaItens.add(new Item(789, "Macarrão"));


		Inventario estoque = new Inventario(listaItens);
	
		estoque.ordenar();
		
		System.out.println(estoque);
		
	}

}
