package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 创建公共管理器
 */
public class JpaUtils {
    private static EntityManagerFactory factory;
    //第一次访问方法加载静态代码块，第二次访问就不会创建。
    static {
         factory = Persistence.createEntityManagerFactory("myJpa");
    }
    //EntityMananger 对象创建
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
