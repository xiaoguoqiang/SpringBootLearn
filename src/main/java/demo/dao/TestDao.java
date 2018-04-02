package demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by liqianga on 2018/3/28.
 */
@Component
public class TestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String,Object> getData(){
        String sql = "Select * from role_account ";
        try{
            return jdbcTemplate.queryForMap(sql);
        }catch (Exception e){
            return null;
        }
    }
}
