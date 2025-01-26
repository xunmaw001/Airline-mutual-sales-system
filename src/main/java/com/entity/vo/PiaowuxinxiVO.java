package com.entity.vo;

import com.entity.PiaowuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 票务信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-17 23:09:40
 */
public class PiaowuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 票务名称
	 */
	
	private String piaowumingcheng;
		
	/**
	 * 票务类型
	 */
	
	private String piaowuleixing;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 起点
	 */
	
	private String qidian;
		
	/**
	 * 目的地
	 */
	
	private String mudedi;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 商家账号
	 */
	
	private String shangjiazhanghao;
		
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：票务名称
	 */
	 
	public void setPiaowumingcheng(String piaowumingcheng) {
		this.piaowumingcheng = piaowumingcheng;
	}
	
	/**
	 * 获取：票务名称
	 */
	public String getPiaowumingcheng() {
		return piaowumingcheng;
	}
				
	
	/**
	 * 设置：票务类型
	 */
	 
	public void setPiaowuleixing(String piaowuleixing) {
		this.piaowuleixing = piaowuleixing;
	}
	
	/**
	 * 获取：票务类型
	 */
	public String getPiaowuleixing() {
		return piaowuleixing;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：起点
	 */
	 
	public void setQidian(String qidian) {
		this.qidian = qidian;
	}
	
	/**
	 * 获取：起点
	 */
	public String getQidian() {
		return qidian;
	}
				
	
	/**
	 * 设置：目的地
	 */
	 
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：商家账号
	 */
	 
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
				
	
	/**
	 * 设置：商家名称
	 */
	 
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
