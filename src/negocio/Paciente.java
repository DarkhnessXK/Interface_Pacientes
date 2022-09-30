package negocio;
import java.util.Calendar;
/**
 *
 * @author Darkhness
 */
public class Paciente {
    //atributos
    private int idPaciente;
    private String nome;
    private String cpf;
    private Calendar data_nascimento;
    private String sexo;
    private String endereco;
    private String telefone;
    private String foto;
    private String plano_saude;
    private String observacoes;
    private Calendar data_cadastro;
    
    //getters e setters
    
   public String getNome(){
       return this.nome;
   }
   
   public void setNome(String s){
       this.nome = s;
   }
   
   public int getidPaciente(){
       return this.idPaciente;
   }
   
   public String getCPF(){
       return this.cpf;
   }
   
   public void setCPF(String s){
      this.cpf = s;
   }
   
   public Calendar getData_nascimento(){
       
       return this.data_nascimento;
   }
   
   public void setData_nascimento(Calendar d){
       this.data_nascimento = d;
   }
   
   public String getSexo(){
       return this.sexo;
   }
   
   public void setSexo(String s){
       this.sexo = s;
   }
   
   public String getEndereco(){
       return this.endereco;
   }
   
   public void setEndereco(String end){
       this.endereco = end;
   }
   
   public String getTelefone(){
       return this.telefone;
   }
   
   public void setTelefone(String tel){
       this.telefone = tel;
   }
   
   public String getFoto(){
       return this.foto;
   }
   
   public void setFoto(String f){
       this.foto = f;
   }
   
   public String getPlano_saude(){
       return this.plano_saude;
   }
   
   public void setPlano_saude(String s){
       this.plano_saude = s;
   }
   
   public String getObservacoes(){
       return this.observacoes;
   }
   
   public void setObservacoes(String ob){
       this.observacoes = ob;
   }
   
   public Calendar getData_cadastro(){
       return this.data_cadastro;
   }
   
}
