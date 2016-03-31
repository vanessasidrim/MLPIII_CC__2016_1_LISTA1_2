package br.unipe.mlpIII.modelo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario {
	
	List<Item> listaItens = new ArrayList<>();
	
	public Inventario(List<Item> listaItens) {
		this.listaItens = listaItens;
	}
	public void ordenar(){
		Collections.sort(listaItens);
	}

	public List<Item> getListaItens() {
		return listaItens;
	}

	public void setListaItens(List<Item> listaItens) {
		this.listaItens = listaItens;
	}

	@Override
	public String toString() {
		return "Inventario [listaItens=" + listaItens + "]";
	}
	
	

}
