package App;

public class Usuarios {
	
	private int codigo;
	private String nome;
	private String senha;
	
	public Usuarios() {
	}
	
	public Usuarios(int codigo, String nome, String senha) {
		this.codigo = codigo;
		this.nome = nome;
		this.senha = senha;
	}
	
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
