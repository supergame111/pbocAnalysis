package com.caafc.pbocAnalysis.entity;

// Generated 2016-11-15 16:17:32 by Hibernate Tools 3.4.0.CR1

/**
 * FRePlrecordsummary generated by hbm2java
 */
public class FRePlrecordsummary implements java.io.Serializable {

	private FRePlrecordsummaryId id;
	private String queryreason;
	private Long sum;
	private short recordNo;

	public FRePlrecordsummary() {
	}

	public FRePlrecordsummary(FRePlrecordsummaryId id, short recordNo) {
		this.id = id;
		this.recordNo = recordNo;
	}

	public FRePlrecordsummary(FRePlrecordsummaryId id, String queryreason,
			Long sum, short recordNo) {
		this.id = id;
		this.queryreason = queryreason;
		this.sum = sum;
		this.recordNo = recordNo;
	}

	public FRePlrecordsummaryId getId() {
		return this.id;
	}

	public void setId(FRePlrecordsummaryId id) {
		this.id = id;
	}

	public String getQueryreason() {
		return this.queryreason;
	}

	public void setQueryreason(String queryreason) {
		this.queryreason = queryreason;
	}

	public Long getSum() {
		return this.sum;
	}

	public void setSum(Long sum) {
		this.sum = sum;
	}

	public short getRecordNo() {
		return this.recordNo;
	}

	public void setRecordNo(short recordNo) {
		this.recordNo = recordNo;
	}

}