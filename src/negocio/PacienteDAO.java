package negocio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
/**
 *
 * @author Darkhness
 */
public class PacienteDAO implements IPacienteDAO {

    @Override
    public void adiciona(Paciente paciente) {
        
      
        File arquivo = new File("D:\\"+  paciente.getNome().replaceAll("","") + paciente.getNome().hashCode()+".txt");
        try{
            if(!arquivo.exists()){
                arquivo.createNewFile();
            }
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("nome: "+paciente.getNome()+"\n");
        bw.newLine();
        bw.write("CPF: "+paciente.getCPF()+"\n");
        bw.newLine();
        bw.write("Data de Nascimento: "+paciente.getData_nascimento()+"\n");
        bw.newLine();
        bw.write("sexo: "+paciente.getSexo()+"\n");
        bw.newLine();
        bw.write("Endereço: "+paciente.getEndereco()+"\n");
        bw.newLine();
        bw.write("Telefone: "+paciente.getTelefone()+"\n");
        bw.newLine();
        bw.write("Plano de Saúde: "+paciente.getPlano_saude()+"\n");
        bw.newLine();
        bw.write("Observações: "+paciente.getObservacoes()+"\n");
        bw.newLine();
        bw.write("Foto: "+paciente.getFoto()+"\n");
        bw.newLine();
      bw.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        
    }

    @Override
    public void altera(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> listartodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
