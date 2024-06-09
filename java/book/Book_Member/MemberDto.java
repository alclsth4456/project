package Book_Member;

public class MemberDto {

	private String memberName;
	private String memberPhone;
	private int charge;
	private String memberId;
	private int bookNo;
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "MemberDto [memberName=" + memberName + ", memberPhone=" + memberPhone + ", charge=" + charge
				+ ", memberId=" + memberId + "]";
	}
	public MemberDto(String memberName, String memberPhone,String memberId, int charge ) {
		super();
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.charge = charge;
		this.memberId = memberId;
	}
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}
	
}
