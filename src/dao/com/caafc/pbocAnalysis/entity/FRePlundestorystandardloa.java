package com.caafc.pbocAnalysis.entity;

// Generated 2016-11-15 16:17:32 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * FRePlundestorystandardloa generated by hbm2java
 */
public class FRePlundestorystandardloa implements java.io.Serializable {

	private String reportNo;
	private Long accountcount;
	private Long financecorpcount;
	private Long financeorgcount;
	private BigDecimal creditlimit;
	private BigDecimal maxcreditlimitperorg;
	private BigDecimal mincreditlimitperorg;
	private BigDecimal usedcreditlimit;
	private BigDecimal latest6monthusedavgamount;

	public FRePlundestorystandardloa() {
	}

	public FRePlundestorystandardloa(String reportNo) {
		this.reportNo = reportNo;
	}

	public FRePlundestorystandardloa(String reportNo, Long accountcount,
			Long financecorpcount, Long financeorgcount,
			BigDecimal creditlimit, BigDecimal maxcreditlimitperorg,
			BigDecimal mincreditlimitperorg, BigDecimal usedcreditlimit,
			BigDecimal latest6monthusedavgamount) {
		this.reportNo = reportNo;
		this.accountcount = accountcount;
		this.financecorpcount = financecorpcount;
		this.financeorgcount = financeorgcount;
		this.creditlimit = creditlimit;
		this.maxcreditlimitperorg = maxcreditlimitperorg;
		this.mincreditlimitperorg = mincreditlimitperorg;
		this.usedcreditlimit = usedcreditlimit;
		this.latest6monthusedavgamount = latest6monthusedavgamount;
	}

	public String getReportNo() {
		return this.reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public Long getAccountcount() {
		return this.accountcount;
	}

	public void setAccountcount(Long accountcount) {
		this.accountcount = accountcount;
	}

	public Long getFinancecorpcount() {
		return this.financecorpcount;
	}

	public void setFinancecorpcount(Long financecorpcount) {
		this.financecorpcount = financecorpcount;
	}

	public Long getFinanceorgcount() {
		return this.financeorgcount;
	}

	public void setFinanceorgcount(Long financeorgcount) {
		this.financeorgcount = financeorgcount;
	}

	public BigDecimal getCreditlimit() {
		return this.creditlimit;
	}

	public void setCreditlimit(BigDecimal creditlimit) {
		this.creditlimit = creditlimit;
	}

	public BigDecimal getMaxcreditlimitperorg() {
		return this.maxcreditlimitperorg;
	}

	public void setMaxcreditlimitperorg(BigDecimal maxcreditlimitperorg) {
		this.maxcreditlimitperorg = maxcreditlimitperorg;
	}

	public BigDecimal getMincreditlimitperorg() {
		return this.mincreditlimitperorg;
	}

	public void setMincreditlimitperorg(BigDecimal mincreditlimitperorg) {
		this.mincreditlimitperorg = mincreditlimitperorg;
	}

	public BigDecimal getUsedcreditlimit() {
		return this.usedcreditlimit;
	}

	public void setUsedcreditlimit(BigDecimal usedcreditlimit) {
		this.usedcreditlimit = usedcreditlimit;
	}

	public BigDecimal getLatest6monthusedavgamount() {
		return this.latest6monthusedavgamount;
	}

	public void setLatest6monthusedavgamount(
			BigDecimal latest6monthusedavgamount) {
		this.latest6monthusedavgamount = latest6monthusedavgamount;
	}

}
