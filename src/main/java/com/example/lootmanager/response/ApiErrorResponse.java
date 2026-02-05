package com.example.lootmanager.response;

import java.time.LocalDateTime;
import java.util.List;

public class ApiErrorResponse {

    private boolean success;
    private String message;
    private List<FieldError> errors;
    private String path;
    private LocalDateTime timestamp;

    public ApiErrorResponse(boolean success, String message, List<FieldError> errors, String path) {
        this.success = success;
        this.message = message;
        this.errors = errors;
        this.path = path;
        this.timestamp = LocalDateTime.now();
    }

    public ApiErrorResponse(boolean success, String message, String path) {
        this.success = success;
        this.message = message;
        this.path = path;
        this.timestamp = LocalDateTime.now();
    }

    // getters
    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public List<FieldError> getErrors() { return errors; }
    public String getPath() { return path; }
    public LocalDateTime getTimestamp() { return timestamp; }

    // inner class
    public static class FieldError {
        private String field;
        private String message;

        public FieldError(String field, String message) {
            this.field = field;
            this.message = message;
        }

        public String getField() { return field; }
        public String getMessage() { return message; }
    }
}
