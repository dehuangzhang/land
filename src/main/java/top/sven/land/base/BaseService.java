package top.sven.land.base;

import java.util.List;

/**
 * @author liulang
 * @date 2018/10/17
 **/
public interface BaseService<T extends BaseEntity, V extends BaseView> {

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    T selectById(Integer id);

    /**
     * 插入
     *
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 更新
     *
     * @param entity
     * @return
     */
    int updateById(T entity);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int deleteById(Integer id);


    /**
     * 批量插入
     *
     * @param list
     * @return
     */
    int insertBatch(List<T> list);
}
