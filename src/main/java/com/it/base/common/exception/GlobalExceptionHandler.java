package com.it.base.common.exception;

import com.it.base.common.enums.ResultCodeEnum;
import com.it.base.common.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e) {
        log.error("APIException : ", e);
        return new ResultVO<>(ResultCodeEnum.FAILED, e.getMsg());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        log.error("MethodArgumentNotValidException : ", e);
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        return new ResultVO<>(ResultCodeEnum.VALIDATE_FAILED, objectError.getDefaultMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResultVO<String> exception(Exception e) {
        log.error("Exception : ", e);
        return new ResultVO<>(ResultCodeEnum.ERROR, e.getMessage());
    }
}
