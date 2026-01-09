package dio.com.gof.singleton;

/**
* Singleton "preguiçoso
 *
 * @author Julio
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstance() {
        return instance == null ? instance = new SingletonLazy() : instance;
    }

}
