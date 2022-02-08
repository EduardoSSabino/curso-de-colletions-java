package br.com.treinaweb.java.collections.models;

public class Pessoa implements Comparable<Pessoa> { // classe Pessoa que implementa Comparable

	private int id; // atributos da classe
	private String nome;

	public Pessoa(int id, String nome) { // metodo construtor da classe
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() { // metodo da classe

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override // sobre-escrevendo o metodo toString
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}

	@Override // sobre-escrevendo o metodo hashcode
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override // sobre-escrevndo o metodo equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override // sobre-esvrendo o metodo compareTo
	public int compareTo(Pessoa o) {
		// 0: os objetos são considerados "iguais"
		if (this.getId() == o.getId()) {
			return 0;
		}
		// < 0: a instância é considerada "menor" do que o argumento
		if (this.getId() < o.getId()) {
			return -1;
		}
		// > 0: a instância é considerada "maior" do que o argumento
		return 1;
	}

}
