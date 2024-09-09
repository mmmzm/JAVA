package com.pcwk.ehr.ed11;

import com.pcwk.ehr.cmn.DTO;

public class MemberDTO extends DTO {

	private String memberId;
	private String name;
	private String passwd;
	private String email;
	private String cellPhone;
	private String regDate;
	private String regId;
	 
	public MemberDTO() {
		super();
	}
	public MemberDTO(String memberId, String name, String passwd, String email, String cellPhone, String regDate,
			String regId) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.passwd = passwd;
		this.email = email;
		this.cellPhone = cellPhone;
		this.regDate = regDate;
		this.regId = regId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", name=" + name + ", passwd=" + passwd + ", email=" + email
				+ ", cellPhone=" + cellPhone + ", regDate=" + regDate + ", regId=" + regId + "]";
	}
	
	
	
}
