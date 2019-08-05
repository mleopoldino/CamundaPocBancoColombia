package br.com.interfile.finance.core.model;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Bank bank;
	private String agency;
	private String number;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
