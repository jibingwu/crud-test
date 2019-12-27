package com.sky.crud.crudtest.controller;


import com.sky.crud.crudtest.mapper.TMemberMapper;
import com.sky.crud.crudtest.pojo.TMember;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    @Autowired
    TMemberMapper memberMapper;

    @RequestMapping("/test")
    public TMember queryMemberId(@RequestParam(value = "id", defaultValue = "1") Integer id) {

        TMember tMember = memberMapper.selectByPrimaryKey(id);

        return tMember;
    }


    @RequestMapping("/test1")
    public  String     deleteId(){



        return null;

    }






}
