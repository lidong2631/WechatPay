package com.easypay;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ScanPayParameters")
public class ScanPayParameters {
	
	String appid;
	String sub_appid;
	String mch_id;
	String sub_mch_id;
	String device_info;
	String nonce_str;
	String sign;
	String sign_type;
	String body;
	String detail;
	String attach;
	String out_trade_no;
	String total_fee;
	String fee_type;
	String spbill_create_ip;
	String goods_tag;
	String auth_code;
	
	public String getAppid() {
		return appid;
	}
	
	@XmlElement(name="appid")
	public void setAppid(String appid) {
		this.appid = appid;
	}
	
	public String getSub_appid() {
		return sub_appid;
	}
	
	@XmlElement(name="sub_appid")
	public void setSub_appid(String sub_appid) {
		this.sub_appid = sub_appid;
	}
	
	public String getMch_id() {
		return mch_id;
	}
	
	@XmlElement(name="mch_id")
	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}
	
	public String getSub_mch_id() {
		return sub_mch_id;
	}
	
	@XmlElement(name="sub_mch_id")
	public void setSub_mch_id(String sub_mch_id) {
		this.sub_mch_id = sub_mch_id;
	}
	
	public String getDevice_info() {
		return device_info;
	}
	
	@XmlElement(name="device_info")
	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}
	
	public String getNonce_str() {
		return nonce_str;
	}
	
	@XmlElement(name="nonce_str")
	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}
	
	public String getSign() {
		return sign;
	}
	
	@XmlElement(name="sign")
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	public String getSign_type() {
		return sign_type;
	}
	
	@XmlElement(name="sign_type")
	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}
	
	public String getBody() {
		return body;
	}
	
	@XmlElement(name="body")
	public void setBody(String body) {
		this.body = body;
	}
	
	public String getDetail() {
		return detail;
	}
	
	@XmlElement(name="detail")
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public String getAttach() {
		return attach;
	}
	
	@XmlElement(name="attach")
	public void setAttach(String attach) {
		this.attach = attach;
	}
	
	public String getOut_trade_no() {
		return out_trade_no;
	}
	
	@XmlElement(name="out_trade_no")
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	
	public String getTotal_fee() {
		return total_fee;
	}
	
	@XmlElement(name="total_fee")
	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}
	
	public String getFee_type() {
		return fee_type;
	}
	
	@XmlElement(name="fee_type")
	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}
	
	public String getSpbill_create_ip() {
		return spbill_create_ip;
	}
	
	@XmlElement(name="spbill_create_ip")
	public void setSpbill_create_ip(String spbill_create_ip) {
		this.spbill_create_ip = spbill_create_ip;
	}
	
	public String getGoods_tag() {
		return goods_tag;
	}
	
	@XmlElement(name="goods_tag")
	public void setGoods_tag(String goods_tag) {
		this.goods_tag = goods_tag;
	}
	
	public String getAuth_code() {
		return auth_code;
	}
	
	@XmlElement(name="auth_code")
	public void setAuth_code(String auth_code) {
		this.auth_code = auth_code;
	}
	
}