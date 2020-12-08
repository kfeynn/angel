package com.grand.springcloud.entity.tiptop;

import java.io.Serializable;

public class PO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 采购订单号 */
	private String pmm01;
	/** 项次 */
	private int pmn02;
	/** 采购日期 */
	private String pmm04;
	/** 采购员工号 */
	private String pmm12;
	/** 采购员姓名 */
	private String gen02;
	/** 料件编号 */
	private String pmn04;
	/** 品名 */
	private String pmn041;
	/** 规格 */
	private String ima021;
	/** 版本 */
	private String ima05;
	/** 图号 */
	private String ima09;
	/** 单价 */
	private double pmn31;
	/** 交货日期 */
	private String pmn33;
	/** 单位 */
	private String pmn07;
	/** 计价单位 */
	private String pmn86;
	/** 采购量 */
	private double pmn20;
	/** 计价数量 */
	private double pmn87;
	/** 可打印数量 */
	private double wdve;
	/** 待交货量 */
	private double wdve1;
	/** 已收量 */
	private double pmn50;
	/** 验退量 */
	private double pmn55;
	/** 退货换货量 */
	private double pmn58;
	/** 订单明细总数 */
	//private int total;
	/** 备注 */
	private String pmnud01;
	/** 状态 */
	private String tc_pmb14;
	
	private String pmm09;
	
    private String pmmud08; //香港po号
	

	public String getPmmud08() {
		return pmmud08;
	}
	public void setPmmud08(String pmmud08) {
		this.pmmud08 = pmmud08;
	}
	

	public String getPmm01() {
		return pmm01;
	}
	public void setPmm01(String pmm01) {
		this.pmm01 = pmm01;
	}
	public int getPmn02() {
		return pmn02;
	}
	public void setPmn02(int pmn02) {
		this.pmn02 = pmn02;
	}
	public String getPmm04() {
		return pmm04;
	}
	public void setPmm04(String pmm04) {
		if(pmm04 != null && !"".equals(pmm04) && pmm04.length() > 10)
			this.pmm04 = pmm04.substring(0, 10);
		else
			this.pmm04 = pmm04;
	}
	public String getPmm12() {
		return pmm12;
	}
	public void setPmm12(String pmm12) {
		this.pmm12 = pmm12;
	}
	public String getGen02() {
		return gen02;
	}
	public void setGen02(String gen02) {
		this.gen02 = gen02;
	}
	public String getPmn04() {
		return pmn04;
	}
	public void setPmn04(String pmn04) {
		this.pmn04 = pmn04;
	}
	public String getPmn041() {
		return pmn041;
	}
	public void setPmn041(String pmn041) {
		this.pmn041 = pmn041;
	}
	public String getIma021() {
		return ima021;
	}
	public void setIma021(String ima021) {
		this.ima021 = ima021;
	}
	
	public String getIma05() {
		return ima05;
	}
	public void setIma05(String ima05) {
		this.ima05 = ima05;
	}
	public String getIma09() {
		return ima09;
	}
	public void setIma09(String ima09) {
		this.ima09 = ima09;
	}
	public double getPmn31() {
		return pmn31;
	}
	public void setPmn31(double pmn31) {
		this.pmn31 = pmn31;
	}
	public String getPmn33() {
		return pmn33;
	}
	public void setPmn33(String pmn33) {
		if(pmn33 != null && !"".equals(pmn33) && pmn33.length() > 10)
			this.pmn33 = pmn33.substring(0, 10);
		else
			this.pmn33 = pmn33;
	}
	public String getPmn07() {
		return pmn07;
	}
	public void setPmn07(String pmn07) {
		this.pmn07 = pmn07;
	}
	public String getPmn86() {
		return pmn86;
	}
	public void setPmn86(String pmn86) {
		this.pmn86 = pmn86;
	}
	public double getPmn20() {
		return pmn20;
	}
	public void setPmn20(double pmn20) {
		this.pmn20 = pmn20;
	}
	public double getPmn87() {
		return pmn87;
	}
	public void setPmn87(double pmn87) {
		this.pmn87 = pmn87;
	}
	public double getWdve() {
		return wdve;
	}
	public void setWdve(double wdve) {
		this.wdve = wdve;
	}
	
	public double getWdve1() {
		return wdve1;
	}
	public void setWdve1(double wdve1) {
		this.wdve1 = wdve1;
	}
	
	public double getPmn50() {
		return pmn50;
	}
	public void setPmn50(double pmn50) {
		this.pmn50 = pmn50;
	}
	public double getPmn55() {
		return pmn55;
	}
	public void setPmn55(double pmn55) {
		this.pmn55 = pmn55;
	}
	public double getPmn58() {
		return pmn58;
	}
	public void setPmn58(double pmn58) {
		this.pmn58 = pmn58;
	}
	public String getPmnud01() {
		return pmnud01;
	}
	public void setPmnud01(String pmnud01) {
		this.pmnud01 = pmnud01;
	}
	public String getTc_pmb14() {
		return tc_pmb14;
	}
	public void setTc_pmb14(String tc_pmb14) {
		this.tc_pmb14 = tc_pmb14;
	}
	
	public String getPmm09() {
		return pmm09;
	}
	public void setPmm09(String pmm09) {
		this.pmm09 = pmm09;
	}
	
	public PO(String pmm01, int pmn02, String pmm04, String pmm12,
              String gen02, String pmn04, String pmn041, String ima021,
              String ima05, String ima09, double pmn31, String pmn33,
              String pmn07, String pmn86, double pmn20, double pmn87,
              double wdve, double wdve1, double pmn50, double pmn55, double pmn58,
              String pmnud01, String tc_pmb14, String pmm09, String pmmud08) {
		super();
		this.pmm01 = pmm01;
		this.pmn02 = pmn02;
		this.pmm04 = pmm04;
		this.pmm12 = pmm12;
		this.gen02 = gen02;
		this.pmn04 = pmn04;
		this.pmn041 = pmn041;
		this.ima021 = ima021;
		this.ima05 = ima05;
		this.ima09 = ima09;
		this.pmn31 = pmn31;
		this.pmn33 = pmn33;
		this.pmn07 = pmn07;
		this.pmn86 = pmn86;
		this.pmn20 = pmn20;
		this.pmn87 = pmn87;
		this.wdve = wdve;
		this.wdve1 = wdve1;
		this.pmn50 = pmn50;
		this.pmn55 = pmn55;
		this.pmn58 = pmn58;
		this.pmnud01 = pmnud01;
		this.tc_pmb14 = tc_pmb14;
		this.pmm09 = pmm09;
		this.pmmud08 = pmmud08;
	}
	public PO() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
