package com.ajie.flowEngine.service;

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
	
	
}
