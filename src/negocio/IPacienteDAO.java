package negocio;
import java.util.List;

/**
 *
 * @author Darkhness
 */
public interface IPacienteDAO {
    public void adiciona(Paciente paciente);
    public void altera (Paciente paciente);
    public void remove (int id);
    public List<Paciente> listartodos();
    public Paciente getByID(int id);
    
}
