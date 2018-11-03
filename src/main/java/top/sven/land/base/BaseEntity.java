package top.sven.land.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liulang
 * @date 2018/10/15
 **/
@Data
public class BaseEntity implements Serializable {


    private static final long serialVersionUID = -5511124200344077027L;
    /**
     * id
     */
    protected Integer id;

    /**
     * 创建时间
     */
    protected Date createTime;

    /**
     * 更新时间
     */
    protected Date updateTime;

    /**
     * 删除标示
     */
    protected Integer isDeleted;

}

