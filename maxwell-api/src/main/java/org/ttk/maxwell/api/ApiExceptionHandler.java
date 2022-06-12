package org.ttk.maxwell.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.ttk.maxwell.common.exceptions.BizException;
import org.ttk.maxwell.common.transfer.ApiResult;

@Slf4j
@ControllerAdvice(basePackages = { "org.ttk.maxwell.api.controller" })
public class ApiExceptionHandler {

    @ExceptionHandler(BizException.class)
    public ApiResult bizExceptionHandler(BizException exception) {
        exception.printStackTrace();
        return ApiResult.buildFail(exception);
    }

    @ExceptionHandler(Exception.class)
    public ApiResult exceptionHandler(Exception e) {
        e.printStackTrace();
        return ApiResult.buildSuccess(ApiResult.ApiResultErrorEnum.SYSTEM_FAIL);
    }
}
