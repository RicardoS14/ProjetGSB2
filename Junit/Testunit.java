import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class Testunit {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConnexion() {
		
		String login = "LJ";
		String mdp ="pfeuh";
		
		assertEquals("Erreur de connexion",Modeleconnexion.connexioncomptable(login, mdp));
	}
}