package com.jt.advice;

import com.jt.vo.SysResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author jod
 * @date 2019/8/26-0:15
 */
//@ControllerAdvice
@RestControllerAdvice
public class SysResultAspect {
    @ExceptionHandler(RuntimeException.class)
    //@ResponseBody
    public SysResult sysResultFail(Exception e){
        System.out.println("服务器异常"+e.getMessage());
        return SysResult.fail();
    }
}
