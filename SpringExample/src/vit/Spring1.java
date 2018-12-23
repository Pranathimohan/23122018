package vit;

public class Spring1 {
	
	public Spring1(String msg)
	{
		this.msg=msg;
		
	}
	private String msg;
	public String getMsg() {
		System.out.println("i gave the message as " +msg);
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
