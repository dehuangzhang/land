package top.sven.land.base;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @author liulang
 * @date 2018/10/21
 **/


public class BaseListView<T extends BaseView> implements Serializable {
    private static final long serialVersionUID = 2018102122140501002L;
    @ApiModelProperty(value = "列表数据")
    protected List<T> viewList;

    @ApiModelProperty(value = "数量")
    protected int total = -1;

    public int getTotal() {
        if (total == -1 && !CollectionUtils.isEmpty(viewList)) {
            return viewList.size();
        }
        return total;
    }
}
