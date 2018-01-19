package com.cxyzj.service.homePage.impl;

/**
 * @author 夏庆涛
 */


import com.cxyzj.domain.homePage.Board;
import com.cxyzj.domain.homePage.Qr_code;
import com.cxyzj.domain.homePage.Slideshow;
import com.cxyzj.domain.homePage.mapper.BoardMapper;
import com.cxyzj.domain.homePage.mapper.Qr_codeMapper;
import com.cxyzj.domain.homePage.mapper.SlideshowMapper;
import com.cxyzj.service.homePage.homePageServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomePageService implements homePageServiceInterface {

    @Autowired
    private SlideshowMapper slideshowMapper;
    @Autowired
    private BoardMapper boardMapper;
    @Autowired
    private Qr_codeMapper qr_codeMapper;


    //获取轮播图列表
    public List<Slideshow> slideGet() {
        return slideshowMapper.slideGet();
    }

    //添加轮播图
    public Integer slideAdd(String img_url, int seq, String img_title, String target_url) {
        Slideshow slideshow = new Slideshow();
        slideshow.setImg_url(img_url);
        slideshow.setSeq(seq);
        slideshow.setImg_title(img_title);
        slideshow.setTarget_url(target_url);
        slideshowMapper.slideAdd(slideshow);
        return slideshow.getSlideshow_id();
    }

    //更新轮播图列表
    public Long slideUpdate(int slideshow_id, String img_url, int seq, String img_title, String target_url) {
        Slideshow slideshow = new Slideshow();
        slideshow.setSlideshow_id(slideshow_id);
        slideshow.setImg_url(img_url);
        slideshow.setSeq(seq);
        slideshow.setImg_title(img_title);
        slideshow.setTarget_url(target_url);
        return slideshowMapper.slideUpdate(slideshow);
    }

    //更新轮播图次序
    public Long slide_seqUpdate(int slideshow_id, int seq) {
        Slideshow slideshow = new Slideshow();
        slideshow.setSlideshow_id(slideshow_id);
        slideshow.setSeq(seq);
        return slideshowMapper.slide_seqUpdate(slideshow);
    }


    //获取版块列表
    public List<Board> boardGet() {
        return boardMapper.boardGet();
    }

    //添加板块
    public Integer boardAdd(String img_url, String board_url, int seq) {
        Board board = new Board();
        board.setImg_url(img_url);
        board.setBoard_url(board_url);
        board.setSeq(seq);
        boardMapper.boardAdd(board);
        return board.getBoard_id();
    }

    //更新板块
    public Long boardUpdate(int board_id, String img_url, String board_url, int seq) {
        Board board = new Board();
        board.setBoard_id(board_id);
        board.setImg_url(img_url);
        board.setBoard_url(board_url);
        board.setSeq(seq);
        return boardMapper.boardUpdate(board);
    }

    //更新板块次序
    public Long board_seqUpdate(int board_id, int seq) {
        Board board = new Board();
        board.setBoard_id(board_id);
        board.setSeq(seq);
        return boardMapper.board_seqUpdate(board);
    }

    //删除板块
    public Long boardDelete(int board_id) {
        Board board = new Board();
        board.setBoard_id(board_id);
        return boardMapper.boardDelete(board);
    }

    //删除轮播图
    public Long slideDelete(int slideshow_id) {
        Slideshow slideshow = new Slideshow();
        slideshow.setSlideshow_id(slideshow_id);
        return slideshowMapper.slideDelete(slideshow);
    }

    //获取二维码列表
    public List<Qr_code> qrGet() {
        return qr_codeMapper.qrGet();
    }

    //添加二维码
    public Integer qrAdd(String qr_code_url, int seq, String qr_title) {
        Qr_code qr_code = new Qr_code();
        qr_code.setQr_code_url(qr_code_url);
        qr_code.setSeq(seq);
        qr_code.setQr_title(qr_title);
        qr_codeMapper.qrdAdd(qr_code);
        return qr_code.getQr_id();
    }

    //修改二维码
    public Long qrUpdate(int qr_id, String qr_code_url, int seq, String qr_title) {
        Qr_code qr_code = new Qr_code();
        qr_code.setQr_id(qr_id);
        qr_code.setQr_code_url(qr_code_url);
        qr_code.setSeq(seq);
        qr_code.setQr_title(qr_title);
        return qr_codeMapper.qrUpdate(qr_code);
    }

    //更新二维码次序
    public Long qr_seqUpdate(int qr_id, int seq) {
        Qr_code qr_code = new Qr_code();
        qr_code.setQr_id(qr_id);
        qr_code.setSeq(seq);
        return qr_codeMapper.qr_seqUpdate(qr_code);
    }

    //删除二维码
    public Long qrDelete(int qr_id) {
        Qr_code qr_code = new Qr_code();
        qr_code.setQr_id(qr_id);
        return qr_codeMapper.qrDelete(qr_code);
    }
}
