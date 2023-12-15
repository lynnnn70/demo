package com.example.demo;

import com.sun.istack.internal.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;

public class CommonResponse<T> {

    @NotNull
    @Schema(description = "status number")
    private Integer status;

    @NotNull
    @Schema(description = "message of result")
    private String message;

    @Schema(description = "body of response")
    private T body;

    public CommonResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
    //先定義預設為status.OK，因此在new CommonResponse時，若結果為成功時就不須再重覆寫 EX:
    //寫 CommonResponse<String> defaultResponse = new CommonResponse<>();
    //就會等同於 CommonResponse<String> defaultResponse = new CommonResponse<>(StatusCode.OK.getValue(), "success");
    public CommonResponse(){
        this(StatusCode.OK.getValue(), "success");
    }

    public Integer getStatus() {
        return status;
    }

    public CommonResponse<T> setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommonResponse<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getBody() {
        return body;
    }

    public CommonResponse<T> setBody(T body) {
        this.body = body;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("{status:").append(status);
        sb.append(", message:'").append(message).append('\'');
        sb.append(", body:").append(body);
        sb.append("}");
        return sb.toString();
    }

}
