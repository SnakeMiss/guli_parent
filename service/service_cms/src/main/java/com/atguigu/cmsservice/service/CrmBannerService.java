package com.atguigu.cmsservice.service;

import com.atguigu.cmsservice.entity.CrmBanner;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.boot.Banner;

import java.util.List;

/**
 * <p>
 * 首页banner表 服务类
 * </p>
 *
 * @author hskBeginner
 * @since 2021-09-08
 */
public interface CrmBannerService extends IService<CrmBanner> {
    List<Banner> getBanners();
}
