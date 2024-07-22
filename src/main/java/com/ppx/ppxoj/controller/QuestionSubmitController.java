package com.ppx.ppxoj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ppx.ppxoj.annotation.AuthCheck;
import com.ppx.ppxoj.common.BaseResponse;
import com.ppx.ppxoj.common.DeleteRequest;
import com.ppx.ppxoj.common.ErrorCode;
import com.ppx.ppxoj.common.ResultUtils;
import com.ppx.ppxoj.constant.UserConstant;
import com.ppx.ppxoj.exception.BusinessException;
import com.ppx.ppxoj.exception.ThrowUtils;
import com.ppx.ppxoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.ppx.ppxoj.model.dto.questionsubmit.QuestionSubmitEditRequest;
import com.ppx.ppxoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.ppx.ppxoj.model.dto.questionsubmit.QuestionSubmitUpdateRequest;
import com.ppx.ppxoj.model.entity.QuestionSubmit;
import com.ppx.ppxoj.model.entity.User;
import com.ppx.ppxoj.model.vo.QuestionSubmitVO;
import com.ppx.ppxoj.service.QuestionSubmitService;
import com.ppx.ppxoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 题目提交接口
 *
 *
 *
 */
@RestController
//@RequestMapping("/question_submit")
@Slf4j
@Deprecated // 该接口已经废弃
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;

    /**
     * 提交题目
     *
     * @param questionSubmitAddRequest
     * @param request
     * @return 提交记录的 id
     *//*
    @PostMapping("/")
    public BaseResponse<Long> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest,
                                               HttpServletRequest request) {
        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getQuestionId() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 登录才能点赞
        final User loginUser = userService.getLoginUser(request);
        long questionSubmitId = questionSubmitService.doQuestionSubmit(questionSubmitAddRequest, loginUser);
        return ResultUtils.success(questionSubmitId);
    }

    *//**
     * 分页获取题目提交列表（除了管理员外，普通用户只能看到非答案、提交代码等公开信息）
     *
     * @param questionSubmitQueryRequest
     * @param request
     * @return
     *//*
    @PostMapping("/list/page")
    public BaseResponse<Page<QuestionSubmitVO>> listQuestionSubmitByPage(@RequestBody QuestionSubmitQueryRequest questionSubmitQueryRequest,
                                                                         HttpServletRequest request) {
        long current = questionSubmitQueryRequest.getCurrent();
        long size = questionSubmitQueryRequest.getPageSize();
        // 从数据库中查询原始的题目提交分页信息
        Page<QuestionSubmit> questionSubmitPage = questionSubmitService.page(new Page<>(current, size),
                questionSubmitService.getQueryWrapper(questionSubmitQueryRequest));
        final User loginUser = userService.getLoginUser(request);
        // 返回脱敏信息
        return ResultUtils.success(questionSubmitService.getQuestionSubmitVOPage(questionSubmitPage, loginUser));
    }*/


}
