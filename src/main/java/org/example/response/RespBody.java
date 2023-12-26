package org.example.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class RespBody<T> {
    private Boolean valid;
    private int status;
    private T data;
    private String msg;
    private int code;

    public RespBody(Boolean valid) {
        this.valid = valid;
    }

    public RespBody(Integer code) {
        this.code = code;
    }

    public RespBody(int status, T data, String msg){
        this.status = status;
        this.data = data;
        this.msg=msg;
    }
}
