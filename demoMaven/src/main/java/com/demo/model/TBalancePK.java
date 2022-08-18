package com.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TBalancePK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="KIJUN_YM")
    private String kijunYm;
    @Column(name="TOROKU_YMD")
    private String torokuYmd;
    @Column(name="NO")
    private Integer no;

	public String getKijunYm() {
		return kijunYm;
	}
	public void setKijunYm(String kijunYm) {
		this.kijunYm = kijunYm;
	}
	public String getTorokuYmd() {
		return torokuYmd;
	}
	public void setTorokuYmd(String torokuYmd) {
		this.torokuYmd = torokuYmd;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
}