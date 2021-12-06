package entity;

import java.util.Date;

public class Computer {
	private Integer comId;
	private String comName;
	private String producer;
	private Integer yearMaking;
	private Date expireDate;
	private String configuration;
	private Double price;
	public Computer() {
		super();
	}
	public Computer(Integer comId, String comName, String producer, Integer yearMaking, Date expireDate,
			String configuration, Double price) {
		super();
		this.comId = comId;
		this.comName = comName;
		this.producer = producer;
		this.yearMaking = yearMaking;
		this.expireDate = expireDate;
		this.configuration = configuration;
		this.price = price;
	}
	public Integer getComId() {
		return comId;
	}
	public void setComId(Integer comId) {
		this.comId = comId;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public Integer getYearMaking() {
		return yearMaking;
	}
	public void setYearMaking(Integer yearMaking) {
		this.yearMaking = yearMaking;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
