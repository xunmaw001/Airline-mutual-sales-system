package com.entity.model;

import com.entity.TaocanchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 套餐产品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-17 23:09:40
 */
public class TaocanchanpinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 套餐标题
	 */
	
	private String taocanbiaoti;
		
	/**
	 * 套餐类型
	 */
	
	private String taocanleixing;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 套餐简介
	 */
	
	private String taocanjianjie;
		
	/**
	 * 套餐详情
	 */
	
	private String taocanxiangqing;
		
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
	 * 设置：套餐标题
	 */
	 
	public void setTaocanbiaoti(String taocanbiaoti) {
		this.taocanbiaoti = taocanbiaoti;
	}
	
	/**
	 * 获取：套餐标题
	 */
	public String getTaocanbiaoti() {
		return taocanbiaoti;
	}
				
	
	/**
	 * 设置：套餐类型
	 */
	 
	public void setTaocanleixing(String taocanleixing) {
		this.taocanleixing = taocanleixing;
	}
	
	/**
	 * 获取：套餐类型
	 */
	public String getTaocanleixing() {
		return taocanleixing;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：套餐简介
	 */
	 
	public void setTaocanjianjie(String taocanjianjie) {
		this.taocanjianjie = taocanjianjie;
	}
	
	/**
	 * 获取：套餐简介
	 */
	public String getTaocanjianjie() {
		return taocanjianjie;
	}
				
	
	/**
	 * 设置：套餐详情
	 */
	 
	public void setTaocanxiangqing(String taocanxiangqing) {
		this.taocanxiangqing = taocanxiangqing;
	}
	
	/**
	 * 获取：套餐详情
	 */
	public String getTaocanxiangqing() {
		return taocanxiangqing;
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
