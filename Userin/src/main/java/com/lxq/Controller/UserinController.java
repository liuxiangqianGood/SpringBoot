package com.lxq.Controller;

import com.lxq.Entity.Userin;
import com.lxq.Jpa.UserinJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserinController {

    @Autowired
    private UserinJpa userinJpa;

    //查询Userin表信息
    @GetMapping(value = "/findUserin")
    public List<Userin> findUserin(){
        return userinJpa.findAll();
    }

    //增加表一条信息
    @PostMapping(value = "/addUserin")
    public Userin addUserin(@RequestParam("id") Integer id,@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("realname") String realname)
    {
        Userin userin=new Userin();
        userin.setId(id);
        userin.setUsername(username);
        userin.setPassword(password);
        userin.setRealname(realname);

        return userinJpa.save(userin);
    }

    //删除一条数据
    @DeleteMapping(value = "/delUserin")
    public void delUserin(@RequestParam("id") Integer id){

        userinJpa.deleteById(id);
    }

    //通过ID修改数据
    @PutMapping(value = "/updateUserin")
   public Userin updateUserin(@RequestParam("id") Integer id,@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("realname") String realname) {
        Userin userin=new Userin();
        userin.setId(id);
        userin.setUsername(username);
        userin.setPassword(password);
        userin.setRealname(realname);
        return userinJpa.saveAndFlush(userin);
   }


    //查找Userin表一个人员通过ID
    @GetMapping(value = "/findOne")
    public Userin findOne(@RequestParam("id") Integer id){

        return userinJpa.findById(id).orElse(null);
    }

}
