package org.ttk.maxwell.common.exceptions;

import lombok.Getter;
import org.ttk.maxwell.common.transfer.ApiResult;

@Getter
public class BizException extends RuntimeException {
    private final String code;
    private final String message;

    public BizException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BizException(ApiResult.ApiResultErrorEnum errorEnum) {
        super(errorEnum.getMessage());
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage();
    }
}
