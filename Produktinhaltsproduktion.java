/**
 * 
 */
package design_patter_factory;

/**
 * @author marcel
 *
 */
public class Produktinhaltsproduktion implements PuregreenProduction{
    @Override
    public Shampoo createShampoo() {
        return new HairBodywash();
    }

    @Override
    public Seife createSeife() {
        return new Fluessigseife();
    }

    @Override
    public Bodylotion createBodylotion() {
        return new arnica();
    }
}
