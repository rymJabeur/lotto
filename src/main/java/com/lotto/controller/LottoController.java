package com.lotto.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lotto.model.LottoResult;
import com.lotto.services.LottoService;

@Controller
@Scope("session")
public class LottoController {

	private static Logger logger = Logger.getLogger(LottoController.class);

	@Autowired
	LottoService lottoService;

	private LottoResult resultatLotto ;



	public void jouerAuLottoAction() {
		try {
			resultatLotto = lottoService.jouerLotto();
		} catch (Exception e) {
			logger.error("Une erreur est survenue : " + e.getMessage());
		}
	}

	public LottoResult getResultatLotto() {
		return resultatLotto;
	}

	public void setResultatLotto(LottoResult resultatLotto) {
		this.resultatLotto = resultatLotto;
	}

}
