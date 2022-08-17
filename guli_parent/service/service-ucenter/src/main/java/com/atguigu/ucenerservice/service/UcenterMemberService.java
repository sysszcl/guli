package com.atguigu.ucenerservice.service;

import com.atguigu.ucenerservice.entity.UcenterMember;
import com.atguigu.ucenerservice.entity.vo.LoginVo;
import com.atguigu.ucenerservice.entity.vo.RegisterVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-08-09
 */
public interface UcenterMemberService extends IService<UcenterMember> {


    UcenterMember getByOpenid(String openid);

    String login(LoginVo loginVo);

    void register(RegisterVo registerVo);

    LoginVo getLoginInfo(String memberId);

    Integer countRegisterByDay(String day);
}
