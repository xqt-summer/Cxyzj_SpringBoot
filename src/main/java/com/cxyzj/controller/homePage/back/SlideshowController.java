package com.cxyzj.controller.homePage.back;

import com.cxyzj.domain.homePage.Slideshow;
import com.cxyzj.service.homePage.impl.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author 夏庆涛
 */
@RestController
@RequestMapping("/v1.0/back/index")
public class SlideshowController {

    @Autowired
    HomePageService homePageService;

    //获取轮播图列表
    @GetMapping(value = "/slideshows")
    Map<String, Object> slideGet() {
        return homePageService.slideGet();

    }

    //添加轮播图
    @PostMapping(value = "/slideshow")
    Integer slideAdd(@RequestParam("img_url") String img_url,
                     @RequestParam("seq") int seq,
                     @RequestParam("img_title") String img_title,
                     @RequestParam("target_url") String target_url) {
        Integer slideshow = homePageService.slideAdd(img_url, seq, img_title, target_url);
        System.out.println(slideshow);
        return slideshow;
    }

    //更新轮播图次序
    @PutMapping(value = "/slideshow/{slideshow_id}")
    Long slide_seqUpdate(@PathVariable("slideshow_id") int slideshow_id,
                         @RequestParam("seq") int seq) {
        Long slideshow = homePageService.slide_seqUpdate(slideshow_id, seq);
        //System.out.println(slideshow);
        return slideshow;
    }

    //删除轮播图
    @DeleteMapping(value = "/slideshow/{slideshow_id}")
    Long slideDelete(@PathVariable("slideshow_id") int slideshow_id) {
        Long slideshow = homePageService.slideDelete(slideshow_id);
        System.out.println(slideshow);
        return slideshow;
    }
}
