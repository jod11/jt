package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author jod
 * @date 2019/8/25-22:45
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class SysResult {
    private Integer status;
    private String msg;
    private Object data;
    public static SysResult success(){
        return new SysResult(200,"入库成功",null);
    }
    public static SysResult success(Object data){
        return new SysResult(200,"入库成功",data);
    }
    public static SysResult success(String msg,Object data){
        return new SysResult(200,msg,data);
    }
    public static SysResult fail(){
        return new SysResult(201,"入库失败",null);
    }
}
