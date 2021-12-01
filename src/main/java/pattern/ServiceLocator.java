//package pattern;
//
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//// Service Locator ∆–≈œ
//
//public class ServiceLocator {
//
//    private InitialContext initialContext;
//    private Map cache;
//    private static ServiceLocator me;
//    static {
//        me = new ServiceLocator();
//    }
//
//    private ServiceLocator() {
//        cache = Collections.synchronizedMap(new HashMap());
//    }
//
//    public InitialContext getInitialContext() throws Exception {
//        try {
//            if (initialContext == null) {
//                initialContext = new InitialContext();
//            }
//        } catch (Exception e) {
//            throw e;
//        }
//        return initialContext;
//    }
//
//    public static ServiceLocator getInstance() {
//        return me;
//    }
//
//    public EJBLocalHome getLocalHome(String jndiHomeName) throws Exception {
//        EJBLocalHome home = null;
//        try {
//            if (cache.containsKey(jndiHomeName)) {
//                home = (EJBLocalHome) cache.get(jndiHomeName);
//            } else {
//                home = (EJBLocalHome) getInitialContext().lookup(jndiHomeName);
//                cache.put(jndiHomeName, home);
//            }
//        } catch (NamingException ne) {
//            throw new Exception(ne.getMessage());
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//        return home;
//    }
//
//}
