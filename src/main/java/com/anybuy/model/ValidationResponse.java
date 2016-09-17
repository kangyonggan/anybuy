package com.anybuy.model;

import lombok.Data;

/**
 * @author houbinbin
 * @since 16/9/17
 * - 验证返回实体Bean
 */
@Data
public class ValidationResponse {
    private String status;
    private String message;

    public ValidationResponse() {
    }

    public ValidationResponse(String status) {
        this.status = status;
    }
}
