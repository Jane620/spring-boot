package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 在这里我们使用@SpringBootApplication 指定只是一个spring的应用程序
 * Created by jfwang001 on 2017/7/8.
 */
@SpringBootApplication
public class App {

    public static void main(String [] args){
        /*
         *在main方法中进行启动应用程序
         */
        SpringApplication.run(App.class,args);
    }

}
