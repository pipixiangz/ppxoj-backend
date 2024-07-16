package com.ppx.ppxoj.judge.codesandbox;

import com.ppx.ppxoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.ppx.ppxoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 代码沙箱接口定义
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
