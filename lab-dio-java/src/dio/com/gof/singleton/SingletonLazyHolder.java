package dio.com.gof.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @author Julio
 */
public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }

}