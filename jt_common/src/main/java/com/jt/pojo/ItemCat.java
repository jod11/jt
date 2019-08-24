package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author jod
 * @date 2019/8/24-23:40
 */
@Data
@TableName("tb_item_cat")
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class ItemCat extends BasePojo{
    private Integer id;
    private Integer parentId;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private String isParent;
}
