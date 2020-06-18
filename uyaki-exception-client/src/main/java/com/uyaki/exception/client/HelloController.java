package com.uyaki.exception.client;

import com.uyaki.exception.common.enumeration.ArgumentErrorCodeEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Hello controller.
 *
 * @author uyaki
 * @date 2020 /06/06
 */
@RestController
public class HelloController {
    /**
     * Say hello string.
     *
     * @return the string
     */
    @GetMapping("/hello")
    public String sayHello() {
        String jj = null;
        ArgumentErrorCodeEnum.VALID_ERROR.assertEquals(jj, "as", "sdads", "擦擦硕大的");
        return "hello";
    }
}
