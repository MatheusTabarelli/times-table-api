package com.example.calculator.model;


public class ResultBuilder {

    private ResultBuilder() {
    }


    public static ApiResult getResult( Object result ) {
        return ApiResult.withResult(result.toString());
    }

    public static ApiResult getResult( Integer result ) {
        return ApiResult.withResult(result.toString());
    }

    public static ApiResult getResultFromError(String errorMessage) {
        return ApiResult.withError(errorMessage);
    }
}

