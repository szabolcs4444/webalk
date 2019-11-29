package demo.capp.test;

import demo.capp.config.SpringRootConfig;
import demo.capp.dao.UserDAO;
import demo.capp.domain.User;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestUserDAOFindAll {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO=ctx.getBean(UserDAO.class);   
        
        List<User> users = userDAO.findAll();
        for (User u : users) {
             System.out.println(u.getUserId()+" "+u.getName()+" "+u.getRole());
             //TODO: access other columns
        }
        
    }    
}
