package com.projet.gestionBudget.model.ws.required.vo;

import java.util.List;



public class BudgetDepartementVo{
	
	private Long id;
	private String refBudget;
	private String reference;
	private String refDepartement;
	private String montantInvestisement;
	private String montantFonctionement;
	private String montantInvestisementRestant;
	private String montantFonctionementRestant;
	private String montantTotal;
	private List<BudgetDepartementCompteComptableVo> budgetDepartementCompteComptableVo;
	public BudgetDepartementVo() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRefBudget() {
		return refBudget;
	}

	public void setRefBudget(String refBudget) {
		this.refBudget = refBudget;
	}

	public String getRefDepartement() {
		return refDepartement;
	}

	public void setRefDepartement(String refDepartement) {
		this.refDepartement = refDepartement;
	}

	public String getMontantInvestisement() {
		return montantInvestisement;
	}

	public void setMontantInvestisement(String montantInvestisement) {
		this.montantInvestisement = montantInvestisement;
	}

	public String getMontantFonctionement() {
		return montantFonctionement;
	}

	public void setMontantFonctionement(String montantFonctionement) {
		this.montantFonctionement = montantFonctionement;
	}

	public String getMontantInvestisementRestant() {
		return montantInvestisementRestant;
	}

	public void setMontantInvestisementRestant(String montantInvestisementRestant) {
		this.montantInvestisementRestant = montantInvestisementRestant;
	}

	public String getMontantFonctionementRestant() {
		return montantFonctionementRestant;
	}

	public void setMontantFonctionementRestant(String montantFonctionementRestant) {
		this.montantFonctionementRestant = montantFonctionementRestant;
	}

	public String getMontantTotal() {
		return montantTotal;
	}

	public void setMontantTotal(String montantTotal) {
		this.montantTotal = montantTotal;
	}

	public List<BudgetDepartementCompteComptableVo> getBudgetDepartementCompteComptableVo() {
		return budgetDepartementCompteComptableVo;
	}

	public void setBudgetDepartementCompteComptableVo(
			List<BudgetDepartementCompteComptableVo> budgetDepartementCompteComptableVo) {
		this.budgetDepartementCompteComptableVo = budgetDepartementCompteComptableVo;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
}