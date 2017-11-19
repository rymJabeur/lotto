package com.lotto.model;

import java.util.ArrayList;
import java.util.List;

public class LottoList {

	private List<Integer> numeros;
	private Integer tailleList;
	private Integer min;
	private Integer max;

	public LottoList(Integer taille, Integer min, Integer max){
		this.tailleList = taille;
		this.min = min;
		this.max = max;
		numeros = new ArrayList<>();
		while (numeros.size() < taille) {
			Integer x = (int) (min + (Math.random() * (max - min)));
			if (!numeros.contains(x)) {
				numeros.add(x);
			}
		}
	}
	public LottoList(Integer taille, Integer min, Integer max, List<Integer> listExistante){
		this.tailleList = taille;
		this.min = min;
		this.max = max;
		numeros = new ArrayList<>();
		while (numeros.size() < taille) {
			Integer x = (int) (min + (Math.random() * (max - min)));
			if (!numeros.contains(x) && !listExistante.contains(x)) {
				numeros.add(x);
			}
		}
	}
	
	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}

	public Integer getTailleList() {
		return tailleList;
	}

	public void setTailleList(Integer tailleList) {
		this.tailleList = tailleList;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

}
