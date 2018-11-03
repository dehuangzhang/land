package top.sven.land.base;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liulang
 * @date 2018/10/16
 **/
@Repository
public interface BaseMapper<T extends BaseEntity> {


    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(Integer id);

    /**
     * 插入
     *
     * @param entity
     * @return
     */
    int insertSelective(T entity);

    /**
     * 更新
     *
     * @param entity
     * @return
     */
    int updateByPrimaryKeySelective(T entity);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);


    /**
     * 批量插入
     *
     * @param list
     * @return
     */
    int insertBatch(List<T> list);
}
