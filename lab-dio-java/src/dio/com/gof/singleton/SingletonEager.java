package dio.com.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author Julio
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstance() {
        return instance;
    }

}