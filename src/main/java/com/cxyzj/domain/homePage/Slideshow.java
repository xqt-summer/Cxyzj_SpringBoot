package com.cxyzj.domain.homePage;

/**
 * @author 夏庆涛
 */


public class Slideshow {

    private int slideshow_id;  //轮播图id
    private String img_url;  //图片路径
    private int seq;  //轮播图次序
    private String img_title;  //图片标题
    private String target_url;  //目的链接

    public Slideshow(){

    }

    public int getSlideshow_id() {
        return slideshow_id;
    }

    public void setSlideshow_id(int slideshow_id) {
        this.slideshow_id = slideshow_id;
    }

    public String getImg_url(){
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq){
        this.seq=seq;
    }

    public String getImg_title() {
        return img_title;
    }

    public void setImg_title(String img_title) {
        this.img_title = img_title;
    }

    public String getTarget_url() {
        return target_url;
    }

    public void setTarget_url(String target_url) {
        this.target_url = target_url;
    }

    @Override
    public String toString() {
        return "slideShow"+"{"+
                "slideshow_id="+slideshow_id+
                ",img_url="+img_url+
                ",seq="+seq+
                ",img_title="+img_title+
                ",target_url="+target_url+
                '}';
    }
}
