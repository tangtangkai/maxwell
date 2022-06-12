package org.ttk.maxwell.common.transfer;

import lombok.Getter;
import org.ttk.maxwell.common.exceptions.BizException;

@Getter
public class ApiResult<T> {
    private final String code;
    private final String message;
    private final T      data;

    public ApiResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResult(ApiResultErrorEnum errorEnum, T data) {
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage();
        this.data = data;
    }

    public static <E> ApiResult<E> buildSuccess(E data) {
        return new ApiResult<>(ApiResultErrorEnum.SUCCESS, data);
    }

    public static <E> ApiResult<E> buildFail(ApiResultErrorEnum errorEnum) {
        return new ApiResult<>(errorEnum, null);
    }

    public static <E> ApiResult<E> buildFail(BizException exception) {
        return new ApiResult<>(exception.getCode(), exception.getMessage(), null);
    }

    @Getter
    public enum ApiResultErrorEnum {
        SUCCESS("0000", "成功"),
        SYSTEM_FAIL("9999", "系统异常");
        private final String code;
        private final String message;

        ApiResultErrorEnum(String code, String message) {
            this.code = code;
            this.message = message;
        }
    }
}


