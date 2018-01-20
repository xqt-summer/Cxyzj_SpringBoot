package com.cxyzj.service.homePage;


import com.cxyzj.domain.homePage.Board;
import com.cxyzj.domain.homePage.Qr_code;
import com.cxyzj.domain.homePage.Slideshow;

import java.util.List;
import java.util.Map;

/**
 * @author 耿志强
 */
public interface homePageServiceInterface {

    //获取主页基本信息


    //获取动态信息


    //获取轮播图列表
    Map<String, Object> slideGet();

    //添加轮播图
    Integer slideAdd(String img_url, int seq, String img_title, String target_url);

    //更新轮播图列表
    Long slideUpdate(int slideshow_id, String img_url, int seq, String img_title, String target_url);

    //更新轮播图次序
    Long slide_seqUpdate(int slideshow_id, int seq);

    //删除轮播图
    Long slideDelete(int slideshow_id);

    //获取板块列表
    List<Board> boardGet();

    //添加板块
    Integer boardAdd(String img_url, String board_url, int seq);

    //更新板块
    Long boardUpdate(int board_id, String img_url, String board_url, int seq);

    //更新板块次序
    Long board_seqUpdate(int board_id, int seq);

    //删除板块
    Long boardDelete(int board_id);


    //获取二维码列表
    List<Qr_code> qrGet();

    //添加二维码
    Integer qrAdd(String qr_code_url, int seq, String qr_title);

    //修改二维码
    Long qrUpdate(int qr_id, String qr_code_url, int seq, String qr_title);

    //更新二维码次序
    Long qr_seqUpdate(int qr_id, int seq);

    //删除二维码
    Long qrDelete(int qr_id);
}
