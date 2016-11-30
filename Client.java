/**
 * 
 */
package design_patter_factory;

/**
 * @author marcel
 *
 */
public class Client implements Shampoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Implementierungsaustausch 
		PuregreenProduction produktion = new Verpackungsproduktion();
		 
		 Shampoo Shampoo = produktion.createShampoo(); //Shampoo-implementierung von produktion
		 Seife Seife = produktion.createSeife(); //Seife-implementierung von produktion
		 Bodylotion Bodylotion = produktion.createBodylotion(); //Bodylotion-implementierung von produktion
		 
		 System.out.println(Shampoo);
		 System.out.println(Seife);
		 System.out.println(Bodylotion);


	}

}
