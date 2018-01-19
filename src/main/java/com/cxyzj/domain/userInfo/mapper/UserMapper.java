package com.cxyzj.domain.userInfo.mapper;

import com.cxyzj.domain.userInfo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

/*     2，不使用@Param注解
    不使用@Param注解时，参数只能有一个，并且是Javabean。在SQL语句里可以引用JavaBean的属性，而且只能引用JavaBean的属性。
    // 这里id是user的属性
    @Select("SELECT * from Table where id = ${id}")
    Enchashment selectUserById(User user);*/

    //向数据库中插入nickname，email，password，is_admin ,regist_date,gender,head_url,bg_url,introduce等注册时填写或默认的值
    @Insert("insert into user(user_id,nickname,email,password,is_admin,register_date,gender,head_url,bg_url,introduce) values (${user_id},'${nickname}','${email}','${password}',${is_admin},${register_date}," +
            "'${gender}','${head_url}','${bg_url}','${introduce}')")
    void registerUser(User user);

    //根据邮箱查找用户id
    @Select("select user_id from user where email=#{email}")
    int getUsers_Id(@Param("email") String email);

    //根据邮箱查找，看这个邮箱在数据库中是否已存在
    @Select("SELECT EXISTS(SELECT *FROM user WHERE email=#{email})")
    boolean isExist(@Param("email") String email);
}
