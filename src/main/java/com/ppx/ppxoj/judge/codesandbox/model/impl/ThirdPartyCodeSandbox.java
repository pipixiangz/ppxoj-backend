package com.ppx.ppxoj.judge.codesandbox.model.impl;

import com.ppx.ppxoj.judge.codesandbox.CodeSandbox;
import com.ppx.ppxoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.ppx.ppxoj.judge.codesandbox.model.ExecuteCodeResponse;

public class ThirdPartyCodeSandbox implements CodeSandbox {
    /**
     * 调用网上现成的代码沙箱
     *
     * @param executeCodeRequest
     * @return
     */
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }

}
