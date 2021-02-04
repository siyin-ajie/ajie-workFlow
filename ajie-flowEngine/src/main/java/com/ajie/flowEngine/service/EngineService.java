package com.ajie.flowEngine.service;

import java.util.Map;

import org.activiti.engine.runtime.ProcessInstance;

/**
 * @name 流程引擎相关
 * 
 * @author hongjie.gao
 * @date 2021年1月14日下午3:49:01
 */
public interface EngineService {
	/**
	 * 使用流程模型id部署流程，并返回流程部署id
	 * 
	 * @param modelId
	 *            流程模型id
	 * @return 流程部署id
	 * @author hongjie.gao
	 * @date 2021年1月14日下午3:49:01
	 */
	public String deployFlowByModelId(String modelId);

	/**
	 * 关联业务对象启动流程
	 * 
	 * @param flowname
	 *            部署流程名称
	 * @param orderId
	 *            业务表单主键
	 * @param variables
	 *            流程变量
	 * @param formKey
	 *            追加参数，用于流程启动是保存发起布局
	 * @return
	 * @throws Exception
	 */
	public ProcessInstance startFlow(String flowname, String orderId, Map<String, Object> variables, String formKey)
			throws Exception;
}
