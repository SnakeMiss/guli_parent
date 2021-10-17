package com.atguigu.cmsservice.controller;
import com.atguigu.cmsservice.entity.CrmBanner;
import com.atguigu.cmsservice.service.CrmBannerService;
import com.atguigu.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 首页banner表 前端控制器
 * </p>
 *
 * @author hskBeginner
 * @since 2021-09-08
 */
@RestController
@RequestMapping("/cmsservice/banneradmin")
public class BannerAdminController {
    @Autowired
    private CrmBannerService crmBannerService;
    @GetMapping("pageBanner/{page}/{limit}")
    public R pageBanner(@PathVariable long page, @PathVariable long limit) {
    Page<CrmBanner> pageBanner=new Page<>(page,limit);
        crmBannerService.page(pageBanner,null);
        return  R.ok().data("items",pageBanner.getCurrent()).data("total",pageBanner.getTotal());
    }
    @PostMapping("addBanner")
    public R addBanner(@RequestBody CrmBanner crmBanner) {
        crmBannerService.save(crmBanner);
        return  R.ok();
    }
    @PostMapping("update")
    public R updateBanner(@RequestBody CrmBanner crmBanner) {
        crmBannerService.updateById(crmBanner);
        return  R.ok();
    }

    @PostMapping("delate/{id}")
    public R delateBanner(@PathVariable long id) {
        crmBannerService.removeById(id);
        return  R.ok();
    }
    @PostMapping("get/{id}")
    public R get(@PathVariable long id) {
        crmBannerService.getById(id);
        return  R.ok();
    }
}

