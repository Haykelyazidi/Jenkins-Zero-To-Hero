package stepDefinition;

import org.testng.annotations.Test;

import pages.Jenkins_Web_Page;
import pages.Jenkins_Web_Page1;


public class Verificiation_CICD extends BaseTest{

	
	@Test
	
	
	
	public void utilisateur_est_sur_la_page_d_acceuil() throws InterruptedException {
		Thread.sleep(5000);
	 System.out.println("1");
	}
	Jenkins_Web_Page1 Jen = new Jenkins_Web_Page(base_test_driver);
	
	public void verifie_l_affichage_du_premier_texte() {
		
		Jen.verification_affichage_text1();
		
	}

	
	public void verifie_l_affichage_du_deuxieme_texte() {
		
		Jen.verification_affichage_texte2();
	}

	
	public void afficher_le_message_test_passet() {
	   System.out.println("Test Passed");
	}
	
	
	



	
}
