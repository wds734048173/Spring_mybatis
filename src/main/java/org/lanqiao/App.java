package org.lanqiao;

import org.lanqiao.pojo.User;
import org.lanqiao.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
//        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        User user = User.builder().id(5).age(28).sex("女").username("wds").email("wds@126.com").build();
//        userService.add(user);
//        userService.remove(7);
        userService.modify(user);
        User user1 = userService.getUser(6);
        System.out.println(user1);
        List<User> userList = userService.getAll();
        for(User user2 : userList){
            System.out.println(user2);
        }

    }
}
