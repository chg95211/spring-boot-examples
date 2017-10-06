package alex;

import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * <p>Created by qct on 2017/10/5.
 */
public interface BaseMapper<T, E, PK extends Serializable> {

    long countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(PK pk);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(E example);

    T selectByPrimaryKey(PK pk);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByExample(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}