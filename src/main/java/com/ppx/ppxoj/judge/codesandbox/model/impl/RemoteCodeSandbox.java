package com.ppx.ppxoj.judge.codesandbox.model.impl;

import com.ppx.ppxoj.judge.codesandbox.CodeSandbox;
import com.ppx.ppxoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.ppx.ppxoj.judge.codesandbox.model.ExecuteCodeResponse;

public class RemoteCodeSandbox implements CodeSandbox {
    /**
     * 远程代码沙箱（实际调用接口的沙箱）
     *
     * @param executeCodeRequest
     * @return
     */
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }

}
