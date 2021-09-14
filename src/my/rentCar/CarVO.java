package my.rentCar;

import java.io.Serializable;

public class CarVO  implements Serializable{
	private int carIdx;
	private int carNum;
	private String carName;
	private String loc;
	private String carInfo;
	
	public CarVO() {
		
	}
	
	public CarVO(int carIdx, int carNum, String carName, String loc, String carInfo) {
		super();
		this.carIdx=carIdx;
		this.carNum=carNum;
		this.carName=carName;
		this.loc=loc;
		this.carInfo=carInfo;
	}

	public int getCarIdx() {
		return carIdx;
	}

	public void setCarIdx(int carIdx) {
		this.carIdx = carIdx;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

}
