package demo.capp.test;

import demo.capp.config.SpringRootConfig;
import demo.capp.dao.UserDAO;
import demo.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Vikram
 */
public class TestUserDAODelete {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO=ctx.getBean(UserDAO.class);
        userDAO.delete(2);
        System.out.println("--------Data Deleted------");
    }    
}
