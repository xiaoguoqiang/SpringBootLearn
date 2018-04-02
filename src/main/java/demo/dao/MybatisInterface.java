package demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liqianga on 2018/4/2.
 */
@Mapper
public interface MybatisInterface {

    @Select("Select count(id) from role_account")
    int getCount();

}
