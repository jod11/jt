package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author jod
 * @date 2019/8/25-20:43
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class EasyUI_Tree {
    private Long id;
    private String text;
    private String state;
}
