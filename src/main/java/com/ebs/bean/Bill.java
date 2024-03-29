package com.ebs.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tbl_bill")
public class Bill {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bill_no")
	private long billNo;
	
	@Column(name="electroboard_id")
	private long electroboardId;
	
	@Column(name="amount")
	private long amount;
	
	@Column(name="bill_date")
	private String billDate;
	
	@Column(name="bill_status")
	private String billStatus;
	
	@Column(name="account_no")
	private long accountNo;

	public long getBillNo() {
		return billNo;
	}

	public void setBillNo(long billNo) {
		this.billNo = billNo;
	}

	public long getElectroboardId() {
		return electroboardId;
	}

	public void setElectroboardId(long electroboardId) {
		this.electroboardId = electroboardId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", electroboardId=" + electroboardId + ", amount=" + amount + ", billDate="
				+ billDate + ", billStatus=" + billStatus + ", accountNo=" + accountNo + "]";
	}

	public Bill(long billNo, long electroboardId, long amount, String billDate, String billStatus, long accountNo) {
		super();
		this.billNo = billNo;
		this.electroboardId = electroboardId;
		this.amount = amount;
		this.billDate = billDate;
		this.billStatus = billStatus;
		this.accountNo = accountNo;
	}

	public Bill() {
		super();
	}
	
	

	}
