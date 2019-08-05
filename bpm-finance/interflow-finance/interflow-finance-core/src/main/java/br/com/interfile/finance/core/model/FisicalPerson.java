package br.com.interfile.finance.core.model;

import java.io.Serializable;
import java.util.List;

import br.com.interfile.interflow.core.model.Person;

public class FisicalPerson extends Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<BankAccount> accounts;

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

}
