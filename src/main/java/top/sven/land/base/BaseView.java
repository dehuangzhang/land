package top.sven.land.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liulang
 * @date 2018/10/21
 **/
@ApiModel(value = "BaseView", description = "基础对象")
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class BaseView implements Serializable {
    private static final long serialVersionUID = 2018102122140501001L;
    @ApiModelProperty(value = "主键ID")
    private Integer id;
}
