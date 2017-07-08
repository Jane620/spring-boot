package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jfwang001 on 2017/7/8.
 */
@RestController
public class HelloController {

    /**
     * 在这里我们使用@RequestMapping，建立映射
     * http:/127.0.0.1:8080/hello
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/good")
    public String good(){
        return "good day";
    }
}
