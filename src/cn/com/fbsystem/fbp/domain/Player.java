package cn.com.fbsystem.fbp.domain;

public class Player {
	
	
	private String pid;
	private String pname;
	private int page;
	private String pcountry;
	private String pclub;
	private String pimage;
	private String pposi;
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}
	public String getPclub() {
		return pclub;
	}
	public void setPclub(String pclub) {
		this.pclub = pclub;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public String getPposi() {
		return pposi;
	}
	public void setPposi(String pposi) {
		this.pposi = pposi;
	}
	
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", page=" + page
				+ ", pcountry=" + pcountry + ", pclub=" + pclub + ", pimage="
				+ pimage + ", pposi=" + pposi + "]";
	}
	
	
}
