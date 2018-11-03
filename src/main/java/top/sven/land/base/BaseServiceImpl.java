package top.sven.land.base;

import java.util.Date;
import java.util.List;

/**
 * @author liulang
 * @date 2018/10/17
 **/
public abstract class BaseServiceImpl<T extends BaseEntity, V extends BaseView, M extends BaseMapper<T>> implements BaseService<T, V> {

    protected M mapper;

    protected void setMapper(M mapper) {
        this.mapper = mapper;
    }

    @Override
    public T selectById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(T entity) {
        beforeSave(entity, false);
        mapper.insertSelective(entity);
        afterSave(entity);
        return entity.getId();
    }

    @Override
    public int updateById(T entity) {
        beforeSave(entity, true);
        int count = mapper.updateByPrimaryKeySelective(entity);
        afterSave(entity);
        return count;
    }

    @Override
    public int deleteById(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertBatch(List<T> list) {
        return mapper.insertBatch(list);
    }

    protected void beforeSave(T entity, boolean update) {
        Date date = new Date();
        if (entity.getUpdateTime() == null) {
            entity.setUpdateTime(date);
        }
        entity.setUpdateTime(date);
        if (!update) {
            entity.setId(null);
            if (entity.getCreateTime() == null) {
                entity.setCreateTime(date);
            }
            entity.setIsDeleted(0);
        }
    }

    protected void afterSave(T entity) {
    }
}
