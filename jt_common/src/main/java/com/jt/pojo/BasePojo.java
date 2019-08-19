package com.jt.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jod
 * @date 2019/8/19-23:06
 */
@Data
@Accessors(chain = true)
public class BasePojo implements Serializable {
    private Date created;
    private Date updated;
}
