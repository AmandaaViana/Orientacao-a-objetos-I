public class Aluno {
	
	private String nome;
	private String matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	private float nota4;
	
	//metodo getter, serve pr retornar o valor de um atributo
	public String getNome(){
		return this.nome;
		//this faz referencia a um atributo ou metodo declarado no escopo da classe
		};
		
	//metodo setter, serve pr atribuir valor a um atributo
	public void setNome(String n){
		this.nome = n;
		};
		
	public String getMatricula(){
		return this.matricula;
		};
	public void setMatricula(String m){
		this.matricula = m;
		};
		
	public float getNota1(){
		return this.Nota1;
		};
	public void setNota1(float n1){
		this.Nota1 = n1;
		};
		
	public float getNota2(){
		return this.Nota2;
		};
	public void setNota2(float n2){
		this.Nota2 = n2;
		};
	
	public float getNota3(){
		return this.Nota3;
		};
	public void setNota3(float n3){
		this.Nota3 = n3;
		};
	
	public float getNota4(){
		return this.Nota4;
		};
	public void setNota4(float n4){
		this.Nota4 = n4;
		};
		
	public float calcularMedia(){
		return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
		}
	public void setCalcularMedia(float media){
		this.calcularMedia = media;
		}
}

