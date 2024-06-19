package com;

public class Menu {
	
	private int ram;
	private int lcd;
	private int mouse;
	private int sum;
	
	public Menu(int ram, int lcd, int mouse) {
		this.ram = ram;
		this.lcd = lcd;
		this.mouse = mouse;
		
		sum=ram*1280+lcd*4999+mouse*799;
	}

	public int getSum() {
		return sum;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getLcd() {
		return lcd;
	}

	public void setLcd(int lcd) {
		this.lcd = lcd;
	}

	public int getMouse() {
		return mouse;
	}

	public void setMouse(int mouse) {
		this.mouse = mouse;
	}
	
	String show()
	{
		return "\n\tLCD："+getLcd()+" X 4999 = "+(getLcd()*4999)+"元"+
				"\n\tRAM："+getRam()+" X 1280 = "+(getRam()*1280)+"元"+
				"\n\tMOUSE："+getMouse()+" X 799 = "+(getMouse()*799)+"元"+
				"\n\n\t總金額："+getSum()+"元";
	}
	
	String discount()
	{
		return "\n\tLCD："+getLcd()+" X 4999 = "+(getLcd()*4999)+"元"+
				"\n\tRAM："+getRam()+" X 1280 = "+(getRam()*1280)+"元"+
				"\n\tMOUSE："+getMouse()+" X 799 = "+(getMouse()*799)+"元"+
				"\n\n\t總金額："+getSum()+"元"+" X 會員折扣95折"+
				"\n\t會員價："+(int)(getSum()*0.95)+"元";
	}

}
