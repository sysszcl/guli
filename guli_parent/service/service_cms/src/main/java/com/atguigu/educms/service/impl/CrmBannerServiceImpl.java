package com.atguigu.educms.service.impl;

import com.atguigu.educms.entity.CrmBanner;
import com.atguigu.educms.mapper.CrmBannerMapper;
import com.atguigu.educms.service.CrmBannerService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 首页banner表 服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2022-08-07
 */
@Service
public class CrmBannerServiceImpl extends ServiceImpl<CrmBannerMapper, CrmBanner> implements CrmBannerService {

    @Override
    public void pageBanner(Page<CrmBanner> pageParam, Object o) {

    }

    @Override
    public CrmBanner getBannerById(String id) {
        return null;
    }

    @Override
    public void saveBanner(CrmBanner banner) {

    }

    @Override
    public void removeBannerById(String id) {

    }

    @Override
    public void updateBannerById(CrmBanner banner) {

    }

  @Cacheable(value = "banner",key = "'selectList'")
    @Override
    public List<CrmBanner> selectIndexList() {
        List<CrmBanner> list = baseMapper.selectList(null);

        return list;
    }
}
