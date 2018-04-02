package demo.controller;

import demo.Bean.RoleAcountEntity;
import demo.dao.TestDao;
import demo.service.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liqianga on 2018/3/28.
 */
@RestController
public class FirstController {

    @Autowired
    private TestInterface testInterface;

    @RequestMapping("/id")
    public int getId(){
        return testInterface.getID();
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/address")
    public Map<String, Object> getRole() {
        Map<String, Object> result = new HashMap<String, Object>(1);
        result.put("1", "1");
        return result;
    }

    @RequestMapping("/role")
    public List<RoleAcountEntity> getRoles(){
        return testInterface.getAll();
    }


}
