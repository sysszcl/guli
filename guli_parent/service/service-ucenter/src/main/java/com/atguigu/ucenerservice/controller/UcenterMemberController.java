package com.atguigu.ucenerservice.controller;


import com.atguigu.commonutils.JwtUtils;
import com.atguigu.commonutils.R;
import com.atguigu.commonutils.ordervo.UcenterMemberOrder;
import com.atguigu.servicebase.exception.GuliException;
import com.atguigu.ucenerservice.entity.UcenterMember;
import com.atguigu.ucenerservice.entity.vo.LoginVo;
import com.atguigu.ucenerservice.entity.vo.RegisterVo;
import com.atguigu.ucenerservice.service.UcenterMemberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-08-09
 */
@RestController
@RequestMapping("/educenter/apimember")
@CrossOrigin
public class UcenterMemberController{
    @Autowired
    private UcenterMemberService memberService;
    @ApiOperation(value = "会员登录")
    @PostMapping("login")
    public R login(@RequestBody LoginVo loginVo) {
        String token = memberService.login(loginVo);
        return R.ok().data("token", token);
    }
    @ApiOperation(value = "会员注册")
    @PostMapping("register")
    public R register(@RequestBody RegisterVo registerVo){
        memberService.register(registerVo);
        return R.ok();
    }

    @ApiOperation(value = "根据token获取登录信息")
    @GetMapping("auth/getLoginInfo")
    public R getLoginInfo(HttpServletRequest request){
        try {
            String memberId = JwtUtils.getMemberIdByJwtToken(request);
            LoginVo loginInfoVo = memberService.getLoginInfo(memberId);
            return R.ok().data("item", loginInfoVo);
        }catch (Exception e){
            e.printStackTrace();
            throw new GuliException(20001,"error");
        }
    }


    //根据token字符串获取用户信息
    @PostMapping("getInfoUc/{id}")
    public UcenterMemberOrder getInfo(@PathVariable String id) {
//根据用户id获取用户信息
        UcenterMember ucenterMember = memberService.getById(id);
        UcenterMemberOrder memeber = new UcenterMemberOrder();
        BeanUtils.copyProperties(ucenterMember,memeber);
        return memeber;
    }

    @GetMapping(value = "countregister/{day}")
    public R registerCount(
            @PathVariable String day){
        Integer count = memberService.countRegisterByDay(day);
        return R.ok().data("countRegister", count);
    }

}