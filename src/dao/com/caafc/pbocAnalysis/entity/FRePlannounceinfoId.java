package com.caafc.pbocAnalysis.entity;

// Generated 2016-11-15 16:17:32 by Hibernate Tools 3.4.0.CR1

/**
 * FRePlannounceinfoId generated by hbm2java
 */
public class FRePlannounceinfoId implements java.io.Serializable {

	private String reportNo;
	private int serialNo;
	private String uplevel;
	private int idenNo;

	public FRePlannounceinfoId() {
	}

	public FRePlannounceinfoId(String reportNo, int serialNo, String uplevel,
			int idenNo) {
		this.reportNo = reportNo;
		this.serialNo = serialNo;
		this.uplevel = uplevel;
		this.idenNo = idenNo;
	}

	public String getReportNo() {
		return this.reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public int getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getUplevel() {
		return this.uplevel;
	}

	public void setUplevel(String uplevel) {
		this.uplevel = uplevel;
	}

	public int getIdenNo() {
		return this.idenNo;
	}

	public void setIdenNo(int idenNo) {
		this.idenNo = idenNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FRePlannounceinfoId))
			return false;
		FRePlannounceinfoId castOther = (FRePlannounceinfoId) other;

		return ((this.getReportNo() == castOther.getReportNo()) || (this
				.getReportNo() != null && castOther.getReportNo() != null && this
				.getReportNo().equals(castOther.getReportNo())))
				&& (this.getSerialNo() == castOther.getSerialNo())
				&& ((this.getUplevel() == castOther.getUplevel()) || (this
						.getUplevel() != null && castOther.getUplevel() != null && this
						.getUplevel().equals(castOther.getUplevel())))
				&& (this.getIdenNo() == castOther.getIdenNo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getReportNo() == null ? 0 : this.getReportNo().hashCode());
		result = 37 * result + this.getSerialNo();
		result = 37 * result
				+ (getUplevel() == null ? 0 : this.getUplevel().hashCode());
		result = 37 * result + this.getIdenNo();
		return result;
	}

}
