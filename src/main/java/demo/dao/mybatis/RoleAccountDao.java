package demo.dao.mybatis;

import demo.Bean.RoleAcountEntity;
import demo.dao.basedao.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by liqianga on 2018/4/2.
 */
@Mapper
public interface RoleAccountDao extends MyMapper<RoleAcountEntity> {
}
