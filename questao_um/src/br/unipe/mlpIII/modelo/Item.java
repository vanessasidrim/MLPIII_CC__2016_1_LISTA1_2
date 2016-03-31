package br.unipe.mlpIII.modelo;

public class Item implements Comparable<Item>{
	
	protected int codigo;
	protected String descricao;

	public Item(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String toString() {
		return "Item [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

	public int compareTo(Item item) {
		if(this.codigo > item.codigo){
			return -1;
		}
		
		if(this.codigo < item.codigo){
			return 1; 
		}
		return 0;
	}
	
	

}
