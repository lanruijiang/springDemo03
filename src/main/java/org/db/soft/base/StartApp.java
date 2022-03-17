package org.db.soft.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("configuration.xml");
        Server server1 = app.getBean( "server" , Server.class );
        Server server2 = app.getBean( "server" , Server.class );
        System.out.println(server1);
        System.out.println(server2);
        System.out.println(server1 == server2);

    }
}
