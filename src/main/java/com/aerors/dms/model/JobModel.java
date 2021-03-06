package com.aerors.dms.model;

import java.io.File;
import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class JobModel implements Serializable {
	
	private static final long serialVersionUID = -2970110528902734546L;

	/** 任务id **/
	@Id
	private String jobId;
 
	/** 任务名称 **/
	private String jobName;
	
	/** 任务类型 **/
	private String jobType;
 
	/** 任务分组 **/
	private String jobGroup;
 
	/** 任务状态 0禁用 1启用 2删除**/
	private String jobStatus;
 
	/** 任务运行时间表达式 **/
	private String cronExpression;
 
	/** 任务描述 **/
	private String desc;

	/** 任务流程 **/
	private String jobFlow;
	
	/** 任务对应的数据属性Id **/
	private String dataAttrId;
	
	private byte[] test;
	
	public byte[] getTest() {
		return test;
	}

	public void setTest(byte[] test) {
		this.test = test;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getJobFlow() {
		return jobFlow;
	}

	public void setJobFlow(String jobFlow) {
		this.jobFlow = jobFlow;
	}

	public String getDataAttrId() {
		return dataAttrId;
	}

	public void setDataAttrId(String dataAttrId) {
		this.dataAttrId = dataAttrId;
	}
}
