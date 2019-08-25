package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jod
 * @date 2019/8/24-23:40
 */
@Data
@TableName("tb_item_cat")
@Accessors(chain = true)
public class ItemCat extends BasePojo{
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long parentId;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private Boolean isParent;
}
