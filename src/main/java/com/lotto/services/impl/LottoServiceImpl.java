package com.lotto.services.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lotto.model.LottoList;
import com.lotto.model.LottoResult;
import com.lotto.services.LottoService;

@Component
public class LottoServiceImpl implements LottoService{

	@Override
	public LottoResult jouerLotto() {
		LottoResult result = new LottoResult();
		List<Integer> firstList = (new LottoList(5,0,50)).getNumeros();
		List<Integer> secondList = (new LottoList(5,0,50, firstList)).getNumeros();
		List<Integer> thirdList = (new LottoList(2,0,5)).getNumeros();
	
		result.setFirstTirage(convertToString(firstList, " "));
		result.setSecondTirage(convertToString(secondList, " "));
		result.setThirdTirage(convertToString(thirdList, " "));

		return result;
	}
	
	private String convertToString(List<Integer> list, String separateur){
		StringBuilder result = new StringBuilder();
		for (Integer i : list){
			if(result.length() > 0){
				result.append(separateur);
			}
			result.append(i);
		}
		
		return result.toString();
	}

}
