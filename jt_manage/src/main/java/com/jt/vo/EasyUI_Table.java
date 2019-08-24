package com.jt.vo;

import com.jt.pojo.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author jod
 * @date 2019/8/21-22:30
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class EasyUI_Table {
    private Integer total;
    private List<Item> rows;
}
