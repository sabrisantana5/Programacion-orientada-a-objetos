public class Libros
{
	private String titulo;
	private String autor;
	private int nopag;


	public Libros(String titulo, String autor, int nopag)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.nopag = nopag;
	}

	public String getTitulo(){return titulo;}
	public String getAutor(){return autor;}
	public int getNopag(){return nopag;}

}