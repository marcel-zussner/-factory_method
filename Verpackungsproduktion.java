/**
 * 
 */
package design_patter_factory;

/**
 * @author marcel
 *
 */
public class Verpackungsproduktion implements PuregreenProduction{
    @Override
	public Shampoo createShampoo() {
        return new Plastiktube();
    }

    @Override
    public Seife createSeife() {
        return new Seifenspender();
    }

    @Override
    public Bodylotion createBodylotion() {
        return new Kanister();
    }
}