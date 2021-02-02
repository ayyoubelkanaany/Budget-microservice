package com.projet.gestionBudget.model.ws.required.facade;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.projet.gestionBudget.model.ws.required.vo.BudgetDepartementVo;


@FeignClient(name="BUDGETDEPARTEMENT-SERVICE")
public interface BudgetDepartementRequiredRest {

	@RequestMapping(value = "/budgetDepartements/refBudget/{refBudget}",method = RequestMethod.GET)
     public List<BudgetDepartementVo> findByRefBudget(@PathVariable String refBudget);
	
	 @RequestMapping(value = "/budgetDepartements/refBudgetDepartement/{refBudgetDepartement}",method = RequestMethod.DELETE)
		public Long deleteByRefBudget(@PathVariable String refBudgetDepartement);

	@RequestMapping(value = "/budgetDepartements",method = RequestMethod.POST)
	public int save(@RequestBody BudgetDepartementVo budgetDepartementvo);
	
	@RequestMapping(value = "/budgetDepartements/all",method = RequestMethod.POST)
    public int save(@RequestBody List<BudgetDepartementVo> budgetDepartementVos);
	
     @RequestMapping(value = "/budgetDepartements",method = RequestMethod.PUT)
	public int updateBudgetDepartement(@RequestBody BudgetDepartementVo budgetDepartementVo);
	
	
	
     @RequestMapping(value = "/budgetDepartements",method = RequestMethod.GET)
	public List<BudgetDepartementVo> findAll();
	
	

    @RequestMapping(value = "/budgetDepartements/id/{id}",method = RequestMethod.GET)
	public BudgetDepartementVo findById(@PathVariable Long id) ;
	
	
	
    @RequestMapping(value = "/budgetDepartements/montantTotal/{montantTotal}",method = RequestMethod.GET)
	public List<BudgetDepartementVo> findByMontantTotal(@PathVariable double montantTotal);
    
	@RequestMapping(value = "/budgetDepartements/refDepartement/{refDepartement}",method = RequestMethod.GET)
     public List<BudgetDepartementVo> findByRefDepartement(@PathVariable String refDepartement);
}